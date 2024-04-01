package Entrada_de_datos;

import javax.swing.JOptionPane;

public class InterfazJoptionPane {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null, "¿Cual es tu nombre?");
        int edad = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "¿Cuál es tu edad?")
                ); 
        JOptionPane.showMessageDialog(null, "Bienvenido " + nombre + " con " + edad + " años");
    }
}
