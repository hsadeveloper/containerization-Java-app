package sab.dcdemo.org.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sab.dcdemo.org.model.Post;
import sab.dcdemo.org.repository.PostRepository;


@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostRepository repository;

    public PostController(PostRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Post> findAll() {
        return repository.findAll();
    }
    
    @PostMapping
    public boolean add(@RequestBody Post post) {
    	Post p = new Post(post.getTitle(),post.getBody() );
         repository.save(p);
         return true;
    }

}
