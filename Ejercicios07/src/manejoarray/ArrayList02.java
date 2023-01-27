/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArrayList02 {

    public static void main(String[] args) {
        ArrayList<String> arreglo2 = obtenerDatos();
        String cadenaFinal = obtenerCadenaFinal(arreglo2);
        System.out.printf("%s\n", cadenaFinal);
    }

    public static ArrayList<String> obtenerDatos() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> arreglo2 = new ArrayList<>();
        boolean bandera = true;
        String pais;
        while (bandera) {

            System.out.println("Ingrese datos para el arreglo: ");
            pais = entrada.nextLine();
            arreglo2.add(pais);
            System.out.println("Ingrese salir si desea terminar el proceso: ");
            String op = entrada.nextLine();

            if (op.equals("salir")) {
                bandera = false;
            }

        }
        return arreglo2;
    }

    public static String obtenerCadenaFinal(ArrayList<String> datos) {
        String cadena = "";
        for (int i = 0; i < datos.size(); i++) {
            cadena = String.format("%s%s\t",cadena , datos.get(i));
        }
        return cadena;
         
    }
}
