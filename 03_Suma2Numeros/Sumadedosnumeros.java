/*

Para poder hacer el programa de la suma de dos numeros

debemos de entender el algoritmo de la suma

declarar variables

num1 num2 resultado

1.- solo una vez se sume?
2.- voy a querer que se sumen los numeros y que se repita

*/

//es necesario ocupar liberia dentro de java para algunos procesos
//vamos a ocupar la libreria Scaner que nos sirve para obtener la entrada de datos 

import java.util.Scanner;

class sumadedosnumeros{

    //el identado del codigo
    //metodo principal
    public static void main(String[] args){

        //definir un objeto de la liberia Scanner que nos sirva para obtener los datos
        Scanner entrada = new Scanner(System.in);
        /*
        para realizar una instancia del objeto se debe de colocar:
        
        Nombreclase nombreobjeto = new Nombreclase();

        System.in Es uba clase superior donde nosotros podemos odtener los
        datos que viene por parte de la entrada estandar de la computadora
         (por parte de la consola)
        */
        
        //definicion de variables
        int num1, num2;
        int resultado=0;

        do{

        System.out.println("Introduce los numeros que quieres sumar; si pones 0 se detiene la suma: ")
        //asignar el primer numero a su variable
        num1 = entrada.nextInt();
        //System.out.println("Introduce el segundo numero a sumar: ");
        //asignar el segundo numero a su variable
        //num2 = entrada.nextInt();

        resultado = resultado + num1;

        //System.out.println("El resultado de la suma es: " + resultado);

        }while(num1 !=0);

        System.out.println("El resultado de la suma es: "+ resultado);

    }
}