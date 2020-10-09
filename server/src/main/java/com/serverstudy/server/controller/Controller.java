package com.serverstudy.server.controller;

import com.serverstudy.server.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project : springCloud
 * @Package Name : com.serverstudy.server.controller
 * @Company 杭州品茗信息技术有限公司
 * @Author wangxiaorui
 * @Creation Date： 2020-10-09 10:48
 * @Description :
 */

@RestController
@RequestMapping("/test")
public class Controller {

    @Autowired
    private Service service;

    @RequestMapping("/get")
    public String get(String name) {
        return service.get(name);
    }
}
