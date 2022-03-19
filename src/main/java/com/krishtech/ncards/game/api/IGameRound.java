package com.krishtech.ncards.game.api;

import java.util.List;

public interface IGameRound {
    GameStatus getStatus();

    IBoard getBoard();

    List<IPlayer> getPlayers();

    IPlayer getActivePlayer();

    void start();
}
