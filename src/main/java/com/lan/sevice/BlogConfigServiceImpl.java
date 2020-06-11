package com.lan.sevice;

import com.lan.mapper.BlogConfigMapper;
import com.lan.mapper.UsersMapper;
import com.lan.pojo.BlogConfig;
import com.lan.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogConfigServiceImpl implements BlogConfigService {
    @Autowired
    private BlogConfigMapper blogConfigMapper;
    //获取博客配置信息
    public BlogConfig getBlogConfigInfo() {
        BlogConfig blogConfig=blogConfigMapper.selectByPrimaryKey(1);
        return blogConfig;
    }

    public Integer update(BlogConfig blogConfig) {
        return blogConfigMapper.updateByPrimaryKey(blogConfig);
    }
}
