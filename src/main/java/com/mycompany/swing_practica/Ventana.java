/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swing_practica;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author andres
 */
public class Ventana extends JFrame {
    public Ventana(){
        this.setTitle("Swing Practicas");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(300,300));
        this.getContentPane().setBackground(Color.GREEN);

        iniciarPanel();
        this.setVisible(true);
    }

    private void iniciarPanel(){
        this.setLayout(new BorderLayout());

        JPanel panel=crearPanel();
        JPanel navigateBar=NavigateBar();
        JButton button=crearButton();

        agregarLabel(navigateBar);

        this.add(button,BorderLayout.SOUTH);
        this.add(navigateBar,BorderLayout.NORTH);
        this.add(panel,BorderLayout.CENTER);
    }


    private  JPanel crearPanel(){
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,300));
        panel.setBackground(Color.WHITE);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        return panel;
    }

    private void agregarLabel(JPanel panel){
        JLabel label=new JLabel("Jose  Ramirez",SwingConstants.CENTER);
        label.setFont(new Font("times new roma",Font.BOLD | Font.ITALIC,38 ));
        label.setForeground(Color.white);

        panel.add(label);
    }

    private  JPanel NavigateBar(){
        JPanel navigateBar = new JPanel();
        navigateBar.setPreferredSize(new Dimension(500,100));
        navigateBar.setBackground(Color.RED);
        navigateBar.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        navigateBar.setLocation(0,0);
        return navigateBar;
    }

    private  JButton crearButton(){
        JButton button=new JButton("!click me¡");

        button.setFont(new Font("times new roma",Font.BOLD|Font.ITALIC,38));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setFocusPainted(false);

        button.setContentAreaFilled(false);
        button.setOpaque(true);
        button.setBackground(new Color(0, 150, 255));
        button.setForeground(Color.WHITE);
        button.setBorder(BorderFactory.createLineBorder(Color.blue,2));

        button.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseEntered(java.awt.event.MouseEvent evt){
                button.setBackground(new Color(0,120,200));
            }
            public void mouseExited(java.awt.event.MouseEvent evt){
                button.setBackground(new Color(0,150, 255));

            }

        });

        button.addActionListener(e -> abrirVentanaSecundaria());

        return button;
    }

    private void abrirVentanaSecundaria() {
        JFrame nuevaVentana = new JFrame("Ventana secundaria");
        nuevaVentana.setSize(300, 200);
        nuevaVentana.setLocationRelativeTo(this);
        nuevaVentana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("¡Hola desde otra ventana!", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 18));

        nuevaVentana.add(label);
        nuevaVentana.setVisible(true);
    }
}
