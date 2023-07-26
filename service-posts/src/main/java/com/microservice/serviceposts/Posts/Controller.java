package com.microservice.serviceposts.Posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/posts")
    public Post index(){
        return new Post(10, "all around the world in 80 days", "1000");
    }
}
