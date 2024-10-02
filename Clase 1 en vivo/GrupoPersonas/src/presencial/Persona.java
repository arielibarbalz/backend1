package presencial;

public class Persona {

    private String nombre;
    private Integer edad;
    private String apellido;

    public Persona(String nombre, Integer edad, String apellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean esMayorEdad() {

        return this.edad >= 18;
    }

    public boolean checkEdad() {

        boolean repuesta = false;
        if (edad > 0 && edad <= 120) {
            repuesta = true;
        }
        return repuesta;

    }

    public boolean cantLetras() {
        return nombre.length() >= 4;
    }

    public boolean checkAZ() {
        boolean repuesta = false;
        char[] array = nombre.toCharArray();
        for (char letra : array) {
            if (Character.isLetter(letra)) {
                repuesta = true;
            }
        }
        return repuesta;
    }
}