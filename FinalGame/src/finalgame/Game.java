/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalgame;

import static finalgame.BoardView.createPattern;
import static finalgame.BoardView.printPattern;
import static finalgame.Winner.checkWinner;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author henrydiazlds
 */
public class Game implements java.io.Serializable {

    private int gamesPlayed = 0;
    private int gamesWonR = 0;
    private int gamesWonB = 0;
    private int tieCounter = 0;

    String choose = null;
    //String invalidEntry = "Wrong Entry, Please try again.\n";

    boolean valid = true;

    Game() {

        String[][] f = createPattern();

        boolean loop = true;
        int count = 0;

        printPattern(f);

        while (loop) {

            if (count % 2 == 0) {
                Player.PlayerMove("RED", "R", f);
            } else {
                Player.PlayerMove("BLUE", "B", f);
            }
            count++;                 //game counter

            /*Tie Game tester
             if(count == 42){
             if(checkWinner(f) == null){
             System.out.println("Game tie");
             tieCounter++;
             break;
             }

             }*/
            printPattern(f);

            if (checkWinner(f) != null) {
                switch (checkWinner(f)) {
                    case "R":
                        System.out.println(Message.RED_WON.getValue());
                        gamesWonR++;
                        Sound.stopMusic();
                        break;
                    case "B":
                        System.out.println(Message.BLUE_WON.getValue());
                        gamesWonB++;
                        Sound.stopMusic();
                        break;
                        
                }
                //if someone won you need choose what to do.
                gamesPlayed++;

                while (valid) {
                    //user entry
                    try {
                        Scanner input = new Scanner(System.in);
                        System.out.println(Message.GAME_OVER.getValue());
                        choose = input.nextLine();
                    } catch (IndexOutOfBoundsException | NumberFormatException ex) {
                    //validating user entry
                        //if (choose == null || choose.length() < 1) {
                        System.out.println(Message.INVALID_ENTRY.getValue());
                    } //} 
                    //else {
                    finally {
                        if (choose.equals("1") || choose.equals("2")) {
                            break;
                        } else {

                            System.out.println(Message.INVALID_ENTRY.getValue());
                        }
                    }
                }

                //option 1
                switch (choose) {
                    case "1":
                        BoardView.clearBoard();

                        //option 2  
                        break;
                    case "2":
                        loop = false;
                        System.out.println("juegos Jugados: " + gamesPlayed);
                        System.out.println("red: " + gamesWonR);
                        System.out.println("blue: " + gamesWonB);
                        System.exit(0);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Interfase interfase = new Interfase();
        interfase.getName();
        new Game();
    }
}

