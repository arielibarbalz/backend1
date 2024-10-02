package figuras;

public class Circulo implements Figura {

    private double radio;

    @Override
    public String calcularArea() {
        if (radio>0){
            return "El area del circulo es: " + Math.PI * Math.pow(radio,2)+" unidades";
        }
        else{
            return "No se puede calcular el area de un negativo";
        }

    }

    public Circulo(double radio) {
        this.radio = radio;
    }
}
