package persona;

public class Persona {
    //Atributos
    String name;            //Private is the default
    private int edad;

    //Constructores
    public Persona(){};     //empty constructor

    //Setters y getters
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Methods
    public void mostrarPersona(){
        System.out.println("Nombre: "+this.name);
        System.out.println("Edad: "+this.edad);
    }
}
