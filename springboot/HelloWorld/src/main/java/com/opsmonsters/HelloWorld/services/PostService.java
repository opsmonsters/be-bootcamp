package com.opsmonsters.HelloWorld.services;

import com.opsmonsters.HelloWorld.dto.PostDto;
import com.opsmonsters.HelloWorld.dto.ResponseDto;
import com.opsmonsters.HelloWorld.models.Posts;
import com.opsmonsters.HelloWorld.models.User;
import com.opsmonsters.HelloWorld.repo.PostRepo;
import com.opsmonsters.HelloWorld.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    PostRepo postRepo;

    public ResponseDto createNewPosts(PostDto dto){
        try{
            Posts post = new Posts();
            post.setContent(dto.getPostContent());
            post.setLikes(dto.getLikes());

            Optional<User> optionalUser = userRepo.findById(dto.getUserId());
            if(optionalUser.isPresent()){
                post.setUser(optionalUser.get());
            }else{
                return new ResponseDto(404, "User Not found");
            }

            postRepo.save(post);

            return new ResponseDto(200, "Post Created");
        }catch (Exception e){
            return new ResponseDto(500, "Some Error Occurred, please contact admin");
        }
    }
}
