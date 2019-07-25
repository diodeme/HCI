package com.thunisoft.demo.demo.controller.mzysgzz;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * CycfController Controller
 * 
 *
 * @author huayu
 * @date 2019-07-25
 */
@Controller
@RequestMapping("mzysgzz/cycf")
public class CycfController {
    /**
     * html模板入口
     * @return 'resources/templates'下的html模板
     */
    @GetMapping()
    public String index(HttpServletRequest request) {
        return "mzysgzz/cycf";
 	}
}