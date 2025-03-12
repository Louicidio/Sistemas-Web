package org.example;
import javax.swing.*;
import java.awt.*;

public class Model extends JFrame
{
    String text1, text2, concatenacao;

    public Model() {
        text1 = " ";
        text2 = " ";
    }

    public void setText(String text1, String text2) {
        this.text1 = text1;
        this.text2 = text2;
    }

    public void concatenar() {
      concatenacao = text1 + text2;
    }

    public String getConcatenacao() {
        return concatenacao;
    }
}
