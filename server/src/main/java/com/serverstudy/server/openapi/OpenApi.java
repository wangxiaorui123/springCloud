package com.serverstudy.server.openapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Project : springCloud
 * @Package Name : com.serverstudy.server.openapi
 * @Company 杭州品茗信息技术有限公司
 * @Author wangxiaorui
 * @Creation Date： 2020-10-09 10:51
 * @Description : 对外提供接口
 */

@FeignClient(name = "server-service", contextId = "OpenApi")
public interface OpenApi {

    @RequestMapping(value = "/test/get", method = RequestMethod.GET)
    String get(@RequestParam("name") String name);
}
