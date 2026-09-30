//Crear un programa que determine el salario final de un trabajador 
//Si es Programador se agrega un 25% al salario total
//Si es Doctor se agrega 100 al salario 
//Si es Administrativo se agrega 2% del salario total
//Si tiene multa se descuenta $15 al salario total
//El programa debe recibir el nombre y el salario del trabajador
import java.util.*;

import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) 
    {
    String nombre;
    double salario = 600;
    int opcion;
        Scanner sc = new Scanner(System.in);
    System.out.println("----------------------");
    System.out.println("Ingresa una opcion:");
    System.out.println("1. Es programador");
    System.out.println("2. Es medico");
    System.out.println("3. Es administrativo");
    System.out.println("----------------------");
    
    opcion = sc.nextInt();
    switch (opcion) {
        case 1:
           salario = salario +(salario*0.25) ;
        case 2:
            
        case 3:
    }
JOptionPane.showMessageDialog(null, "El salario es: "+salario);
    }
}