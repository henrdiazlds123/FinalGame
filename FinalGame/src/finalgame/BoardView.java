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
public class BoardView {

    public static String[][] createPattern() {

        String[][] f = new String[7][15];

        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[i].length; j++) {
                if (j % 2 == 0) {
                    f[i][j] = "|";
                } else {
                    f[i][j] = " ";
                }

                if (i == 6) {
                    f[i][j] = "-";
                }
            }
        }
        return f;
    }

    public static void printPattern(String[][] f) {

        String header = " 1 2 3 4 5 6 7";

        System.out.println(header);
        System.out.println("---------------");

        for (String[] f1 : f) {
            for (String item : f1) {
                System.out.print(item);
            }
            System.out.println();
        }
        System.out.println(header);
    }

    public static void clearBoard() {

        String[][] f = new String[7][15];

        for (String[] f1 : f) {
            for (int j = 0; j < f1.length; j++) {
                if (j % 2 != 0) {
                    f1[j] = " ";
                }
            }
        }
        //System.out.println("\n\n");
        //new Game();       
    }
}
