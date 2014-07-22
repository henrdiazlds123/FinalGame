/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalgame;

/**
 *
 * @author henrydiazlds
 */
public enum Message {
    INVALID_ENTRY ("Wrong Entry, Please try again.\n"),
    RED_WON ("The RED player won.\n\n"),
    BLUE_WON ("The BLUE player won.\n\n"),
    WELCOME_GRETTING ("This is the fabulous game \"Four in a Line\".\n\n"
                + "You will be playing against the computer or against another player.\n"
                + "The objective of this game is to place four of your chips in a \n"
                + "line, either horizontally, vertically or diagonally.\n"
                + "Good Luck! and enjoy this fun and challenging game.\n"),
    GAME_OVER ("Do you want to play another game?\n"
                + "1. Yes\t2 .No"),
    CHOSE_MUSIC (", do you want to hear music while playing this game? "
                + "\nPlease, press Y or N to continue."),
    GAME_RULES ("The rules for connect-four are simple. The game is played \n"
            + "on an upright seven column board. Each column has six spots. \n"
            + "Two players play by alternately dropping a chip down one of \n"
            + "the columns. The chip drops to the lowest unoccupied spot in \n"
            + "that column. The first player to get four chips in a row, \n"
            + "either vertical, horizontal, or diagonal, wins. The game ends \n"
            + "in a stalemate if it fills before someone wins."),
    ABOUT_US ("GAME CREATORS.\n"
                + "\t\t\tGUI Designer - Karla Lugo\n"
                + "\t\t\tCODER - Piedad Ficklin\n"
                + "\t\t\tDEBBUGER - Henry Diaz"),
    HOW_PLAY ("To win Connect Four you must be the first player\n "
            + "to get four of your colored checkers in a row\n "
            + "either horizontally, vertically or diagonally.\n"
            + "To play the game each player must take a turn placing\n "
            + "their checkers. Go ahead and place your checker, then\n "
            + "it is the other player's turn.\n"
            + "The player must place the checker choosing a place\n "
            + "on the board from 1 to 7."
    );
    
    
    private final String value;

    private Message (String v){
        this.value = v;
   
}
    public String getValue(){
        return value;
    }
}
