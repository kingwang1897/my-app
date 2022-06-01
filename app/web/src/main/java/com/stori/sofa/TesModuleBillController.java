package com.stori.sofa;

import io.micrometer.core.instrument.MeterRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * module test controller
 * 
 * @author king
 * @date 2022/05/05 19:24
 **/
@RestController
@RefreshScope
public class TesModuleBillController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TesModuleBillController.class);

    @Autowired
    private MeterRegistry registry;

//    @Autowired
//    private NacosConfig nacosConfig;

    @Value( "${nacos.yaml.age}" )
    private String age;

    /**
     * module-bill test function
     * 
     * @date 2022/05/05 19:25
     * @return java.lang.String
     */
    @GetMapping("/test")
    public String test() throws IOException {
//        return "authorizeSwitch is: " + nacosConfig.isAuthorizeSwitch();

        registry.counter("TesModuleBillController.test.count").increment();
//
//        Result<String> billExternal = billExternalFacade.getBill();
//        return "billExternal is: " + billExternal.getData();
        return age;
    }
}
