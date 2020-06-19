package com.lan.sevice;

import com.lan.pojo.Post;
import com.lan.pojo.PostComments;
import com.lan.pojo.PostExample;

import java.util.List;
import java.util.Map;

public interface PostService {

    List<Post> find(Map<String,Object> map);

    Integer getCount();

    Integer delPostById(Integer id);

    Integer addPost(Post post);

    Integer delAllUserById(String ids);
    Integer updatePostBlog(Post post);
    Integer updatePost(Post post);

    List<Post> search(Post post);

    List<Post> getAll(Integer page,Integer size);

    Post getPostById(Integer id);

    List<PostComments> getAllCommtentsByPostId(Integer id);
}
