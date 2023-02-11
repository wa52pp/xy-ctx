package com.xy.web;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class <code>RequestParams</code>
 * 请求参数数据，和请求参数中的各种信息都在这里放着，便于进行传递
 *
 * @author yangnan 2022/11/21 12:50
 * @since 1.8
 */
@Data
@Accessors(chain = true)
public class RequestParams {

    public static RequestParams getInstace() {
        return new RequestParams();
    }

    public enum ContentType {
        JSON, FORM_URLENCODED, FORMDATA
    }

    private String path, method, contentType, bodyJson, varSplit;
    // 用于存放formData参数和get请求参数kv
    private Map<String, Object> params = new HashMap<>();
    private List<UploadFile> files = new ArrayList<>();
    private ContentType type = ContentType.FORM_URLENCODED;

}

