package com.lan.sevice;

import com.lan.pojo.Leave;

import java.util.List;
import java.util.Map;

public interface LeaveService {

    List<Leave> find(Map<String,Object> map);

    Integer getCount();

    Integer delLeaveById(Integer id);

    Integer addLeave(Leave Leave);

    Integer delAllLeaveById(String ids);

}
