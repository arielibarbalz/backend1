package presencial;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class GrupoTest {
    @Test
    public void agregar2Persona() {
        //DADO
        Persona juan = new Persona("Juan", 18, "Lopez");
        Persona pedro = new Persona("Pedro", 17, "Guerra");
        Persona ana = new Persona("Ana", 22, "Castro");
        Persona luz = new Persona("Luz", 14, "Maradona");
        Persona julian = new Persona("Julian", 32, "Pistone");
        Grupo grupo = new Grupo();

        //CUANDO

        grupo.agregarPersona(juan);
        grupo.agregarPersona(pedro);
        grupo.agregarPersona(ana);
        grupo.agregarPersona(luz);
        grupo.agregarPersona(julian);
        //ENTONCES
        Assert.assertTrue(grupo.getPersonas().size()==2);

    }
}
