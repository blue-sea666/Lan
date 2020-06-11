package com.lan.sevice;

import com.lan.pojo.BlogConfig;
import com.lan.pojo.Users;

public interface BlogConfigService {
    public BlogConfig getBlogConfigInfo();

    Integer update(BlogConfig blogConfig);
}
