package com.tangcheng.mobile.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author tangcheng
 * 2017/11/23
 */
@Slf4j
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Device device) {
        String platform = device.getDevicePlatform().name();
        log.info("browser:{},mobile:{},tablet:{},platform:{}", device.isNormal(), device.isMobile(), device.isTablet(), platform);
        return "index";
    }


}
