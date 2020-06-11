package com.lan.sevice;

import com.lan.pojo.Classify;


import java.util.List;

public interface ClassifyService {

    List<Classify> find();

    Integer getCount();

    Integer delClassifyById(Integer id);

    Integer addClassify(Classify Classify);

    Integer delAllUserById(String ids);

    Integer updateUsers(Classify Classify);

    List<Classify> search(Classify Classify);
}
