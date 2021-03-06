package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vkhanhqui.myblog.models.dtos.UserDTO;
import vkhanhqui.myblog.models.dtos.UserDetailsDTO;
import vkhanhqui.myblog.models.entities.User;
import vkhanhqui.myblog.models.repositories.UserRepositories;

@Service("userDetailsService")
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepositories userRepositories;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepositories.findById(username).get();
        UserDTO userDTO = new UserDTO(user.getUsername(),user.getPassword()
                ,user.getEmail(), user.isEnabled(),user.getRoles());
        return new UserDetailsDTO(userDTO);
    }
}
