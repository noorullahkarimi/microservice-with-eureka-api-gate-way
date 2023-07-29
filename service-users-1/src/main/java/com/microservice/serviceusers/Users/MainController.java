package com.microservice.serviceusers.Users;


import com.microservice.serviceusers.Posts.Posts;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {
    @GetMapping("/hello")
    public String index(){
        return "hello world 2";
    }

    @GetMapping("/getUsersPosts")
    @Retry(name = "mycircuit", fallbackMethod = "connectionFail")
    public Posts usersPosts(){
        ResponseEntity<Posts> getAllPosts = new RestTemplate().getForEntity(
                "http://localhost:8082/posts", Posts.class);
//        "http://localhost:8765/SERVICE-POSTS/posts", Post.class);
        return getAllPosts.getBody();
    }
    public Posts connectionFail(Throwable throwable){
        return new Posts(); // or any other fallback implementation that returns a valid Posts object
    }
}
