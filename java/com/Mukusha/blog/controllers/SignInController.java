package com.Mukusha.blog.controllers;

import com.Mukusha.blog.models.Author;
import com.Mukusha.blog.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignInController {

    @Autowired //переменная которая ссылается на репозиторий
    private PostRepository postRepository;

    @PostMapping("/after/signup")
    public String blogPostAdd(@RequestParam String login, @RequestParam String password, Model model){
        Author author = new Author(login,password);
      //  postRepository.findAll().;
        return "sign-in";
    }

}
