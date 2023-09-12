package com.ba.boost.reflection;

public class Example {

    private int number;

    public void show() {
        System.out.println("show() aldığı parametre yok.");
    }

    public String showString(String temp) {
        System.out.println("showString() aldığı String parametre " + temp);
        return temp;
    }

    public int showInteger(int temp) {
        System.out.println("showInteger() aldığı parametre " + temp);
        return temp;
    }

    public void setNumber(int number) {
        this.number = number;
        System.out.println("setNumber() setlenen sayi " + number );
    }

    public void showNumber() {
        System.out.println("showNumber() " + this.number);
    }
}
