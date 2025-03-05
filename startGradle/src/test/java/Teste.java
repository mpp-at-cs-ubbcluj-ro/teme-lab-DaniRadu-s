import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.mpp2025.domain.Arbitru;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Teste {

    @Test
    @DisplayName("First Test")
    public void testExample1(){
        Arbitru a = new Arbitru();
        assertEquals("",a.getNume());
        assertEquals("",a.getUsername());
    }
    
    @Test
    @DisplayName("Second Test")
    public void testExample2(){
        assertEquals(3,3,"Numere trebuie sa fie egale");
    }
}
