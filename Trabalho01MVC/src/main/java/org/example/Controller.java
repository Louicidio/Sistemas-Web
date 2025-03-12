package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller extends JFrame
{
    Model model;
    View view;

    public Controller(View view, Model model) throws HeadlessException {
        this.view = view;
        this.model = model;
        view.setBotaoBehavior(new BotaoBehavior());
    }

    class BotaoBehavior implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String text1 = view.getText1();
            String text2 = view.getText2();

            model.setText(text1, text2);
            model.concatenar();

            String textConcatenado = model.getConcatenacao();

            view.setVisor(textConcatenado);
        }
    }

}
