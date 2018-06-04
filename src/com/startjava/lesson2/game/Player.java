package com.startjava.lesson2.game;

class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public int tryToGuess() {
        System.out.print(this.name + ", введите ваш вариант: ");
        return Players.readInt();
    }

    public String getName() {
        return name;
    }

}

