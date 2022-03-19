package com.krishtech.ncards.card.api;

import java.util.Comparator;

public interface ICardCollection {
    void shuffle();

    void sort(Comparator<ICard> comparator);

    void add(ICard card);

    ICard remove() throws CardException;

    boolean isEmpty();

    boolean isHidden();
}
