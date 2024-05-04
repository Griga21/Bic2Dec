package org.example.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.example.Main.Bic2Dec;

public class AppBic2Dec extends JFrame {
    private JPanel controlPanel= new JPanel();
    private JLabel bic = new JLabel("Двоичная система");
    private JLabel dec = new JLabel("Десятичная система");
    private JTextField textFieldBic = new JTextField();
    private JTextField textFieldDec = new JTextField();
    private JButton translate = new JButton("Перевести");
    private JButton change = new JButton("Поменять");

    public void createApp(){
        setIconImage(new ImageIcon("src/main/resources/images.png").getImage());
        setTitle("From Bic to Dec");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450,200);
        setVisible(true);
        setLocationRelativeTo(null);
        addFields();
        addAction();

    }
    public void addFields(){
        GridBagLayout layout = new GridBagLayout();
        controlPanel.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets =new Insets(10, 30, 0, 0);
        controlPanel.add(bic,gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 10;
        gbc.ipadx = 100;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets =new Insets(10, 0, 0, 30);
        controlPanel.add(textFieldBic,gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets =new Insets(10, 30, 0, 0);
        controlPanel.add(dec,gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.insets =new Insets(10, 0, 0, 30);
        controlPanel.add(textFieldDec,gbc);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets =new Insets(10, 30, 0, 10);
        controlPanel.add(translate,gbc);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.insets =new Insets(10, 10, 0, 30);
        controlPanel.add(change,gbc);

        this.add(controlPanel);
    }
    private void addAction(){
        translate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldDec.setText(Integer.toString((Bic2Dec(textFieldBic.getText()))));
            }
        });
    }
}
