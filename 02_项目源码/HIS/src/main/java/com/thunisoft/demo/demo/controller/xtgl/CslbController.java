package com.thunisoft.demo.demo.controller.xtgl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * CslbController Controller
 * 
 *
 * @author Unlike Ho
 * @date 2019-09-14
 */
@Controller
@RequestMapping("xtgl/cslb")
public class CslbController {
    /**
     * html模板入口
     * @return 'resources/templates'下的html模板
     */
    @GetMapping()
    public String index(HttpServletRequest request) {
        return "xtgl/cslb";
 	}
}