package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "loginpage";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/photo-gallery")
    public String photoGallery() {
        return "photo-gallery";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
    @GetMapping("/saveGomatha")
    public String saveGomatha() {
        return "saveGomatha";
    }
        @GetMapping("/video-gallery")
        public String videoGallery() {
            return "video-gallery";
    }

}