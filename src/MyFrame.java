import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame (){
        this.setTitle("Java Gui By Lali346 (Open Source)"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application
        this.setResizable(false); //prevent frame from being resized
        this.setSize(420,420); //sets the x-dimension, and y-dimension of frame
        this.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("logo.png"); //create an ImageIcon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(new Color(0x123456)); //change color of background
    }
}
