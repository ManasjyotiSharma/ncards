package com.krishtech.ncards.card.impl;

import com.krishtech.ncards.card.api.ICard;
import com.krishtech.ncards.card.api.ICardCollection;
import com.krishtech.ncards.card.api.CardException;

import java.util.Comparator;

public class CardCollection implements ICardCollection {
    @Override
    public void shuffle() {

    }

    @Override
    public void sort(Comparator<ICard> comparator) {

    }

    @Override
    public void add(ICard card) {

    }

    @Override
    public ICard remove() throws CardException {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isHidden() {
        return false;
    }
}
