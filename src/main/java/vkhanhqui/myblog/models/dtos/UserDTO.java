package vkhanhqui.myblog.models.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vkhanhqui.myblog.models.Role;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String username;

    private String password;

    private String email;

    private boolean enabled;

    private Set<Role> roles = new HashSet<Role>();
}
