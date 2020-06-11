package com.lan.sevice;

import com.lan.pojo.Post;

import java.util.List;

public interface PostService {

    List<Post> find();

    Integer getCount();

    Integer delUserById(Integer id);

    Integer addUsers(Post post);

    Integer delAllUserById(String ids);

    Integer updateUsers(Post post);

    List<Post> search(Post post);
}
