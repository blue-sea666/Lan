package com.lan.util;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.text.SimpleDateFormat;

public class JsonUtils {
    static ObjectMapper objectMapper;

    /*
     * 解析json
     */
    public static <T> T fromJson(String content, Class<T> valueType) {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }
        try {
            return objectMapper.readValue(content, valueType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /*
     * 生成json
     */
    public static String toJson(Object object) {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /*private static final ObjectMapper mapper = new ObjectMapper();

    //设置转换时的配置，具体视情况配置，如果通过此处配置，使用全局。也可以通过在bean的属性上添加注解配置对应的bean
    static {
        //序列化的时候序列对象，bean的属性设置
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        //反序列化的时候如果多了其它属性，不抛出异常
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //如果是空对象的时候，不抛异常
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        //取消时间的转换格式，默认是时间戳，同时需设置时间格式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
    }

    public static String toJsonString(Object obj) throws JsonProcessingException {
        if (obj != null) {
            return mapper.writeValueAsString(obj);
        }
        return null;
    }
*/
    public static <T> T toBean(String json, Class<T> clazz) throws IOException {
        if (StringUtils.hasText(json) && clazz != null) {
            return (T) objectMapper.readValue(json, clazz);
        }
        return null;
    }
}
