package com.fitness.pass.passweb.controller.pass;

import com.fitness.pass.passweb.service.pass.Pass;
import com.fitness.pass.passweb.service.pass.PassService;
import com.fitness.pass.passweb.service.user.User;
import com.fitness.pass.passweb.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/passes")
public class PassViewController {
    private final UserService userService;
    private final PassService passService;

    public PassViewController(UserService userService, PassService passService) {
        this.userService = userService;
        this.passService = passService;
    }

    @GetMapping
    public ModelAndView getPasses(@RequestParam("userId") String userId) {
        ModelAndView modelAndView = new ModelAndView();
        // Retrieve Passes and Users info
        final List<Pass> passes = passService.getPasses(userId);
        final User user = userService.getUser(userId);
        modelAndView.addObject("passes", passes);
        modelAndView.addObject("user", user);
        modelAndView.setViewName("pass/index");

        return modelAndView;
    }

}