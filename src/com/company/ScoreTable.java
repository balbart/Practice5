package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class ScoreTable extends JFrame {
    private JButton team1plus;
    private JButton team2plus;
    private JButton Total;
    private JLabel Score;
    private JTextArea team2TextArea;
    private JTextArea team1TextArea;
    private JPanel Application;
    private int team1score = 0;
    private int team2score = 0;

    ScoreTable(String title) {
        super(title);
        setContentPane(Application);
        updateScore();
        team1plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team1score++;
                updateScore();
            }
        });
        team2plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team2score++;
                updateScore();
            }
        });
        Total.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(team1score > team2score) JOptionPane.showMessageDialog(Application, "Team 1 wins");
                else if(team1score < team2score) JOptionPane.showMessageDialog(Application, "Team 2 wins");
                else JOptionPane.showMessageDialog(Application, "Tie!");
            }
        });
    }

    private void updateScore(){
        Score.setText(Integer.toString(team1score) + "x" + Integer.toString(team2score));
    }
}
