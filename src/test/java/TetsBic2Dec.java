import org.junit.Assert;
import org.junit.Test;

import static org.example.Main.Bic2Dec;


public class TetsBic2Dec {
    @Test
    public void Test6(){Assert.assertEquals(6, Bic2Dec("00000110"));}
    @Test
    public void Test31(){Assert.assertEquals(31, Bic2Dec("00011111"));}
    @Test
    public void Test255(){Assert.assertEquals(255, Bic2Dec("11111111"));}
    @Test
    public void Test0(){Assert.assertEquals(0, Bic2Dec("00000000"));}
}
