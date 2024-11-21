package com.opsmonsters.HelloWorld.controllers;

import com.opsmonsters.HelloWorld.dto.PostDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PostsController {
    public List<PostDto> posts = new ArrayList<>();


    @GetMapping("/posts")
    public List<PostDto> getAllPosts(){
        return this.posts;
    }

    @GetMapping("/posts/{postId}")
    public PostDto getPostById(@PathVariable int postId){
        for(PostDto post : posts){
            if(post.id == postId){
                return post;
            }
        }
        return null;
    }

    @PostMapping("/posts")
    public String createNewPost(@RequestBody PostDto requestDto){
       this.posts.add(requestDto);
       return "Post Created";
    }

    @PutMapping("/posts/{postId}")
    public String updateByPostId(@PathVariable int postId, @RequestBody PostDto reqestDto){
        for(PostDto post : posts){
            if(post.id == postId){
               post.postContent = reqestDto.postContent;
               post.likes = reqestDto.likes;
            }
        }
        return "Updated";
    }

    @DeleteMapping("/posts/{postId}")
    public String deleteByPostId(@PathVariable int postId){
        for(int i=0; i<posts.size(); i++){
            if(this.posts.get(i).id == postId){
                posts.remove(i);
            }
        }
        return "Deleted";
    }
}
