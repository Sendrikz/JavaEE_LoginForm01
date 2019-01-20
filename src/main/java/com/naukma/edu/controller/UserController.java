package com.naukma.edu.controller;

import com.naukma.edu.enteties.User;
import com.naukma.edu.enteties.enteties_enum.LoginedUsers;
import com.naukma.edu.utils.Constants;
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
        theModel.addAttribute(Constants.USER, new User());

        return Constants.USER_FORM;
    }

    @RequestMapping(value = "/processForm", method = RequestMethod.POST)
    public String processUserForm(@ModelAttribute(Constants.USER) User anonymous, Model theModel) {
        List<LoginedUsers> loginedUsersList = Arrays.asList(LoginedUsers.values());

        for (LoginedUsers logIn : loginedUsersList) {
            if (logIn.getLogin().equals(anonymous.getLogin()) &&
                    logIn.getPassword().equals(anonymous.getPassword())) {

                theModel.addAttribute(Constants.LOGINED_USER, logIn);
                return Constants.USER_CONFIRMATION;
            }
        }

        theModel.addAttribute(Constants.SUCCESSFUL_LOGIN, Constants.NO);
        return Constants.USER_FORM;
    }
}
