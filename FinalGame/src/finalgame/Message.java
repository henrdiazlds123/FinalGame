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
    GAME_RULES ("YYYYEstas son las reglas a seguir"),
    ABOUT_US ("YYYEstos son los creadores del juego.\n"
                + "GUI Designer - Karla Lugo\n"
                + "CODER - Piedad Ficklin\n"
                + "DEBBUGER - Henry Diaz"),
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
