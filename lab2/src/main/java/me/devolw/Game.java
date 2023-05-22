package me.devolw;

import lombok.Getter;
public class Game {
    @Getter private String name; //Сорт цветка
    @Getter private String genre; //Основной цвет
    @Getter private String platform; //Род
    @Getter private float year;//Высота
    @Getter private float price;//Цена

    public Game(String name, String genre, String platform, float year, float price) {
        this.name = name;
        this.genre = genre;
        this.platform = platform;
        this.year = year;
        this.price = price;
    }
}