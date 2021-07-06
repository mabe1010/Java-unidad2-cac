/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriounidad2;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Obligatoriounidad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Consola = new Scanner(System.in);
        
        String nombre;
        String apellido;
        int edad;
        String entretenimiento;
        String editor;
        String sistema;
        
        System.out.println("Ingrese su nombre: ");
        nombre = Consola.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido = Consola.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = Consola.nextInt();
        System.out.println("Ingrese su hobbie: ");
        entretenimiento = Consola.nextLine();
        System.out.println("Ingrese su editor de codigo preferido: ");
        editor = Consola.nextLine();
        System.out.println("Ingrese el sistema operativo que utiliza: ");
        sistema = Consola.nextLine();
    }
    
}
