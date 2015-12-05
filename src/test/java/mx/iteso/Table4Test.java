package mx.iteso;

import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table1;
import mx.iteso.singleton.tables.Table4;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Table4Test {
    @Test
    public void testTable1Instance(){
        TableOrder table4 = Table4.getInstance();
        TableOrder table44 = Table4.getInstance();
        assertEquals(true, table4 == table44);
    }

    @Test
    public void testTable1Name(){
        Table1.clearOrder();
        TableOrder table4 = Table4.getInstance();
        assertEquals("Table 4", table4.tableName);
    }

    @Test
    public void testClear(){
        TableOrder table4 = Table4.getInstance();
        Table4.clearOrder();
        TableOrder table44 = Table4.getInstance();
        assertEquals(false, table4 == table44);
    }
}
