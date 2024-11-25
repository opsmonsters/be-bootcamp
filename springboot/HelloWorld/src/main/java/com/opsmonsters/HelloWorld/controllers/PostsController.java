package com.opsmonsters.HelloWorld.controllers;

import com.opsmonsters.HelloWorld.dto.PostDto;
import com.opsmonsters.HelloWorld.models.Posts;
import com.opsmonsters.HelloWorld.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class PostsController {

    @Autowired
    PostRepo postRepo;

    @PostMapping("/posts")
    public String createNewPosts(@RequestBody PostDto requestDto){
        Posts post = new Posts();
        post.setContent(requestDto.getPostContent());
        post.setLikes(requestDto.getLikes());

        postRepo.save(post);

        return "Created";
    }

    @GetMapping("/posts")
    public List<Posts> getAllPosts(){
        List<Posts> postsList = postRepo.findAll();
        return postsList;
    }

    @GetMapping("/posts/{postId}")
    public Posts getPostById(@PathVariable int postId){
        Optional<Posts> post = postRepo.findById(postId);
        if(post.isPresent()){
            return post.get();
        }else{
            return null;
        }
    }

    @DeleteMapping("/posts/{postId}")
    public String deletePostById(@PathVariable int postId){
        postRepo.deleteById(postId);
        return "Deleted";
    }

    @PutMapping("/posts/{postId}")
    public String updatePost(@PathVariable int postId, @RequestBody PostDto requestDto){
        Optional<Posts> optionalPost = postRepo.findById(postId);
        if(optionalPost.isPresent()){
            Posts post = optionalPost.get();
            post.setLikes(requestDto.getLikes());
            post.setContent(requestDto.getPostContent());
            postRepo.save(post);
        }else{
            return "Post Not Found for given ID";
        }

        return "Updated";
    }




}
