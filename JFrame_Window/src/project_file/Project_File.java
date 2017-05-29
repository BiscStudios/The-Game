package project_file;

import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class Project_File {

    public static void main(String[] args) {
        JFrame myFrame = new JFrame("RTS");
        myFrame.setResizable(false);
        myFrame.setSize(1000,600);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
    
}
