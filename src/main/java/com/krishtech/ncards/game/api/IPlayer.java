package com.krishtech.ncards.game.api;

public interface IPlayer {
    String getName();

    void perform(PlayerAction action);
}
