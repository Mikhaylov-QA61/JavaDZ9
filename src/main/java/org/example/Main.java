package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday.day = 13;
        post.birthday.month = 11;
        post.birthday.year = 1666;
        post.name = "Евглена";
        post.surname = "Зеленая";
        post.patronymic = "Карповна";
        post.passport = "6666 № 666666";
        post.phone = "+7 (666)-666-66-66";
        post.subscription = false;
    }
}