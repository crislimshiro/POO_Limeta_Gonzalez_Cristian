

/*
vamos a crear un programa para guardar los datos datos de animales domesticos
*/

public class Animal{

    /*
    Encapsulamiento:

    Es poder restringir el acceso a los tipos de dato
    Vamos a poder agrupar en una clse el acceso e los diferentes
    metodos, atributos u objetos de clase, para 
    que no puedan ser modificados desde otro lugar 

    */

    private String nombre, raza, tipo_alimento;
    private int edad;
    //private bolean sexo = false;

    
    /*
    Cuando estamos aplicando el escapsulamiento se debe de agregar los metodos
    constructores

    El constructor nos sirve para poder detectar la existencia de una clase
    para poder inicializar las variables de la clase
    para poder hacer las instancias de la clase
    */

    public Animal(){
        //esto es un constructor
        /*
        podemos inicializar las variables
        podemos aplicar la sobrecarga 
        */
    }
    
    public Animal(String nombre, String raza, String tipo_alimento, int edad, boolean sexo){
        //podemos realizar operaciones con cada unu de los parametros
        /*
        
        */
        this.nombre = nombre;
        this.raza = raza;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;
        this.sexo = sexo;
    }
    /*
    cuando los atributos son de tipo private:
    debemos de acceder a los datos a traves del uso de los metodos
    get obtener ->recibir
    set asignar ->enviar
    */
    //recibir
    public String getNombre(){
        return nombre;
    }

    //enviar
    public void setNombre(){
        this.nombre = Nombre;
    }
    //recivir
    public String getRaza(){
        return raza;
    }

    //enviar
    public void setRaza(){
        this.raza = Raza;
    }
     //recivir
     public String getTipo_alimento(){
        return raza;
    }

    //enviar
    public void setTipo_alimento(){
        this.tipo_alimento = Tipo_alimento;
    }
    //recivir
    public int getEdad(){
        return edad;
    }

    //enviar
    public void setEdad(){
        this.edad = Edad;
    }
    //recibir
    public Boolean getSexo(){
        return Sexo;
    }

    //enviar
    public void setSexo(){
        this.Sexo = sexo;
    }

}
