/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exception;

/**
 *
 * @author kylugo
 */
public final class BoardException extends Exception {

    public static void main(String Args[]) {

        int[] input = new int[8];
        try {
            for (int i = 0; i < 7; ++i) {
                input[i] = i;
            }
            System.out.println(input);
            
        } catch (ArrayIndexOutOfBoundsException ex) {

            System.out.println("Try selecting a columns from 1 - 7");
        }
    }
}
