package figuras;

public class Cuadrado implements Figura{
    private double lado;

    @Override
    public String calcularArea() {
        return "El calculo del area del cuadrado es: "+ lado*lado+" unidades";
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }
}
