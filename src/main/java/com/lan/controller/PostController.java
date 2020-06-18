package com.lan.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lan.pojo.Post;
import com.lan.pojo.Users;
import com.lan.sevice.PostService;
import com.lan.sevice.UsersService;
import com.lan.util.JsonUtils;
import com.lan.util.ListObject;
import com.lan.util.ResponseUtils;
import com.lan.util.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;

    //获取表格数据
    @RequestMapping(value = "/getposts", method = RequestMethod.GET)
    @ResponseBody
    public Object findById(HttpServletRequest request, HttpServletResponse response,Integer page,Integer limit) throws JsonProcessingException {
        //获取从第几条数据开始
        Integer pstart=(page -1) * limit;
       /* Map map=new HashMap();
        map.put("page",pstart);
        map.put("size",limit);
        //获取所有用户存入list中
        List<Post> list = postService.find(map);*/
        List<Post> list = postService.getAll(pstart,limit);
        //获取用户总数
        Integer cout = postService.getCount();
        //实例化listobject对象
        ListObject listObject = new ListObject();
        //给listobject对象的属性赋值
        listObject.setData(list);
        listObject.setCode(StatusCode.CODE_SUCCESS);
        listObject.setMsg("访问成功");
        listObject.setCount(cout);
        System.out.println(listObject.getData().toString());
        return listObject;
        //System.out.println(listObject.toString());
        //将listobject转成json格式并响应到客户端
        //ResponseUtils.renderJson(response, JsonUtils.toJson(listObject));

    }
    //获取单条数据
    @RequestMapping(value = "/getpostbyid", method = RequestMethod.GET)
    @ResponseBody
    public Object findPostById(HttpServletRequest request, HttpServletResponse response,@RequestParam("id")Integer id) throws JsonProcessingException {
        Post post = postService.getPostById(id);
        //实例化listobject对象
        ListObject listObject = new ListObject();
        //给listobject对象的属性赋值
        listObject.setDatas(post);
        listObject.setCode(StatusCode.CODE_SUCCESS);
        listObject.setMsg("访问成功");
        return listObject;
        //System.out.println(listObject.toString());
        //将listobject转成json格式并响应到客户端
        //ResponseUtils.renderJson(response, JsonUtils.toJson(listObject));

    }
    //删除
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public void delUserById(HttpServletResponse response, @RequestParam("pid") Integer id) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        //执行删除操作
        Integer integer = postService.delPostById(id);
        String code = "";
        if (integer > 0) {//删除成功
            code = "1";
        } else {//删除失败
            code = "0";
        }
        ResponseUtils.renderText(response, code);
    }

    //添加
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void add(HttpServletResponse response, Post post) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        post.setPostBrowse(0);
        post.setPostAddtime(new Date());
        System.out.println(post.getPostLabel1Id());
        Integer integer = postService.addPost(post);
        ResponseUtils.renderText(response, integer.toString());

    }

    @RequestMapping(value = "/deleteall", method = RequestMethod.POST)
    public void delAllUsersByIds(HttpServletResponse response, Users u) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        System.out.println("ids");
        System.out.println("用户id" + u.toString());
        System.out.println("6666");
        List<Users> users = new ArrayList<Users>();
        //users.add(u);
        StringBuilder sb = new StringBuilder();
        for (Users user : users) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(user.getUserId());
        }
        // 将StringBuilder转换成String
        String ids = new String(sb);
        System.out.println(ids);
        //执行删除操作
        Integer integer = 1;//usersService.delAllUserById(ids);
        String code = "";
        if (integer > 0) {//删除成功
            code = "1";
        } else {//删除失败
            code = "0";
        }
        ResponseUtils.renderText(response, code);
    }

    //修改
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void update(HttpServletResponse response, Post post) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        Post post1=postService.getPostById(post.getPostId());
        if (post.getPostAddtime()==null){
            post.setPostAddtime(post1.getPostAddtime());
        }
        if (post.getPostBrowse()==null){
            post.setPostBrowse(post1.getPostBrowse());
        }
        post.setPostUpdatetime(new Date());
        Integer integer = postService.updatePostBlog(post);
        String code = "";
        if (integer > 0) {//添加成功
            code = "1";
        } else {//添加失败
            code = "0";
        }
        ResponseUtils.renderText(response, code);

    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public void search(HttpServletResponse response, Post post) {
        List<Post> list = postService.search(post);
        //获取用户总数
        Integer cout = postService.getCount();
        //实例化listobject对象
        ListObject listObject = new ListObject();
        //给listobject对象的属性赋值
        listObject.setData(list);
        listObject.setCode(StatusCode.CODE_SUCCESS);
        listObject.setMsg("访问成功");
        listObject.setCount(cout);
        //System.out.println(listObject.toString());
        //将listobject转成json格式并响应到客户端
        ResponseUtils.renderJson(response, JsonUtils.toJson(listObject));

    }
}
