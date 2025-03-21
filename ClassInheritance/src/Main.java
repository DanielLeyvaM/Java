import alumno.AlumnoHerencia;
import persona.Persona;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Creacion objeto persona ---");
        Persona p1= new Persona();
        //p1.name="Daniel";         //private attribute
        p1.setName("Nombre 1");
        System.out.println(p1.getName());

        p1.setEdad(10);
        System.out.println(p1.getEdad());

        //p1.mostrarPersona();

        //Clase Alumno
        System.out.println("--- Creacion objeto alumno ---");
        AlumnoHerencia a1= new AlumnoHerencia(1);
        a1.setName("Daniel Leyva");
        a1.setEdad(24);
        a1.mostrarPersona();

    }
}