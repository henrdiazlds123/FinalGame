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
import java.applet.Applet;
import java.applet.AudioClip;
import java.util.Scanner;

public class Sound {

    public static AudioClip CHIP     = Applet.newAudioClip(Sound.class.getResource("ball.wav"));
    public static AudioClip GAMEOVER = Applet.newAudioClip(Sound.class.getResource("gameover.wav"));
    public static AudioClip BACK     = Applet.newAudioClip(Sound.class.getResource("back.wav"));
    //public static AudioClip WRONG = Applet.newAudioClip(Sound.class.getResource("wrong.wav"));

    public static void playMusic() {
        BACK.loop();
    }

    public static void stopMusic() {
        GAMEOVER.play();
        BACK.stop();
    }
    
    public static void chooseMusic(String player) {
        
        boolean musicStatus = false;
        String flagMusic;
        String upperInput;
        String playerName = player;
        String jugador = player.toUpperCase();
        while (true) {
            // prompt for input
            Scanner input = new Scanner(System.in);
            System.out.println("\n" + jugador
                    + ", do you want to hear music while playing this game? "
                    + "\nPlease, press Y or N to continue.");
            flagMusic = input.nextLine(); //assing the input to variable

            // no input entered?
            if (flagMusic == null || flagMusic.length() < 1) {
            } else {
                upperInput = flagMusic.substring(0, 1).toUpperCase(); //UpperCase
                if (upperInput.equals("Y") || upperInput.equals("N")) {
                    break;
                }
            }
        }
        //Play background music
        if (upperInput.equalsIgnoreCase("Y")) {
            System.out.println("Enabling Music...\n");
            Sound.BACK.loop();
        } else {
            musicStatus = true;
            Sound.BACK.stop();//end if 
        }
    }
}
