package com.lan.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lan.pojo.About;
import com.lan.pojo.BlogConfig;
import com.lan.sevice.AboutService;
import com.lan.sevice.BlogConfigService;
import com.lan.util.JsonUtils;
import com.lan.util.ListObject;
import com.lan.util.ResponseUtils;
import com.lan.util.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/about")
public class AboutController {
    @Autowired
    private AboutService aboutService;

    //获取关于我的信息
    @RequestMapping("/getabout")
    @ResponseBody
    public Object findById(HttpServletRequest request, HttpServletResponse response) throws JsonProcessingException {

        //获取所有用户存入list中
        About about = aboutService.getAbout();

        //实例化listobject对象
        ListObject listObject = new ListObject();
        //给listobject对象的属性赋值
        listObject.setDatas(about);
        listObject.setCode(StatusCode.CODE_SUCCESS);
        listObject.setMsg("访问成功");
        //listObject.setCount(cout);*/
        System.out.println(listObject.toString());
        //System.out.println("11111111111111111111111111111111111");
        //将listobject转成json格式并响应到客户端
        return listObject;
        //ResponseUtils.renderText(response, JsonUtils.toJson(listObject));

    }

    //修改
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void update(HttpServletResponse response, About about) {
        if (about.getAboutId() == null) {
            Integer integer= aboutService.add(about);
            ResponseUtils.renderText(response, integer.toString());
        } else {
            Integer integer = aboutService.update(about);
            ResponseUtils.renderText(response, integer.toString());
        }
    }
}
