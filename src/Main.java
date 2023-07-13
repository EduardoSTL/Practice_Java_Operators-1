import generi.Generic;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        scanner.nextLine();
        System.out.println("Propòrciona el id: ");
        scanner.nextLine();
        int id = Integer.parseInt(scanner.nextLine());*/

        String nombre = JOptionPane.showInputDialog("Proporciona el nombre: ");
        String apellido = JOptionPane.showInputDialog("Proporciona tu apellido: ");
        System.out.println("Tu nombre y apellido es: " + nombre + " " + apellido);
        String id = JOptionPane.showInputDialog("Digia tu id: ");
        System.out.println("Tu id es: " + id);
        if (id.isEmpty()){
            System.out.println("Id no puede sernulo");
        }else {
            System.out.println("Id ingresado con exito");
        }

        Generic<Boolean> booleanGeneric= new Generic<>(true);
        System.out.println(booleanGeneric.getValor());
    }
}