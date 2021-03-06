package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;
import vkhanhqui.myblog.models.entities.MyUploadForm;
import vkhanhqui.myblog.services.PostServices;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("file")
@SessionAttributes({"thumbnail"})
public class MyFileUploadController {
    @Autowired
    PostServices postServices;

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        Object target = dataBinder.getTarget();
        if (target == null) {
            return;
        }
        if (target.getClass() == MyUploadForm.class) {
            dataBinder.registerCustomEditor(byte[].class, new ByteArrayMultipartFileEditor());
        }
    }

    @PostMapping("uploadFile")
    public String uploadFileToCreatePost(@ModelAttribute("myUploadForm") MyUploadForm myUploadForm
            , ModelMap modelMap
            , HttpSession httpSession) {
        String thumbnail = postServices.uploadFile(myUploadForm);
        modelMap.addAttribute("thumbnail", thumbnail);
        return "redirect:/"
                +httpSession.getAttribute("role")
                +"/posts/create";
    }

    @PostMapping("{post_id}/uploadFile")
    public String uploadFileToEditPost( @PathVariable String post_id
            ,@ModelAttribute("myUploadForm") MyUploadForm myUploadForm
            , ModelMap modelMap
            , HttpSession httpSession) {
        String thumbnail = postServices.uploadFile(myUploadForm);
        modelMap.addAttribute("thumbnail", thumbnail);
        return "redirect:/"+httpSession.getAttribute("role")
                +"/posts/edit/"
                +post_id;
    }
}
