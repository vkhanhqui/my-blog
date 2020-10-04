package vkhanhqui.myblog.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "role")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @Column(name = "authority", columnDefinition = "VARCHAR(20) NOT NULL")
    private String authority;

    @ManyToMany(mappedBy = "roles", cascade = CascadeType.ALL)
    private List<User> user;
}
