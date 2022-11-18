package com.hb.ms.controller.v1;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import com.hb.ms.entity.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags="用户管理")
@ApiSupport(author = "Henry")
@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @ApiOperationSupport(author = "Henry")
    @ApiOperation("用户信息")
    @GetMapping(value = "/{app_id}/{id}")
    public HashMap getUser(@PathVariable("app_id") @ApiParam("APP ID") String appID, @PathVariable("id") @ApiParam("用户ID") String id) throws Exception{
        Map<String, String> params = new HashMap<String, String>();
        params.put("id", id);
        params.put("appId", appID);
        return restTemplate.postForObject("http://another-service-name/api", params, HashMap.class);
    }

    @ApiOperationSupport(author = "Henry")
    @ApiOperation("保存用户")
    @PostMapping(value = "/save")
    public void save(@RequestBody User user) {
    }
}
