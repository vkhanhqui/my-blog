package vkhanhqui.myblog.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vkhanhqui.myblog.models.entities.Comment;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {
    private Long id;

    private String creator;

    private String replyTo;

    private String content;

    private Date date;

    private Comment parent;

    private List<Comment> children;
}
