/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalgame;

import javax.swing.JOptionPane;

/**
 *
 * @author henrydiazlds
 */
public class Score {

    int gamesPlayed;
    int gamesWon;
    int gamesLost;
    int gamesTies;

    double gamePercent;

    String lblStatics;

    public void computeScore(String player) {

        String playerName = player;
        gamesWon = 0;
        gamesLost = 0;
        gamesTies = 0;
        gamesPlayed = gamesWon + gamesLost + gamesTies;

        if (gamesPlayed == 0) {
            JOptionPane.showMessageDialog(null, playerName + ", You Need to play first.", "Game Statics for "
                    + playerName, JOptionPane.PLAIN_MESSAGE);
        } else {
            gamePercent = (double) (gamesWon) * 100 / (gamesPlayed);
            gamePercent = Math.round(gamePercent * 100) / 100.0d;    //Redondea a dos decimales
            lblStatics = "Games Played: " + gamesPlayed
                    + "\nGames Won: " + gamesWon
                    + "\nGames Lost: " + gamesLost
                    + "\nGames Ties: " + gamesTies
                    + "\nPercent: " + gamePercent + "%";

            JOptionPane.showMessageDialog(null, lblStatics, "Game Statics for "
                    + playerName, JOptionPane.PLAIN_MESSAGE);
        }
    }//end computeScore

}
