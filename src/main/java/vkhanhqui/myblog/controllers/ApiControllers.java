package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vkhanhqui.myblog.services.ApiServices;

@Controller
@RequestMapping("api")
public class ApiControllers {
    @Autowired
    ApiServices apiServices;

    @GetMapping(path = "/home", produces = "text/plain; charset=utf-8")
    @ResponseBody
    public String ajaxHomeSite(@RequestParam int startingPage) {
        return apiServices.ajaxHomeSite(startingPage);
    }

    @GetMapping(path = "/list", produces = "text/plain; charset=utf-8")
    @ResponseBody
    public String ajaxListSite(@RequestParam int startingPage) {
        return apiServices.ajaxListSite(startingPage);
    }

}
