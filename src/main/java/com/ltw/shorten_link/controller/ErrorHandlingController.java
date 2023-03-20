package com.ltw.shorten_link.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ltw.shorten_link.Utils;
import com.ltw.shorten_link.model.ModelAndViewObject;

@Controller
public class ErrorHandlingController implements ErrorController {

    @GetMapping("/error")
    public ModelAndView handleError() {
        ModelAndView mv = new ModelAndView();
        ModelAndViewObject mvo = new ModelAndViewObject("Không tìm thấy", "404.css");
        mv.addObject(Utils.ModalAndViewObjectName, mvo);
        mv.setViewName("404");
        return mv;
    }
}
