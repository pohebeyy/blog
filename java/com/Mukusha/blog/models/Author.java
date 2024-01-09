package com.Mukusha.blog.models;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //автоматическая генерация оригинального идентификатора автора
    private Long id;

    private  String login, password, nickname, aboutTheAuthor;
    @NotNull
    private int age;
    private String hobby;
    @NotNull
    private LocalDateTime actionDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAboutTheAuthor() {
        return aboutTheAuthor;
    }

    public void setAboutTheAuthor(String aboutTheAuthor) {
        this.aboutTheAuthor = aboutTheAuthor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public LocalDateTime getActionDate() {
        return actionDate;
    }

    public void setActionDate(LocalDateTime actionDate) {
        this.actionDate = actionDate;
    }

    public Author(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
