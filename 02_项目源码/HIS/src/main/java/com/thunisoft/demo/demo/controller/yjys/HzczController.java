package com.thunisoft.demo.demo.controller.yjys;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HzczController Controller
 * 
 *
 * @author 李向佳
 * @date 2019-09-11
 */
@Controller
@RequestMapping("yjys/hzcz")
public class HzczController {
    /**
     * html模板入口
     * @return 'resources/templates'下的html模板
     */
    @GetMapping()
    public String index(HttpServletRequest request) {
        return "yjys/hzcz";
 	}
}