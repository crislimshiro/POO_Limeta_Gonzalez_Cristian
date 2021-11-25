


public class Principal{


    public static void main(String[] args){

        //gracias al constructor poder hacer las instancias de las clases
        Perro dog = new Perro("pulgas", "de la calle", "Croquetas dogcaut", 1, true, "hace guau guau" );
        Perro cat = new Gato("Michi", "de colores", "wiscas", , true, "hace mia mia" );


        //vamos a mostrar los metodos del perro y del gato
        dog.mostrarPerro();
        cat.mostrarGato();
    }
}