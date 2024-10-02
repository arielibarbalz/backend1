package presencial;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

    private List<Persona> personas;

    public List<Persona> getPersonas() {
        return personas;
    }

    public Grupo(){
        personas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona){
        boolean checkMayoria = persona.esMayorEdad();
        boolean checkCantLetras = persona.cantLetras();
        boolean soloLetras = persona.checkAZ();
        boolean checkEdad = persona.checkEdad();
        if (checkMayoria && checkCantLetras && soloLetras && checkEdad){
            personas.add(persona);
        }
        else {
            System.out.println("No se pudo agregar a la persona: "+ persona.getNombre()+" "+ persona.getApellido());
        }
    }
}
