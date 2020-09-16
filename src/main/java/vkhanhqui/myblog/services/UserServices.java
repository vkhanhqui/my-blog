package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vkhanhqui.myblog.models.User;
import vkhanhqui.myblog.models.repositories.UserRepositories;

import java.util.Optional;

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
        user.setPassword(passwordEncoder.encode(password));
        userRepositories.save(user);
    }
}
