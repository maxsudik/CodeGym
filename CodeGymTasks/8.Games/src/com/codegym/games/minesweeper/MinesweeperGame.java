package com.codegym.games.minesweeper;

import com.codegym.engine.cell.Game;

public class MinesweeperGame extends Game {

    private static final int SIDE = 9;
    public void initialize(){
        setScreenSize(SIDE, SIDE);
    }


}
