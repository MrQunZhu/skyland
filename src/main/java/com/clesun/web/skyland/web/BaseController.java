package com.clesun.web.skyland.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BaseController {
    /**
     * 错误页面
     * @param bindingResult
     * @return
     */
/*    @GetMapping(value = "error")

    public String error(BindingResult bindingResult){
        bindingResult.addError(new ObjectError("errors","错误很严重"));
        return "error";
    }*/
}
