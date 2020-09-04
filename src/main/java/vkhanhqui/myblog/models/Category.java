package vkhanhqui.myblog.models;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//@Table(name = "category")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Category {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
//
//    @Column(name = "name")
//    private String name;
//
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "category_post",
//            joinColumns = @JoinColumn(name = "category_id"),
//            inverseJoinColumns = @JoinColumn(name = "post_id")
//    )
//    private Set<Post> posts = new HashSet<>();
//}
