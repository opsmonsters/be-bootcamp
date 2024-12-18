package com.opsmonsters.HelloWorld.controllers;

import com.opsmonsters.HelloWorld.dto.PostDto;
import com.opsmonsters.HelloWorld.dto.ResponseDto;
import com.opsmonsters.HelloWorld.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class PostsController {

    @Autowired
    PostService postService;


    @PostMapping("/posts")
    public ResponseEntity<ResponseDto> createNewPosts(@RequestBody PostDto requestDto){
        ResponseDto response = postService.createNewPosts(requestDto);
        return new ResponseEntity<ResponseDto>(response, HttpStatus.valueOf(response.statusCode));
    }

    @GetMapping("/posts")
    public ResponseEntity<ResponseDto> getAllPosts(@RequestParam("pageNumber") int pageNumber,
                                                   @RequestParam("pageSize") int pageSize
    ){
        Pageable page = PageRequest.of(pageNumber, pageSize);
        ResponseDto response = postService.getAllPosts(page);
        return new ResponseEntity<ResponseDto>(response, HttpStatus.valueOf(response.statusCode));
    }
//
//    @GetMapping("/posts/{postId}")
//    public Posts getPostById(@PathVariable int postId){
//        Optional<Posts> post = postRepo.findById(postId);
//        if(post.isPresent()){
//            return post.get();
//        }else{
//            return null;
//        }
//    }
//
//    @DeleteMapping("/posts/{postId}")
//    public String deletePostById(@PathVariable int postId){
//        postRepo.deleteById(postId);
//        return "Deleted";
//    }
//
//    @PutMapping("/posts/{postId}")
//    public String updatePost(@PathVariable int postId, @RequestBody PostDto requestDto){
//        Optional<Posts> optionalPost = postRepo.findById(postId);
//        if(optionalPost.isPresent()){
//            Posts post = optionalPost.get();
//            post.setLikes(requestDto.getLikes());
//            post.setContent(requestDto.getPostContent());
//            postRepo.save(post);
//        }else{
//            return "Post Not Found for given ID";
//        }
//
//        return "Updated";
//    }
//



}
