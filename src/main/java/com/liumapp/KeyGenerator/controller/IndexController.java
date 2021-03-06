package com.liumapp.KeyGenerator.controller;

import com.liumapp.KeyGenerator.entity.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by liumapp on 9/28/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private Guest guest;

    @GetMapping("/")
    public String index (ModelMap model) {

        model.addAttribute("name" , guest.getName());
        model.addAttribute("sex" , guest.getSex());
        return "index";

    }

}
