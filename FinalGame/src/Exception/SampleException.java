/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author Piedad
 */
public class SampleException {

    public static void main(String Args[]) {

        int[] error = new int[3];
        try {

            for (int e = 0; e < 4; ++e) {

                error[e] = e;

            }

            System.out.println(error);

        } catch (ArrayIndexOutOfBoundsException ex) {

            
            System.out.println("Sorry, that's an error!");

        } finally {

            System.out.println(error);

            
        }

    }
}
