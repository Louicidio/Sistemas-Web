package org.example;
import javax.swing.*;

public class main {
    public static void main(String[] args) {

            Model model = new Model();
            View view = new View();
            Controller controller = new Controller(view, model);

        }
    }