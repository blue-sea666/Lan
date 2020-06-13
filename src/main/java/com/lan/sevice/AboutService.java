package com.lan.sevice;

import com.lan.pojo.About;
import com.lan.pojo.BlogConfig;

public interface AboutService {
    public About getAbout();

    Integer update(About About);

    Integer add(About about);
}
