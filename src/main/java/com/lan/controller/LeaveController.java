package com.lan.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lan.pojo.Classify;
import com.lan.pojo.Leave;
import com.lan.pojo.Users;
import com.lan.sevice.ClassifyService;
import com.lan.sevice.LeaveService;
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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Controller
@RequestMapping("/leave")
public class LeaveController {
    @Autowired
    private LeaveService  leaveService;

    //获取表格数据
    @RequestMapping(value = "/getleave", method = RequestMethod.GET)
    @ResponseBody
    public Object findById(HttpServletRequest request, HttpServletResponse response,Integer page,Integer limit) throws JsonProcessingException {
        int start=(page - 1)*limit;
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("page",start);
        map.put("size",limit);
        //获取所有留言存入list中
        List<Leave> list = leaveService.find(map);
        //获取用户总数
        Integer cout = leaveService.getCount();
        //实例化listobject对象
        ListObject listObject = new ListObject();
        //给listobject对象的属性赋值
        listObject.setData(list);
        listObject.setCode(StatusCode.CODE_SUCCESS);
        listObject.setMsg("访问成功");
        listObject.setCount(cout);
        //System.out.println(listObject.toString());
        //将listobject转成json格式并响应到客户端
        //ResponseUtils.renderJson(response, JsonUtils.toJson(listObject));
        return listObject;

    }
    //获取表格数据
    @RequestMapping(value = "/getAllleave", method = RequestMethod.GET)
    @ResponseBody
    public Object getAll(HttpServletRequest request, HttpServletResponse response) throws JsonProcessingException {

        //获取所有留言存入list中
        List<Leave> list = leaveService.getAll();
        //获取用户总数
        Integer cout = leaveService.getCount();
        //实例化listobject对象
        ListObject listObject = new ListObject();
        //给listobject对象的属性赋值
        listObject.setData(list);
        listObject.setCode(StatusCode.CODE_SUCCESS);
        listObject.setMsg("访问成功");
        listObject.setCount(cout);
        //System.out.println(listObject.toString());
        //将listobject转成json格式并响应到客户端
        //ResponseUtils.renderJson(response, JsonUtils.toJson(listObject));
        return listObject;

    }

    //删除
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public void delLeaveById(HttpServletResponse response, @RequestParam("lid") Integer id) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        //执行删除操作
        Integer integer = leaveService.delLeaveById(id);
        String code = "";
        if (integer > 0) {//删除成功
            code = "1";
        } else {//删除失败
            code = "0";
        }
        ResponseUtils.renderText(response, code);
    }

    //添加
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public void add(HttpServletResponse response,@RequestParam("leaveUsername")String leaveUsername,@RequestParam("leaveContent")String leaveContent) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        Leave leave=new Leave();
        leave.setLeaveUsername(leaveUsername);
        leave.setLeaveContent(leaveContent);
        leave.setLeavePid(0);
        leave.setLeaveTime(new Date());
        Integer integer = leaveService.addLeave(leave);
        ResponseUtils.renderText(response, integer.toString());

    }
    //回复
    @RequestMapping(value = "/reply", method = RequestMethod.GET)
    public void reply(HttpServletResponse response,@RequestParam("lpid") Integer lpid,@RequestParam("leaveUsername")String leaveUsername,@RequestParam("leaveContent")String leaveContent){
        response.setHeader("Access-Control-Allow-Origin", "*");
        Leave leave=new Leave();
        leave.setLeaveUsername(leaveUsername);
        leave.setLeaveContent(leaveContent);
        leave.setLeavePid(lpid);
        leave.setLeaveTime(new Date());
        Integer integer = leaveService.addLeave(leave);
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
}
