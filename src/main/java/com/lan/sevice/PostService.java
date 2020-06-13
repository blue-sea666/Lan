package com.lan.sevice;

import com.lan.pojo.Post;

import java.util.List;
import java.util.Map;

public interface PostService {

    List<Post> find(Map<String,Object> map);

    Integer getCount();

    Integer delPostById(Integer id);

    Integer addPost(Post post);

    Integer delAllUserById(String ids);

    Integer updatePost(Post post);

    List<Post> search(Post post);
}
