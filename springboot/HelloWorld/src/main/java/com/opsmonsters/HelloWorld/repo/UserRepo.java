package com.opsmonsters.HelloWorld.repo;

import com.opsmonsters.HelloWorld.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
}
