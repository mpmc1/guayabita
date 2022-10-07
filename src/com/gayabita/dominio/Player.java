package com.gayabita.dominio;

public class Player {
    private String name;
    private float bet;
    private int firstDiceRoll;
    private int secondDiceRoll;

    public Player(String name, float bet) {
        this.name = name;
        this.bet = bet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBet() {
        return bet;
    }

    public void setBet(float bet) {
        this.bet = bet;
    }

    public int getFirstDiceRoll() {
        return firstDiceRoll;
    }

    public void setFirstDiceRoll(int firstDiceRoll) {
        this.firstDiceRoll = firstDiceRoll;
    }

    public int getSecondDiceRoll() {
        return secondDiceRoll;
    }

    public void setSecondDiceRoll(int secondDiceRoll) {
        this.secondDiceRoll = secondDiceRoll;
    }
}
