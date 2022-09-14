package ru.zubov.storekeeper.model;

enum Color {
    RED("red"), GREEN("green"), BLACK("black"), WHITE("white");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
