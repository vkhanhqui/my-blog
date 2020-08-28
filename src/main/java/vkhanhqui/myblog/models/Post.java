package vkhanhqui.myblog.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
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
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "content")
    private String content;

    @Column(name = "date")
    private Date date;

    @Column(name = "reading")
    private String reading;

    @Column(name = "images", columnDefinition = "text")
    private String images;

    @Column(name = "link")
    private String link;

    @ManyToMany(mappedBy = "posts", fetch = FetchType.EAGER)
    private Set<Tag> tags = new HashSet<>();

    @ManyToMany(mappedBy = "posts", fetch = FetchType.EAGER)
    private Set<Category> categories = new HashSet<>();

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Comment> comments = new HashSet<>();
}
