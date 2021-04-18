package com.rajdowa.wallet.controller;

import com.rajdowa.wallet.dto.User;
import com.rajdowa.wallet.entity.UsersCategories;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {

    @GetMapping("/login")
    public String loginPage(Model model) {
        model.addAttribute("usersLogin", new User());
        return "login";
    }

    @PostMapping("/login")
    public void saveUser(@ModelAttribute(value="usersLogin") User user) {
        System.out.println(user);
    }

}