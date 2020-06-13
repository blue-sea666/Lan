package com.lan.sevice;

import com.lan.mapper.AboutMapper;
import com.lan.mapper.BlogConfigMapper;
import com.lan.pojo.About;
import com.lan.pojo.BlogConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutServiceImpl implements AboutService {
    @Autowired
    private AboutMapper aboutMapper;
    //获取博客配置信息
    public About getAbout() {
        About about=aboutMapper.selectByPrimaryKey(1);
        return about;
    }

    public Integer update(About about) {
        return aboutMapper.updateByPrimaryKeySelective(about);
    }

    public Integer add(About about) {
        return aboutMapper.insert(about);
    }
}
