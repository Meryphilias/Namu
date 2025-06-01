package com.namu.namu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;


@Controller
public class TabController {
    @GetMapping("/")
    public String indextab() {
        return "test.html";
    }
    
}
