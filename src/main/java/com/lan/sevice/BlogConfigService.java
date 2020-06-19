package com.lan.sevice;

import com.lan.pojo.BlogConfig;

public interface BlogConfigService {
    public BlogConfig getBlogConfigInfo();

    Integer update(BlogConfig blogConfig);
}
