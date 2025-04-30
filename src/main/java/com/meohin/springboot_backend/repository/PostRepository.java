package com.meohin.springboot_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meohin.springboot_backend.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}
