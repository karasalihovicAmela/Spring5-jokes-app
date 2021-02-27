package com.amela.Spring5jokesapp.controllers;

import com.amela.Spring5jokesapp.services.JokesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
public class JokeController {

    private final JokesService jokesService;

    @RequestMapping({"/", ""})
    public String showJoke(Model model){

        model.addAttribute("joke", jokesService.getJoke());

        return "index";
    }
}
