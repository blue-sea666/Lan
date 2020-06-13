package com.lan.sevice;

import com.lan.pojo.Label;

import java.util.List;

public interface LabelService {

    List<Label> find();

    Integer getCount();

    Integer delLabelById(Integer id);

    Integer addLabel(Label Label);

    Integer delAllLabelById(String ids);

    Integer updateLabel(Label Label);

    List<Label> search(Label Label);
}
