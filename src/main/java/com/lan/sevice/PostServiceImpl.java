package com.lan.sevice;

import com.lan.mapper.PostCommentsMapper;
import com.lan.mapper.PostMapper;
import com.lan.mapper.UsersMapper;
import com.lan.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostMapper postMapper;
    @Autowired
    private PostCommentsMapper postCommentsMapper;


    public List<Post> find(Map<String,Object> map) {
        return postMapper.find(map);
    }

    public Integer getCount() {
        return postMapper.count();
    }

    public Integer delPostById(Integer id) {
       return postMapper.deleteByPrimaryKey(id);
    }

    public Integer addPost(Post users) {
        return postMapper.insert(users);
    }

    public Integer delAllUserById(String ids) {
        return null;//usersMapper.deleteByExample(ids);
    }

    public Integer updatePostBlog(Post post) {
        return postMapper.updateByPrimaryKeyWithBLOBs(post);
    }

    public Integer updatePost(Post users) {
        return postMapper.updateByPrimaryKey(users);
    }


    public List<Post> search(Post users) {
        return postMapper.search(users);
    }

    public List<Post> getAll(Integer page,Integer size) {
        PostExample example =new PostExample();
        PostExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("post_id asc limit "+page+","+size);
//相当于：select * from user where username = 'wyw' and  username is null order by username asc,email desc
        return postMapper.selectByExampleWithBLOBs(example);
    }

    public Post getPostById(Integer id) {
        return postMapper.selectByPrimaryKey(id);
    }

    public List<PostComments> getAllCommtentsByPostId(Integer id) {
        PostCommentsExample example =new PostCommentsExample();
        PostCommentsExample.Criteria criteria = example.createCriteria();
        example.createCriteria().andPostCommentsPostIdEqualTo(id);
        return postCommentsMapper.selectByExample(example);
    }
}
