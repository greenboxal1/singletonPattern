package mx.iteso;

import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table1;
import mx.iteso.singleton.tables.Table3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Table3Test {
    @Test
    public void testTable1Instance(){
        TableOrder table3 = Table3.getInstance();
        TableOrder table33 = Table3.getInstance();
        assertEquals(true, table3 == table33);
    }

    @Test
    public void testTable1Name(){
        Table1.clearOrder();
        TableOrder table3 = Table3.getInstance();
        assertEquals("Table 3", table3.tableName);
    }

    @Test
    public void testClear(){
        TableOrder table3 = Table3.getInstance();
        Table3.clearOrder();
        TableOrder table33 = Table3.getInstance();
        assertEquals(false, table3 == table33);
    }
}
