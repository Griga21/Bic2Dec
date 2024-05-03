package org.example.frame;

import javax.swing.*;
import java.awt.*;

public class AppBic2Dec extends JFrame {
    private JPanel jPanel= new JPanel(new BorderLayout());
    private JLabel title = new JLabel("Перевод из двоичной системы из счисления в десятичную");
    private JLabel bic = new JLabel("Двоичная система");
    private JLabel dec = new JLabel("Десятичная система");

    public void createApp(){
        setIconImage(new ImageIcon("src/main/resources/images.png").getImage());
        setTitle("From Bic to Dec");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
        setLocationRelativeTo(null);
        addFields();
        add(jPanel);
    }
    public void addFields(){
        jPanel.add(title, BorderLayout.NORTH);
        jPanel.add(bic, BorderLayout.CENTER);
        jPanel.add(dec, BorderLayout.CENTER);
    }
}
