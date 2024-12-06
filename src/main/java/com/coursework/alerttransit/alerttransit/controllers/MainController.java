package com.coursework.alerttransit.alerttransit.controllers;

import com.coursework.alerttransit.alerttransit.AlertTransitApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String main(Model model) {
        if (AlertTransitApplication.isAlert){
            model.addAttribute("alertImagePath", "img/YesAlert.png");
            model.addAttribute("alertTitleText", "Увага! Повітрянна тривога!");
            model.addAttribute("alertSubTitleText", "Негайно прямуйте в укриття!");
        }
        else
        {
            model.addAttribute("alertImagePath", "img/NoAlert.png");
            model.addAttribute("alertTitleText", "Тривоги немає");
            model.addAttribute("alertSubTitleText", "Слідкуйте за повідомленнями");
        }
        return "main";
    }

    @GetMapping("/vault")
    public String getVault(Model model) {
        return "map";
    }
    @GetMapping("/about")
    public String getAbout(Model model){
        return "about";
    }
}
