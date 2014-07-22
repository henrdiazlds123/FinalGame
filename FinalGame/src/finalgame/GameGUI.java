package finalgame;

/**
 *
 * @author Henry J. DIAZ
 */
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

public final class GameGUI {

    //Declaracion de variables
    private JFrame mainFrame;
    private JFrame howtoFrame;
    private JFrame rulesFrame;
    private JFrame aboutFrame;
    
    String playerName;
    String flagMusic;
    String upperInput;

    boolean musicStatus = false;

    //Constructor
    public GameGUI() throws IOException, InterruptedException {

        getName();

    }//end Constuctor

    public void getName() throws IOException {
        //Player Name input window
        while (true) {
            playerName = JOptionPane.showInputDialog(null, "Enter your name to start playing", "User Name",
                    JOptionPane.QUESTION_MESSAGE);
            if (playerName == null || playerName.length() < 1) {
            } else {
                break;
            }
        }
        //Ejecuta la siguiente instruccion.
        displayGretting();
    }

    public void displayGretting() throws IOException {
        //show Gretting Window
        String jugador = playerName.toUpperCase();
        JOptionPane.showMessageDialog(null, Message.WELCOME_GRETTING.getValue(), "Welcome " + jugador,
                JOptionPane.PLAIN_MESSAGE);

        prepareGUI();
    }//end displayGretting

    private void prepareGUI() {
        mainFrame = new JFrame("Connect Four - CIT260");
        mainFrame.setSize(600, 400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);      //en el centro del monitor
        mainFrame.setResizable(false);

        howtoFrame = new JFrame("Connect Four - How to Play");  //Titulo
        howtoFrame.setSize(300, 300);
        howtoFrame.setLocationRelativeTo(null);

        rulesFrame = new JFrame("Connect Four - Game Rules");   //Titulo
        rulesFrame.setSize(300, 300);
        rulesFrame.setLocationRelativeTo(null);

        aboutFrame = new JFrame("Connect Four - About Us");     //Titulo
        aboutFrame.setSize(300, 300);
        aboutFrame.setLocationRelativeTo(null);

    }//end prpareGUI

    private void showMenu() throws InterruptedException {
        //create a menu bar
        JMenuBar menuBar = new JMenuBar();

        //create menus
        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");
        JMenu optionsMenu = new JMenu("Options");

        //create menu items
        JMenuItem newMenuItem = new JMenuItem("New game");
        JMenuItem staticsMenuItem = new JMenuItem("Show Staticts");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        JMenuItem howMenuItem = new JMenuItem("How to Play");
        JMenuItem rulesMenuItem = new JMenuItem("Game rules");
        JMenuItem aboutMenuItem = new JMenuItem("About");
        JMenuItem musicOnItem = new JMenuItem("Sound On");
        JMenuItem musicOffItem = new JMenuItem("Sound Off");

        //add menu items to menu);
        fileMenu.add(newMenuItem);
        fileMenu.add(staticsMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
        helpMenu.add(howMenuItem);
        helpMenu.add(rulesMenuItem);
        helpMenu.addSeparator();
        helpMenu.add(aboutMenuItem);

        //if (!musicStatus) {
            optionsMenu.add(musicOnItem);
        /*} else {
            optionsMenu.remove(musicOnItem);
        }

        if (musicStatus) {*/
            optionsMenu.add(musicOffItem);
        /*} else {
            optionsMenu.remove(musicOffItem);
        }*/

        //add menu to menubar
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        menuBar.add(optionsMenu);

        //add menubar to the frame
        mainFrame.setJMenuBar(menuBar);
        mainFrame.setVisible(true);

        //add actions to show windows
        staticsMenuItem.addActionListener((ActionEvent e) -> {
            Score score = new Score();
            score.computeScore(playerName);
        });

        rulesMenuItem.addActionListener((ActionEvent e) -> {
            gameRulesMenu();
        });

        howMenuItem.addActionListener((ActionEvent e) -> {
            howToHelpMenu();
        });

        aboutMenuItem.addActionListener((ActionEvent e) -> {
            aboutMenu();
        });

        musicOnItem.addActionListener((ActionEvent e) -> {
            Sound.BACK.loop();
            musicStatus = true;
        });

        musicOffItem.addActionListener((ActionEvent e) -> {
            Sound.BACK.stop();
            musicStatus = false;
        });

    }//end showMenu

    public void howToHelpMenu() {
        JOptionPane.showMessageDialog(null, Message.HOW_PLAY.getValue(), "HOW TO PLAY ",
                JOptionPane.PLAIN_MESSAGE);

    }//end howToHelpMenu

    public void gameRulesMenu() {
        JOptionPane.showMessageDialog(null, Message.GAME_RULES.getValue(), "GAME RULES",
                JOptionPane.INFORMATION_MESSAGE);

    }//end gameRulesMenu

    public void aboutMenu() {
        JOptionPane.showMessageDialog(null, "Estos son los creadores del juego.", "ABOUT US ",
                JOptionPane.PLAIN_MESSAGE);

    }//end aboutMenu

    public static void main(String[] args) throws IOException, InterruptedException {
        GameGUI iniciar = new GameGUI();
        iniciar.showMenu();
    }//end Main

}//end Class Main
