package com.thunisoft.demo.demo.controller.yjys;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * YjysAllController Controller
 * 
 *
 * @author 李向佳
 * @date 2019-09-13
 */
@Controller
@RequestMapping("yjys/yjysAll")
public class YjysAllController {
    /**
     * html模板入口
     * @return 'resources/templates'下的html模板
     */
    @GetMapping()
    public String index(HttpServletRequest request) {
        return "yjys/yjysAll";
 	}
}