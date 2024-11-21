package com.opsmonsters.HelloWorld.repo;

import com.opsmonsters.HelloWorld.models.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends JpaRepository<Posts, Integer> {
}
