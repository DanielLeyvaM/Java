package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--------- INGRESAR DATOS DESDE CONSOLA -----------
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String s1 = scan.next();                            //Lee solo una palabra
        System.out.println("Word = " + s1);

        scan.nextLine();                                    //Limpiar buffer
        System.out.println("Ingrese una oracion");
        String s2= scan.nextLine();                         //Lee todo el texto hasta salto de linea
        System.out.println("Text = " + s2);

        System.out.println("Ingrese un numero");
        int num= scan.nextInt();
        System.out.println("num = " + num);

        System.out.println("Ingrese un numero");            //Leer un numero en string y convertirlo a int
        int num2= Integer.parseInt(scan.next());
        System.out.println("num = " + num2);


        //----------- IMPRIMIR DATOS EN CONSOLA -----------
        //Snippets: sout,soutv, soutf...
        System.out.print("Print");                          //Imprime todo sin salto de linea
        System.out.print("Print\n");                        //Salto de linea manual

        System.out.println("Println");                      //Agrega salto de linea
        System.out.println("Println + variable:  "+s2);     //Imprimir variables

        System.out.printf("Printf\n");                      //Imprime texto con formato
        System.out.printf("Printf + variable: %s",s2);      //Se necesitan especificadores para los tipos de datos

    }
}