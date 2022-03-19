package com.krishtech.ncards.game.api;

import com.krishtech.ncards.card.api.ICardCollection;

public interface IBoard {
    ICardCollection getActiveCardCollection();

    ICardCollection getDiscardedCardCollection();

    ICardCollection getLastDiscardedCardCollection();
}
