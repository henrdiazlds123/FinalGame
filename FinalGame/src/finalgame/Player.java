/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalgame;

import static finalgame.Move.dropAChip;

/**
 *
 * @author henrydiazlds
 */
public class Player {
    
    public static void PlayerMove(String playerName, String playerColor, String[][] position){
        String player = playerName;
        String color = playerColor;
        String [][] f = position;
        
        dropAChip(f, player, color);
        
    }   
}
