package com.musicLibraryApp.app.wrappers;

// TODO: Найти решение проблемы биндинга переменных в контроллер без оберток
/**
 * Класс обертка для метода контроллера по созданию нового жанра
 */
public class GenreWrapper {
    private String title;

    public GenreWrapper(){}
    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
