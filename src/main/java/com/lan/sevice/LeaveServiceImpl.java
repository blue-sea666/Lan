package com.lan.sevice;

import com.lan.mapper.ClassifyMapper;
import com.lan.mapper.LeaveMapper;
import com.lan.pojo.Classify;
import com.lan.pojo.Leave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LeaveServiceImpl implements LeaveService {
    @Autowired
    private LeaveMapper leaveMapper;
    public List<Leave> find(Map<String, Object> map) {
        return leaveMapper.find(map);
    }

    public Integer getCount() {
        return leaveMapper.count();
    }

    public Integer delLeaveById(Integer id) {
        return leaveMapper.deleteByPrimaryKey(id);
    }

    public Integer addLeave(Leave leave) {
        return leaveMapper.insert(leave);
    }

    public Integer delAllLeaveById(String ids) {
        return null;//usersMapper.deleteByExample(ids);
    }

    public List<Leave> getAll() {
        return leaveMapper.selectAll();
    }

}
