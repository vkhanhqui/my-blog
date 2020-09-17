package vkhanhqui.myblog.models;

import lombok.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

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
    @LazyCollection(LazyCollectionOption.FALSE)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<User> user;
}
