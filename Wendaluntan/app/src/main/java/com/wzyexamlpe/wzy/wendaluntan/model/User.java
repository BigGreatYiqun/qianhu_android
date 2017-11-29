package com.wzyexamlpe.wzy.wendaluntan.model;

import java.util.ArrayList;

/**
 * Created by wzy on 2017/11/1.
 */

public class User {
    private static final User ourInstance = new User();

    private String name = "请登录";
    private String email = "";
    private String password = "";

    private ArrayList<Question> questions = new ArrayList<>();
    private ArrayList<Answer> answers = new ArrayList<>();
    private ArrayList<Comment> comments = new ArrayList<>();



    public static User getInstance() {
        return ourInstance;
    }

    private User() {
    }



}
