package vkhanhqui.myblog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vkhanhqui.myblog.models.Post;
import vkhanhqui.myblog.models.Tag;
import vkhanhqui.myblog.models.repositories.TagRepositories;

import java.util.List;

@Transactional
@Service
public class TagServices {
    @Autowired
    TagRepositories tagRepositories;

    public List<Post> getPosts(String nameTag) {
        Tag tag = tagRepositories.findByName(nameTag);
        return tag.getPosts();
    }
}
