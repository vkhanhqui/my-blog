package vkhanhqui.myblog.models.dtos;

import lombok.*;
import vkhanhqui.myblog.models.entities.Role;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class UserDTO {
    @NonNull
    private String username;

    private String password;

    private String email;

    private boolean enabled;

    private Set<Role> roles = new HashSet<>();

    public UserDTO(String username, String password, Set<Role> roles) {
        this.username=username;
        this.password=password;
        this.email="";
        this.enabled=true;
        this.roles=roles;
    }
}
