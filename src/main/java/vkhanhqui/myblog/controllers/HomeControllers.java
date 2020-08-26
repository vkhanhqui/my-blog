package vkhanhqui.myblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.repositories.PostRepositories;
import vkhanhqui.myblog.services.PostServices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/")
public class HomeControllers {
	@Autowired
	private PostRepositories postRepositories;
    @GetMapping
    public String getHomePage() {
        List list = new ArrayList<Post>();
        for(int i=1; i<=100; i++){
			list.add(new Post(i,"title","description","contentttttttt"
					,new Date(),"12 min read","/resources/homePage/images/bg_1.jpg"));
		}
        postRepositories.saveAll(list);
        return "home";
    }
}