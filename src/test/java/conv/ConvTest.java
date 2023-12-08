package conv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvTest {

    @Test 
    public void dolEur(){
        
        double d = 10.0;
        Conv c = new Conv();
        double resultado = c.dolEur(d);

        Assertions.assertEquals(9.46, resultado, 0.1);


    }

    @Test 
    public void realDol(){
        
        double r = 10.0;
        Conv c = new Conv();
        double resultado = c.realDol(r);

        Assertions.assertEquals(2.0, resultado, 0.1);


    }

    @Test 
    public void realEur(){
        
        double r = 10.0;
        Conv c = new Conv();
        double resultado = c.realEur(r);

        Assertions.assertEquals(1.88, resultado, 0.1);


    }

    @Test 
    public void libraDol(){
        
        double l = 10.0;
        Conv c = new Conv();
        double resultado = c.libraDol(l);

        Assertions.assertEquals(12.14, resultado, 0.1);
    }

    @Test
    public void realPeso(){
        double r = 10.0;
        Conv c = new Conv ();
        double resultado = c.realPeso(r);

        Assertions.assertEquals(694.94, resultado, 0.1);
    }
}
