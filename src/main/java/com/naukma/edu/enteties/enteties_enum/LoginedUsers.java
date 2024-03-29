package com.naukma.edu.enteties.enteties_enum;

import com.naukma.edu.utils.Constants;

public enum LoginedUsers {
    OLHA(Constants.OLHA, Constants.ADMIN, Constants.ADMIN),
    ERIK(Constants.ERIK, Constants.USER, Constants.USER);

    private String name;
    private String login;
    private String password;

    LoginedUsers(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
