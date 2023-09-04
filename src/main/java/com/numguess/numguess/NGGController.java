package com.numguess.numguess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NGGController {

    private NumberGuessingGame game; // Ensure you have the game bean properly configured

    @Autowired
    public NGGController(NumberGuessingGame game) {
        this.game = game;
    }

    @GetMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("min", 1);
        model.addAttribute("max", 100);
        return "index";
    }

    @PostMapping("/guess")
    public String handleGuess(@RequestParam int guess, Model model) {
        String message = game.guess(guess);
        model.addAttribute("message", message);
        return "index";
    }
    
}
