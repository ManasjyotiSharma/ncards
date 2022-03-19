package com.krishtech.ncards.card.api;

public class SuiteCard implements ISuiteCard {
    private final Suite suite;
    private final Card card;

    public SuiteCard(Suite suite, Card card) {
        this.suite = suite;
        this.card = card;
    }

    @Override
    public Suite getSuite() {
        return suite;
    }

    @Override
    public Card getCard() {
        return card;
    }

    @Override
    public String getLongName() {
        return String.format("%s of %s", card.getLongName(), suite.getName());
    }

    @Override
    public String getShortName() {
        return String.format("%s of %s", card.getShortName(), suite.getName());
    }
}
