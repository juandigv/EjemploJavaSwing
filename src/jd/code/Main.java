package jd.code;

import javax.swing.*;
import java.awt.*;
public class Main {
    public static void
    main(String[] args) {
        JFrame ventana = new JFrame("Swing es poder!!!");
        JLabel etiqueta = new JLabel("Ingresa un número:");
        JTextField campo =new JTextField(5);
        JButton boton = new JButton("Hazme click" );
        ventana.setLayout(new FlowLayout());
        ventana.add(etiqueta);
        ventana.add(campo);
        ventana.add(boton);
        ventana.setSize(400, 150);
        ventana.setVisible(true);
    }}