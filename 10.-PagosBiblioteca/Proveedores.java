/*

Suma de los costos de la biblioteca
costo mayor 
costo menor
costo Promedio
Costo total de los productos (libros)

*/


import java.util.*;
import javax.swing.*;
import java.lang.Math;


public classProveedores(){

    private String nombre_cliente;
    private String producto[] = new String[10];
    private String costo[] = new int[10];
    private int producto_existente[] = new int [10];

    //los metodos Getter y Setter de casa variable


    // menu

    public void MenuProveedores(){

        String text;
        //try catch para el manejo de errores
        // un ciclo de while para repetir las opciones
        text = JOptionPane.showInputDialog("Seleccione la funcion deseada: "
                                           + "\n 1.- Suma total de costos"
                                           + "\n 2.- Costo Mayor"
                                           + "\n 3.- Costo Menor"
                                           + "\n 4.- Costo Promedio"
                                           + "\n 5.- Costo Total del Promedio");

        /*

        De los libros que se crearon deberan de agregar la clse costo aplicando herencia 
        para que pueda manejar el costo de cada libro

        Libro drama = new Libro("la cumbre escarlata", "No me lo se", "12345-BN", 5, 44);
        Libro fantasmas = new Libros("Las cronicas Mutates", "No me lo se", "00345-BN", 3, 608);

        Si elijo la opcion 1 total del costo de la cumbre escarlata : 5*44

        Si elijo la opcion 2 se debe de obtener cual es el libro que tiene mayor costo: Las cronicas mutates con 608

        Si elijo la opcion 3 debe se salir el libro mas barato : la cumbre escarlata 44

        Si elijo la opcion 4 se de sacar el promedio de los costos de los Libros

        Si elijo la opcion 5 : deben de multiplicar cantidad de libros los ejemplares * costo de cada uno

        */

        //aqui hay que agregar el menu de las opciones
        int opcion;

        switch (opcion) {
            case 1:
                SumaTotal();
                break;
            case 2:
                CostoMayor();
                break;
            case 3:
                CostoMenor();
                break;
            case 4:
                CostoPromedio();
                break;
            case 5:
                CostoTotal();
                break;
        }
    }
}

