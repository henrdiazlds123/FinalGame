/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalgame;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author henrydiazlds
 */
public class Game implements java.io.Serializable {

    private int gamesPlayed = 0;
    private int gamesWonR   = 0;
    private int gamesWonB   = 0;
    private int tieCounter  = 0;
    

    String choose = null;
    String invalidEntry = "Wrong Entry, Please try again.\n";

    boolean valid = true;

    Game() {
        
    }


    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGamesWonR() {
        return gamesWonR;
    }

    public void setGamesWonR(int gamesWonR) {
        this.gamesWonR = gamesWonR;
    }

    public int getGamesWonB() {
        return gamesWonB;
    }

    public void setGamesWonB(int gamesWonB) {
        this.gamesWonB = gamesWonB;
    }

    public int getTieCounter() {
        return tieCounter;
    }

    public void setTieCounter(int tieCounter) {
        this.tieCounter = tieCounter;
    }

    public String getChoose() {
        return choose;
    }

    public void setChoose(String choose) {
        this.choose = choose;
    }

    public String getInvalidEntry() {
        return invalidEntry;
    }

    public void setInvalidEntry(String invalidEntry) {
        this.invalidEntry = invalidEntry;
    }

    public static void main(String[] args) throws IOException {
        Interfase interfase = new Interfase();
        interfase.getName();
        new Game();
    }
}
