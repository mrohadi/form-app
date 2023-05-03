package com.salt.formapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/", "/index" })
public class IndexController {

    public static String var = "adf";

    static int function(int n) {

        String a = "KLMN";

        String b = " AB CDEFGHIJ ";

        String c = b.trim().substring(3, 7);
        String d = c.concat(a);
        System.out.println(d);

        if (n == 0) {

            return 0;

        } else if (n == 1) {

            return 1;

        } else if (n > 1) {

            return function(n - 1) + function(n - 2);

        } else {

            return -1;

        }

    }

    @GetMapping
    public String main() {
        System.out.println(function(6));
        return "index";
    }
}
