package com.indogusmas.BelajarSpringWeb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeContoller {


    @RequestMapping("/")
    public  String  home(){
        return  "mahasiswa";
    }

    @RequestMapping("/halamanhtml")
    public  String halamanHtml(){return "halamanhtml";}
}
