package vkhanhqui.myblog.models;

import lombok.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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

    @Column(name = "reading_time")
    private String reading;

    @Column(name = "avatar", columnDefinition = "text")
    private String avatar;

    @Column(name = "views")
    @OrderBy("views ASC")
    private Long views;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "post_tag",
            joinColumns = @JoinColumn(name = "post_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    @LazyCollection(LazyCollectionOption.FALSE)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Tag> tags;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Category category;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @OrderBy("date ASC")
    private List<Comment> comments;
}
