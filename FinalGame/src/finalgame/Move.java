/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalgame;

import static finalgame.Sound.CHIP;
import java.util.Scanner;

/**
 *
 * @author henrydiazlds
 */
public class Move {
     
    public static void dropAChip(String[][] f, String player, String color) {
        boolean emptyRow = true;
        while (emptyRow) {
            System.out.println("Drop a "+ player +" chip at column (1–7): ");
            Scanner scan = new Scanner(System.in);

            //int input = scan.nextInt();
            int x = 2 * scan.nextInt() - 1;
            
            if (f[0][x] != " ") {//|| (input <1) || (input>7)) {
                System.out.println("Movement is not acepted");
                emptyRow = true;
            }
            for (int i = 6; i >= 0; i--) {

                if (f[i][x] == " ") {
                    f[i][x] = color;
                    CHIP.play();
                    emptyRow = false;
                    break;
                }
            }
        }
    }
    
    

    //public void isNotEmpty(int row){
    //    if (f[0][row])
    //}
}
