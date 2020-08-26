package vkhanhqui.myblog.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

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

    @Column(name = "images")
    private String images;

//    @Column(name = "socialnetworks")
//    private String socialnetworks;

//    @Column(name = "tags")
//    private String tags;
//
//    @Column(name = "comments")
//    private String comments;
//
//    @Column(name = "categories")
//    private String categories;
}
