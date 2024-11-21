package com.opsmonsters.HelloWorld.controllers;

import com.opsmonsters.HelloWorld.dto.PostDto;
import com.opsmonsters.HelloWorld.models.Posts;
import com.opsmonsters.HelloWorld.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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

}
