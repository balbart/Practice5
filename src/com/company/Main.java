package com.company;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ScoreTable scoreTable = new ScoreTable("Practice 5 or 6 idk");
        scoreTable.setSize(400, 400);
        scoreTable.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        scoreTable.setVisible(true);
        scoreTable.setResizable(false);
    }
}
