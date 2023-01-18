import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class NumbersCatTest {

    @Test
    public void donar_0_retorna_Zero() { assertEquals("Zero", NumbersCat.say(0l));}

    @Test
    public void donar_1_retorna_Un() { assertEquals("Un", NumbersCat.say(1l));}

    @Test
    public void donar_9_retorna_Nou() { assertEquals("Nou", NumbersCat.say(9l));}

    @Test
    public void donar_Menys3_retorna_Tres() { assertEquals("Menys tres", NumbersCat.say(-3l));}

    @Test
    public void donar_30_retorna_Trenta() { assertEquals("Dos", NumbersCat.say(30l));}
}
