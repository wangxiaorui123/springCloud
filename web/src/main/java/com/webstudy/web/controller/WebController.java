package com.webstudy.web.controller;

import com.serverstudy.server.openapi.OpenApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project : springCloud
 * @Package Name : com.webstudy.web.controller
 * @Company 杭州品茗信息技术有限公司
 * @Author wangxiaorui
 * @Creation Date： 2020-10-09 15:29
 * @Description :
 */

@RestController
@RequestMapping("/testWeb")
public class WebController {

    @Autowired
    private OpenApi openApi;

    @RequestMapping("/getWeb")
    public String get() {
        return openApi.get("通过web调用");
    }
}
