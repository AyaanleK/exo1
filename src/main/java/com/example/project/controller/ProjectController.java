package com.example.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/hvad-kan-man-gøre")
  public String page1() {
    return "hvad-kan-man-gøre";
  }
}