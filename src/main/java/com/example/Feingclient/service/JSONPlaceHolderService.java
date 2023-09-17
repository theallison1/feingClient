package com.example.Feingclient.service;

import com.example.Feingclient.model.Post;

import java.util.List;

public interface JSONPlaceHolderService {

    List<Post> getPosts();

    Post getPostById(Long id);
}