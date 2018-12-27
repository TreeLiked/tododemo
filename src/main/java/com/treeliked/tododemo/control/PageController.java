package com.treeliked.tododemo.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 页面控制
 *
 * @author lqs2
 * @date 2018-12-27, Thu
 */
@Controller
public class PageController {

    @GetMapping({"/", ""})
    public String index() {
        return "index";
    }

}
