package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import vkhanhqui.myblog.models.Role;
import vkhanhqui.myblog.models.User;
import vkhanhqui.myblog.models.repositories.UserRepositories;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class UserServices {
    @Autowired
    UserRepositories userRepositories;
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    public Optional<User> getOptionalMember(String username, String password){
        return userRepositories.findByUsernameAndPassword(username,password);
    }

    public boolean isEmail(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }
    public void createMember(String username, String email, String password){
    	User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setEnabled(true);
        Role role = new Role();
        role.setAuthority("ROLE_MEMBER");
        Set<Role> roles = new HashSet<Role>();
        roles.add(role);
        user.setRoles(roles);
        user.setPassword(passwordEncoder.encode(password));
        userRepositories.save(user);
    }
    public String findSupremeRole(String username) {
    	String supremeRole = null;
    	Optional<User> optionalUser = userRepositories.findById(username);
    	if(optionalUser.isPresent()) {
    		Set<Role> roles = optionalUser.get().getRoles();
    		for(Role one : roles) {
    			if(one.getAuthority().equals("ROLE_ADMIN"))
    				supremeRole = "admin";
    			else if(one.getAuthority().equals("ROLE_MEMBER"))
    				supremeRole = "member";
    		}
    	}
    	return supremeRole;
    }
    
    public void deleteUser(String username) {
    	User user =userRepositories.findById(username).get();
    	user.getPosts().clear();
    	userRepositories.save(user);
    	userRepositories.deleteById(username);
	}
    public List<User> getAllUsersExceptCurrentUser(String username){
    	return userRepositories.findAllByUsernameNotIn(username);
    }
}
