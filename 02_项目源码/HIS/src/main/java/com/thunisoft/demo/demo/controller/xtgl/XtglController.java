package com.thunisoft.demo.demo.controller.xtgl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * XtglController Controller
 * 
 *
 * @author Unlike Ho
 * @date 2019-07-26
 */
@Controller
@RequestMapping("xtgl/xtgl")
public class XtglController {
    /**
     * html模板入口
     * @return 'resources/templates'下的html模板
     */
    @GetMapping()
    public String index(HttpServletRequest request) {
        return "xtgl/xtgl";
 	}
}