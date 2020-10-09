package com.serverstudy.server.service.impl;

import com.serverstudy.server.service.Service;

/**
 * @Project : springCloud
 * @Package Name : com.serverstudy.server.service.impl
 * @Company 杭州品茗信息技术有限公司
 * @Author wangxiaorui
 * @Creation Date： 2020-10-09 10:46
 * @Description :
 */
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    @Override
    public String get(String name) {
        return "获取成功--->"+name;
    }
}
