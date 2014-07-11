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
public class Interfase {

    String playerName;

    public void getName() throws IOException {

        //playerName = JOptionPane.showInputDialog(null,"Enter your name to start playing", "User Name", JOptionPane.QUESTION_MESSAGE); 
        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter your name: ");//Pregunta el nombre del jugador
        this.playerName = inputName.nextLine();     //Asigna la entrada a la variable playerName*/

        //Ejecuta la siguiente instruccion.
        displayGretting();
    }

    public void displayGretting() throws IOException {

        //JOptionPane.showMessageDialog(null, welcomeGretting, "Welcome " + playerName, JOptionPane.PLAIN_MESSAGE);
        System.out.println("\nWelcome "
                + this.playerName + "!\n");        //Welcome Message
        System.out.println(Message.WELCOME_GRETTING.getValue());

        Sound.chooseMusic(playerName);
    }
}
