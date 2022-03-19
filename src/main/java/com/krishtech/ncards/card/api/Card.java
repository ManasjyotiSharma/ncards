package com.krishtech.ncards.card.api;

public enum Card implements ICard {
    JOKER("Joker", "*"),
    ACE("Ace", "A"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("Jack", "J"),
    QUEEN("Queen", "Q"),
    KING("King", "K");

    public final String longName;
    public final String shortName;

    Card(String longName) {
        this(longName, longName);
    }

    Card(String longName, String shortName) {
        this.longName = longName;
        this.shortName = shortName;
    }

    @Override
    public String getLongName() {
        return longName;
    }

    @Override
    public String getShortName() {
        return shortName;
    }
}
