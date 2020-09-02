package vkhanhqui.myblog.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "post")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "content", columnDefinition = "text")
    private String content;

    @Column(name = "date")
    private Date date;

    @Column(name = "reading")
    private String reading;

    @Column(name = "images", columnDefinition = "text")
    private String images;

//    @ManyToMany(mappedBy = "posts", fetch = FetchType.LAZY)
//    private Set<Tag> tags = new HashSet<>();
//
//    @ManyToMany(mappedBy = "posts", fetch = FetchType.LAZY)
//    private Set<Category> categories = new HashSet<>();

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.EAGER )
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @OrderBy("date ASC")
    private List<Comment> comments;
}
