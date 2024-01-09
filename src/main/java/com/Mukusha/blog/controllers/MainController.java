package com.Mukusha.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")  //функция при переходе на определенный url
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");  //передача параметров внутрь шаблона
        return "home"; //возвращаем определенный html шаблон
    }

    @GetMapping("/about")  //функция при переходе на определенный url
    public String about(Model model) {
        model.addAttribute("title", "Страница про нас");  //передача параметров внутрь шаблона
        return "about"; //возвращаем определенный html шаблон
    }
}