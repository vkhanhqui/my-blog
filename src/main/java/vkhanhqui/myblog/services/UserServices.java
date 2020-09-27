package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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

    public boolean isEmail(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    public String findSupremeRole(String username) {
        String supremeRole = null;
        Optional<User> optionalUser = userRepositories.findById(username);
        if (optionalUser.isPresent()) {
            Set<Role> roles = optionalUser.get().getRoles();
            for (Role one : roles) {
                if (one.getAuthority().equals("ROLE_ADMIN"))
                    supremeRole = "admin";
                else if (one.getAuthority().equals("ROLE_MEMBER"))
                    supremeRole = "member";
            }
        }
        return supremeRole;
    }

    public void deleteUser(String username) {
        //bug
        userRepositories.customDeletingUserByUsername(username);
    }

    public List<User> getAllUsersExceptCurrentUser(String username) {
        return userRepositories.findAllByUsernameNotIn(username);
    }

    public void createUser(String username, String email, String password, String roleName) {
        User user = new User();
        if (userRepositories.findById(username).isPresent()) {
            user = userRepositories.findById(username).get();
        } else
            user.setUsername(username);
        user.setEmail(email);
        user.setEnabled(true);
        Role role = new Role();
        role.setAuthority("ROLE_" + roleName);
        Set<Role> roles = new HashSet<Role>();
        if (user.getRoles().size() > 0)
            roles = user.getRoles();
        roles.add(role);
        user.setRoles(roles);
        user.setPassword(passwordEncoder.encode(password));
        userRepositories.save(user);
    }

    public String checkSignUp(String username, String email, String password, String passwordConfirmation, String role) {
        String error = "";
        if (username.equals("")) {
            error = "<div class=\"msg error\">\r\n" + "               <li>Username is required</li>\r\n"
                    + "           </div>";
        } else if (!isEmail(email)) {
            error = "<div class=\"msg error\">\r\n" + "               <li>Email is incorrect</li>\r\n"
                    + "           </div>";
        } else if (!password.equals(passwordConfirmation)) {
            error = "<div class=\"msg error\">\r\n" + "               <li>Password confirmation is incorrect</li>\r\n"
                    + "           </div>";
        } else {
            String success = "<div class=\"msg success\">\r\n" + "               <li>Successfully</li>\r\n"
                    + "           </div>";
            createUser(username, email, password, role);
            return success;
        }
        return error;
    }
}
