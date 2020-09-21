package vkhanhqui.myblog.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyUploadForm {
    private CommonsMultipartFile[] fileDatas;
     
}