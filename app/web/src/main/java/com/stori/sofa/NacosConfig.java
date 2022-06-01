//package com.stori.sofa;
//
//import com.alibaba.nacos.api.config.annotation.NacosValue;
//import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
//import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
//import org.springframework.context.annotation.Configuration;
//
///**
// * Nacos配置
// *
// * @author chongyangchen
// */
//@Configuration
//@EnableNacosConfig
//@NacosPropertySource(dataId = "stroi-demo", autoRefreshed = true)
//public class NacosConfig {
//
//    /**
//     * 授权降级开关，若值为false则调用core-banking的authorizeFacade进行授权，否则直接返回授权通过
//     */
//    @NacosValue(value = "${degradeConfig:false}", autoRefreshed = true)
//    private boolean authorizeSwitch;
//
//    /**
//     * getter of filed authorizeSwitch
//     */
//    public boolean isAuthorizeSwitch() {
//        return authorizeSwitch;
//    }
//}