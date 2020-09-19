package vkhanhqui.myblog.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.Valid;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

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

    @Column(name = "reading_time")
    private String reading;

    @Column(name = "thumbnail", columnDefinition = "text")
    private String thumbnail;

    @Column(name = "views")
    @OrderBy("views ASC")
    private Long views;

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

    @ManyToOne
    @JoinColumn(name="user_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private User user;
    
}
