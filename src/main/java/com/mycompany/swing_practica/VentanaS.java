/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swing_practica;

import javax.swing.JFrame;

/**
 *
 * @author andres
 */
public class VentanaS {

    JFrame ventana;

    VentanaS() {
        crearVentana();
    }

    void crearVentana() {
        ventana = new JFrame();
        ventana.setTitle("titulo");
        ventana.setSize(400, 400);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
    }
}
