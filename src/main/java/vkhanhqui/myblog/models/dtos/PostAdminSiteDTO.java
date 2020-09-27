package vkhanhqui.myblog.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vkhanhqui.myblog.models.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostAdminSiteDTO {
    private Long id;

    private String title;

    private User user;
}
