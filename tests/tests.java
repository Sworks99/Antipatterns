import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class tests {
    static Car car;

    /*
    @BeforeAll
    public static void setup() throws Exception {
        car = new Car("audi",2004,"45-23-fg","a3","preto");
    }

    //Happy Path, Enumerator, Loudmouth, Free ride
    @Test
    public void testCar1() throws CarNotValidatedException {
        car = new Car("audi",2004,"45-23-fg","a3","preto");
        System.out.println("Teste que verifica o marca, matricula,modelo e cor.");
        assertEquals("audi", car.getMarca());
        System.out.println("Marca: " + car.getMarca());

        car.novacor("azul");
        assertEquals("preto", car.getCor());
        System.out.println("Cor: " + car.getCor());
    }

    //Enumerator, Generous Leftovers
    @Test
    public void testCar2() throws CarNotValidatedException {
        assertEquals(2004, car.getAno());
    }

    //Generous Leftovers
    @Test
    public void testCarroMatricula() throws CarNotValidatedException {
        assertEquals("45-23-fg", car.getMatricula());
    }

    //Generous Leftovers
    @Test
    public void testCarroModelo() throws CarNotValidatedException {
        assertEquals("a3", car.getModelo());

    }*/

    @Test
    public void testCarNoException() throws CarNotValidatedException{
        assertDoesNotThrow(() -> {
            Car car = new Car("audi", 2004, "45-23-fg", "a3", "preto");
        });
    }

    @Test
    public void testCarExceptionMarca() throws CarNotValidatedException{
        assertThrows(CarNotValidatedException.class, () -> {
            Car car = new Car("", 2004, "a3", "a3", "preto");
        });
    }

    @Test
    public void testCarExceptionAno() throws CarNotValidatedException{
        assertThrows(CarNotValidatedException.class, () -> {
            Car car = new Car("", 0, "a3", "a3", "preto");
        });
    }

    @Test
    public void testCarExceptionMatricula() throws CarNotValidatedException{
        assertThrows(CarNotValidatedException.class, () -> {
            Car car = new Car("", 2004, "", "a3", "preto");
        });
    }

    @Test
    public void testCarExceptionModelo() throws CarNotValidatedException{
        assertThrows(CarNotValidatedException.class, () -> {
            Car car = new Car("", 2004, "a3", "", "preto");
        });
    }

    @Test
    public void testCarExceptionCor() throws CarNotValidatedException{
        assertThrows(CarNotValidatedException.class, () -> {
            Car car = new Car("", 2004, "a3", "a3", "");
        });
    }

    @Test
    public void testMarca() throws CarNotValidatedException {
        Car car = new Car("audi", 2004, "45-23-fg", "a3", "preto");
        System.out.println("Teste que verifica o marca, matricula,modelo e cor.");
        assertEquals("audi", car.getMarca());
    }

    @Test
    public void testCor() throws CarNotValidatedException {
        Car car = new Car("audi", 2004, "45-23-fg", "a3", "preto");
        car.novacor("azul");
        assertEquals("azul", car.getCor());
    }

    @Test
    public void testAno() throws CarNotValidatedException {
        Car car = new Car("audi", 2004, "45-23-fg", "a3", "preto");
        assertEquals(2004, car.getAno());
    }

    @Test
    public void testCarroMatricula() throws CarNotValidatedException {
        Car car = new Car("audi", 2004, "45-23-fg", "a3", "preto");
        assertEquals("45-23-fg", car.getMatricula());
    }

    @Test
    public void testCarroModelo() throws CarNotValidatedException {
        Car car = new Car("audi", 2004, "45-23-fg", "a3", "preto");
        assertEquals("a3", car.getModelo());
    }

}
