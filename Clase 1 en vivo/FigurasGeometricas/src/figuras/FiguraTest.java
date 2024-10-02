package figuras;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FiguraTest {
    @Test
    public void calcularAreaCirculo(){
        //DADO
        Figura circulo = new Circulo(6.0);
        String respEsp = "El area del circulo es: 113.09733552923255 unidades";
        //CUANDO
        String area = circulo.calcularArea();
        //ENTONCES
        Assertions.assertEquals(respEsp, area);
    }
    @Test
    public void calcularAreaCuadrado(){
        //DADO
        Figura cuadrado = new Cuadrado(5.0);
        String respEsp = "El calculo del area del cuadrado es: 25.0 unidades";
        //CUANDO
        String area = cuadrado.calcularArea();
        //ENTONCES
        Assertions.assertEquals(respEsp, area);
    }

}
