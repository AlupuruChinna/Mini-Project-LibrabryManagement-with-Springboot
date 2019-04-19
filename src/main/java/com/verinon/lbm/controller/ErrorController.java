package com.verinon.lbm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ErrorController
{
    @ExceptionHandler(Exception.class)
    public ModelAndView myExceptionController(HttpServletRequest request,Exception ex)
    {

        ModelAndView model= new ModelAndView();
        model.addObject("exception", ex);
        model.addObject("url",request.getRequestURL());
        model.setViewName("error");

        return model;
    }
}
