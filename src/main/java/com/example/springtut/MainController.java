package com.example.springtut;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
  String text = "Hello, world";

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("text", text);
    return "index";
  }

  @PostMapping("/")
  public String index(@RequestParam String text) {
    this.text = text;
    return "redirect:/";
  }
}
