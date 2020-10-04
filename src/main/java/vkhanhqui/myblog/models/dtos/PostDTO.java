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

    private String reading;

    private String thumbnail;

    private Long views;
}
