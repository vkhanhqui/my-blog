package vkhanhqui.myblog.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {
    private Long id;

    private String title;

    private String description;

    private String content;

    private Date date;

    private String thumbnail;

    private Long views;

    private String username;

    public PostDTO(Long id, String title, String description, Date date, String thumbnail, String username){
        this.id=id;
        this.title=title;
        this.description=description;
        this.date=date;
        this.thumbnail=thumbnail;
        this.username=username;
        this.content="";
        this.views=(long) 0;
    }

    public PostDTO(Long id, String title, String thumbnail){
        this.id=id;
        this.title=title;
        this.description="";
        this.date=null;
        this.thumbnail=thumbnail;
        this.username="";
        this.content="";
        this.views=(long) 0;
    }

    public PostDTO(Long id, String title, String username, long views){
        this.id=id;
        this.title=title;
        this.description="";
        this.date=null;
        this.thumbnail="";
        this.username=username;
        this.content="";
        this.views=views;
    }

    public PostDTO(Long id, String title, String thumbnail, Date date, String username){
        this.id=id;
        this.title=title;
        this.description="";
        this.date=date;
        this.thumbnail=thumbnail;
        this.username=username;
        this.content="";
        this.views=(long) 0;
    }

    public PostDTO(Long id, String title){
        this.id=id;
        this.title=title;
        this.description="";
        this.date=null;
        this.thumbnail="";
        this.username="";
        this.content="";
        this.views=(long) 0;
    }

    public PostDTO(String title, long id, String content){
        this.id=id;
        this.title=title;
        this.description="";
        this.date=null;
        this.thumbnail="";
        this.username="";
        this.content=content;
        this.views=(long) 0;
    }
}
