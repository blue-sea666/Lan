package com.lan.sevice;

import com.lan.mapper.ClassifyMapper;
import com.lan.mapper.LabelMapper;
import com.lan.pojo.Classify;
import com.lan.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelServiceImpl implements LabelService {
    @Autowired
    private LabelMapper LabelMapper;


    public List<Label> find() {
        return LabelMapper.find();
    }

    public Integer getCount() {
        return LabelMapper.count();
    }

    public Integer delLabelById(Integer id) {
       return LabelMapper.deleteByPrimaryKey(id);
    }

    public Integer addLabel(Label Label) {
        return LabelMapper.insert(Label);
    }

    public Integer delAllLabelById(String ids) {
        return null;//usersMapper.deleteByExample(ids);
    }

    public Integer updateLabel(Label Label) {
        return LabelMapper.updateByPrimaryKey(Label);
    }

    public List<Label> search(Label Label) {
        return LabelMapper.search(Label);
    }
}
