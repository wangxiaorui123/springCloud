package com.serverstudy.server.openapi;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Project : springCloud
 * @Package Name : com.serverstudy.server.openapi
 * @Company 杭州品茗信息技术有限公司
 * @Author wangxiaorui
 * @Creation Date： 2020-10-09 10:51
 * @Description : 对外提供接口
 */
public interface OpenApi {

    @RequestMapping("/test/get")
    String get(String name);
}
