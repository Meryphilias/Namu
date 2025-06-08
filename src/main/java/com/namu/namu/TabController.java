package com.namu.namu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class TabController {
    @GetMapping("/")
    public String indextab() {
        return "test.html";
    }

    @GetMapping("/booktype")
    public String booktype() {
        return "api/typetab.html";
    }
    
    
}
