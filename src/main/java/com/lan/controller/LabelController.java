package com.lan.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lan.pojo.Classify;
import com.lan.pojo.Label;
import com.lan.pojo.Users;
import com.lan.sevice.ClassifyService;
import com.lan.sevice.LabelService;
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
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/label")
public class LabelController {
    @Autowired
    private LabelService LabelService;

    //获取表格数据
    @RequestMapping(value = "/getlabel", method = RequestMethod.GET)
    @ResponseBody
    public Object findById(HttpServletRequest request, HttpServletResponse response) throws JsonProcessingException {

        //获取所有用户存入list中
        List<Label> list = LabelService.find();
        //获取用户总数
        Integer cout = LabelService.getCount();
        //实例化listobject对象
        ListObject listObject = new ListObject();
        //给listobject对象的属性赋值
        listObject.setData(list);
        listObject.setCode(StatusCode.CODE_SUCCESS);
        listObject.setMsg("访问成功");
        listObject.setCount(cout);
        //System.out.println(listObject.toString());
        //将listobject转成json格式并响应到客户端
        return listObject;
        //ResponseUtils.outputJson(response, JsonUtils.toJson(listObject));

    }

    //删除
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public void delUserById(HttpServletResponse response, @RequestParam("cid") Integer id) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        //执行删除操作
        Integer integer = LabelService.delLabelById(id);
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
    public void add(HttpServletResponse response,@RequestParam("name") String classifyName) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        Label label=new Label();
        label.setLabelName(classifyName);
        Integer integer = LabelService.addLabel(label);
        ResponseUtils.renderText(response, integer.toString());

    }

    //更新
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public void update(HttpServletResponse response, @RequestParam("cid") Integer cid,@RequestParam("name") String cname) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        Label label=new Label();
        label.setLabelName(cname);
        label.setLabelId(cid);
        Integer integer = LabelService.updateLabel(label);
        String code = "";
        if (integer > 0) {//添加成功
            code = "1";
        } else {//添加失败
            code = "0";
        }
        ResponseUtils.renderText(response, code);

    }
}
