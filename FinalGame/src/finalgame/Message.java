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
    GAME_RULES (", Estas son las reglas a seguir"),
    ABOUT_US (", Estos son los creadores del juego."),
    HOW_PLAY ("");
    
    
    private final String value;

    private Message (String v){
        this.value = v;
   
}
    public String getValue(){
        return value;
    }
}
