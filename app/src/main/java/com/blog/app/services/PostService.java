package com.blog.app.services;

import com.blog.app.dto.PostDto;
import com.blog.app.dto.PostResponse;
import com.blog.app.entities.Post;

import java.util.List;

public interface PostService {


    //create
    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

    //update

    PostDto updatePost(PostDto postDto, Integer postId);

    //delete
    void deletePost(Integer postId);
    //get all posts
    PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
    //get 1 post
    PostDto getPostById(Integer postId);
    //get all post by category
    List<PostDto> getPostsByCategory(Integer categoryId);
    //get all posts by user
    List<PostDto> getPostsByUser(Integer userId);
    //search posts
    List<PostDto> searchPosts(String keyword);



}
