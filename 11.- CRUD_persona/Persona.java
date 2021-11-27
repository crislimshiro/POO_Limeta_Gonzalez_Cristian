


public class Perosona{

    //variables
    private int id;
    private String nombre;
    private int edad;

    //construtor
    public Persona(){

    }

    //sobrecargo al constructor
    public Persona(int id, String nombre, int edad){
        //para inicializar las variables ocupo this
        this.id = id;   //aqui le estoy diciendo que la variable id le asigno el valor del parametro id
        this.nombre = nombre;
        this.edad = edad;
    }

}