package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame
{
    JTextField text1, text2;
    JLabel visor;
    JButton button;


    public View(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        text1 = new JTextField(20);
        add(text1);
        text2 = new JTextField(20);
        add(text2);
        visor = new JLabel(" ");
        add(visor);
        button = new JButton("Concatenar");
        add(button);
        pack();
        setVisible(true);
    }

    public String getText1(){
        return text1.getText();
    }
    public String getText2(){
        return text2.getText();
    }
    public void setBotaoBehavior(ActionListener botaoBehavior){
        button.addActionListener(botaoBehavior);
    }
    public void setVisor(String result){
        visor.setText(result);
    }
}
