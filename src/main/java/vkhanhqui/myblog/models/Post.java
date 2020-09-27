package vkhanhqui.myblog.models;

import lombok.*;

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
    private String reading_time;

    @Column(name = "thumbnail", columnDefinition = "text")
    private String thumbnail;

    @Column(name = "views")
    @OrderBy("views ASC")
    private Long views;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    @OrderBy("date ASC")
    private List<Comment> comments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}
