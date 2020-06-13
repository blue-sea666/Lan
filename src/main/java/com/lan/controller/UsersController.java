package com.lan.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lan.pojo.Users;
import com.lan.sevice.UsersService;
import com.lan.util.JsonUtils;
import com.lan.util.ListObject;
import com.lan.util.ResponseUtils;
import com.lan.util.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.peer.SystemTrayPeer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private UsersService usersService;

    /*登录*/
    @RequestMapping("/login")
    public String login(HttpServletResponse response, HttpServletRequest request, Users users) throws IOException, ServletException {
        Users users1 = usersService.login(users);
        if (users1 != null) {
            HttpSession session = request.getSession();
            session.setAttribute("users", users1);
            //request.getRequestDispatcher("views/index.jsp").forward(request,response);
            return "/index";
        } else {
            response.sendRedirect("/Lan_war_exploded/../login.jsp");
            return null;
        }

    }
    //获取表格数据
    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public void findById(HttpServletRequest request, HttpServletResponse response,Integer page,Integer limit) throws JsonProcessingException {
        //获取从第几条数据开始
        int pstart=(page -1) * limit;
        Map map=new HashMap();
        map.put("page",pstart);
        map.put("size",limit);
        //获取所有用户存入list中
        List<Users> list = usersService.find(map);
        //获取用户总数
        Integer cout = usersService.getCount();
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
    //删除用户
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public void delUserById(HttpServletResponse response,@RequestParam("uid") Integer id){
        response.setHeader("Access-Control-Allow-Origin", "*");
        //执行删除操作
        Integer integer=usersService.delUserById(id);
        String code="";
        if (integer>0){//删除成功
            code="1";
        }else {//删除失败
            code="0";
        }
        ResponseUtils.renderText(response,code);
    }
    //添加用户
    @RequestMapping(value = "/add" ,method = RequestMethod.POST)
    public void add(HttpServletResponse response, Users users){
        response.setHeader("Access-Control-Allow-Origin", "*");
        Integer integer=usersService.addUsers(users);
        ResponseUtils.renderText(response,integer.toString());

    }
    @RequestMapping(value = "/deleteall",method = RequestMethod.POST)
    public void delAllUsersByIds(HttpServletResponse response,Users u){
        response.setHeader("Access-Control-Allow-Origin", "*");
        System.out.println("ids");
        System.out.println("用户id"+u.toString());
        System.out.println("6666");
        List<Users> users=new ArrayList<Users>();
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
        Integer integer=1;//usersService.delAllUserById(ids);
        String code="";
        if (integer>0){//删除成功
            code="1";
        }else {//删除失败
            code="0";
        }
        ResponseUtils.renderText(response,code);
    }
    //添加用户
    @RequestMapping(value = "/update" ,method = RequestMethod.POST)
    public void update(HttpServletResponse response, Users users){
        response.setHeader("Access-Control-Allow-Origin", "*");
        Integer integer=usersService.updateUsers(users);
        String code="";
        if (integer>0){//添加成功
            code="1";
        }else {//添加失败
            code="0";
        }
        ResponseUtils.renderText(response,code);

    }
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    public void search(HttpServletResponse response,Users users){
        List<Users> list = usersService.search(users);
        //获取用户总数
        Integer cout = usersService.getCount();
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
    /*@RequestBody
    @RequestMapping(value = "selectUser",method = RequestMethod.POST)
    public void selectUser(@RequestBody Map<String> map, HttpServletRequest request, HttpServletResponse response) throws IOException {
        Integer id = Integer.parseInt(map.get("id"));
        User user = userService.selectUser(id); List<User> list = new ArrayList<User>();
        list.add(user);
        ListObject listObject = new ListObject();
        listObject.setItems(list);
        listObject.setCode(StatusCode.CODE_SUCCESS);
        listObject.setMsg("访问成功");
        ResponseUtils.renderJson(response, JsonUtils.toJson(listObject)); }*/
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String to() {
        System.out.println("111");
        return "/page/das";
    }
}
