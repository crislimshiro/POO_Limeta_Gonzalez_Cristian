/*

para poder hacer el programa de la suma de dos numeros

debemos de entender el algoritmo de la suma

declarar variables

num1 num2 resueltos

1.-solo una vez se suma?
2.-voy a querer que se sumen los numeros y que se repita

*/

//es necesario ocupar librerias dentro de java para algunos procesos
//vamos a ocupar la libreria Scanner que nos sirve para obtener la entrada de datos

import java.util.Scanner;

class sumadedosnumeros{

    //el identado del codigo
    //metodo principal
    public static void main(String[] args){

        //definir un objeto de la libreria Scanner que nos sirva para obtener los datos
        Scanner entrada = new Scanner(System.in);
        /*
        para realizar una instancia del objeto se debe de colocar:

        nombreclase nombreobjeto = new nombreclase();

        System.in Es una clse superior donde nosotors podemos obtener los
        datos que vienen por parte de la entrada estandar de la computadora 
        */ 

        //definicion de variables
        int num1, num2;
        int resultado;

        System.out.println("Introduce el primer numero a sumar: ");
        //asignar el primer numero a su variable
        num1 = entrada.nextint();
        System.out.println("Introduce el segundo numero a sumar: ");
        //asignar el segundo numero a su valor
        num2 = entrada.nextint();

        resultado = num1 + num2;

        Systen.out.println("El resultado de la suma es: " + resultado);
    }
}
