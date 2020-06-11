package com.lan.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lan.pojo.BlogConfig;
import com.lan.pojo.Users;
import com.lan.sevice.BlogConfigService;
import com.lan.util.JsonUtils;
import com.lan.util.ListObject;
import com.lan.util.ResponseUtils;
import com.lan.util.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/blogconfig")
public class BlogConfigController {
    @Autowired
    private BlogConfigService blogConfigService;
    //获取博客配置信息
    @RequestMapping("/getInfo")
    public Map getBlogConfig(){
        BlogConfig blogConfig=blogConfigService.getBlogConfigInfo();
        Map map=new HashMap();
        map.put("blogInfo",blogConfig);
        return map;
    }
    @RequestMapping("/getInfos")
    public void findById(HttpServletRequest request, HttpServletResponse response) throws JsonProcessingException {

        //获取所有用户存入list中
        BlogConfig b = blogConfigService.getBlogConfigInfo();

        //实例化listobject对象
        ListObject listObject = new ListObject();
        //给listobject对象的属性赋值
        listObject.setDatas(b);
        listObject.setCode(StatusCode.CODE_SUCCESS);
        listObject.setMsg("访问成功");
        //listObject.setCount(cout);*/
        System.out.println(listObject.toString());
        //System.out.println("11111111111111111111111111111111111");
        //将listobject转成json格式并响应到客户端

        ResponseUtils.renderText(response, JsonUtils.toJson(listObject));

    }
    //修改博客配置
    @RequestMapping(value = "/update" ,method = RequestMethod.POST)
    public void update(HttpServletResponse response,BlogConfig blogConfig){
       Integer integer= blogConfigService.update(blogConfig);
       ResponseUtils.renderText(response,integer.toString());
    }
}
