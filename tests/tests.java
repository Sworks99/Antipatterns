import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class tests {
    static Car car;

    @BeforeAll
    public static void setup() throws Exception {

        car = new Car("audi",2004,"45-23-fg","a3","preto");
    }

    @Test
    public void testCar1() throws CarNotValidatedException {
        Car car = new Car("audi",2004,"45-23-fg","a3","preto");
        System.out.println("Teste que verifica o marca, matricula,modelo e cor.");
        assertEquals("audi", car.getMarca());
        System.out.println("Marca: " + car.getMarca());

        car.novacor("azul");
        assertEquals("preto", car.getCor());
        System.out.println("Cor: " + car.getCor());
    }

    @Test
    public void testCar2(){
        assertEquals(2004, car.getAno());
    }

    @Test
    public void testCarroMatricula() {
        assertEquals("45-23-fg", car.getMatricula());
    }

    @Test
    public void testCarroModelo() {
        assertEquals("a3", car.getModelo());

    }

}
