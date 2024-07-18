package com.Testcodeup.mave.Test;

import javax.swing.*;
public class HolaMundo {
	private JFrame ventana =null;
    private JLabel saludo =null;
    public HolaMundo() {
    	ventana = new JFrame("Esto es un Swing");
    	saludo = new JLabel("Hola Mundo");
    	ventana.add(saludo);
    	ventana.setLocationRelativeTo(null);
    	ventana.pack();
    	ventana.setVisible(true);
    }
    public static void main(String[] args) {
    	new HolaMundo();
    }

}
