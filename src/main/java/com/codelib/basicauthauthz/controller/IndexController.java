package com.codelib.basicauthauthz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller for "/".
 */
@Controller
public class IndexController {

    @GetMapping(path = "/")
    public String index() {
        return "index";
    }
}
