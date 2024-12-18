package com.opsmonsters.HelloWorld.services;

import com.opsmonsters.HelloWorld.constants.HttpConstants;
import com.opsmonsters.HelloWorld.dto.PostDto;
import com.opsmonsters.HelloWorld.dto.ResponseDto;
import com.opsmonsters.HelloWorld.models.Posts;
import com.opsmonsters.HelloWorld.models.User;
import com.opsmonsters.HelloWorld.repo.PostRepo;
import com.opsmonsters.HelloWorld.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            User user = (User) authentication.getPrincipal();
            post.setUser(user);


            postRepo.save(post);

            return new ResponseDto(200, "Post Created");
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseDto(500, "Some Error Occurred, please contact admin");
        }
    }

    public ResponseDto getAllPosts(Pageable page) {
        try{
            Page<Posts> postsList = postRepo.findAll(page);
            List<PostDto> postDtoList = new ArrayList<>();
            for(Posts post : postsList.getContent()){
                PostDto postDto = new PostDto();
                postDto.setPostContent(post.getContent());
                postDto.setId(post.getPostId());
                postDto.setLikes(post.getLikes());
                postDto.setUserFirstName(post.getUser().getFirstName());
                postDto.setUserLastName(post.getUser().getLastName());
                postDto.setUserId(post.getUser().getUserId());
                postDtoList.add(postDto);
            }

            return new ResponseDto(200,postDtoList);
        }catch (Exception e){
            return new ResponseDto(500, HttpConstants.INTERNAL_SERVER_ERROR);

        }
    }
}
