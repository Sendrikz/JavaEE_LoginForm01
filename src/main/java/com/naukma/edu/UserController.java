package com.naukma.edu;

import com.naukma.edu.enteties.User;
import com.naukma.edu.enteties.enteties_enum.LoginedUsers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
class UserController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showUserForm(Model theModel) {
        theModel.addAttribute("user", new User());

        return "user-form";
    }

    @RequestMapping(value = "/processForm", method = RequestMethod.POST)
    public String processUserForm(@ModelAttribute("user") User anonymous, Model theModel) {
        List<LoginedUsers> loginedUsersList = Arrays.asList(LoginedUsers.values());

        for (LoginedUsers logIn : loginedUsersList) {
            if (logIn.getLogin().equals(anonymous.getLogin()) &&
                    logIn.getPassword().equals(anonymous.getPassword())) {

                theModel.addAttribute("loginedUser", logIn);
                return "user-confirmation";
            }
        }

        theModel.addAttribute("successfulLogin", "no");
        return "user-form";
    }
}
