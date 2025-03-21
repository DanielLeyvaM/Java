package alumno;

import persona.Persona;         //Import package

public class AlumnoHerencia extends Persona {
    int id;

    public AlumnoHerencia(int id){
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Method to override
    @Override
    public void mostrarPersona() {
        System.out.println("--- Metodo sobreescrito ---");
        System.out.println("Nombre: "+getName());
        System.out.println("Edad: "+getEdad());
        System.out.println("Id: "+this.id);

        //Mostrar metodo sobreescrito (super)
        System.out.println("--- Metodo original ---");
        super.mostrarPersona();
    }
}
