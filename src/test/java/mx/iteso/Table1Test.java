package mx.iteso;

import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Table1Test {

    @Test
    public void testTable1Instance(){
        TableOrder table1 = Table1.getInstance();
        TableOrder table11 = Table1.getInstance();
        assertEquals(true, table1 == table11);
    }

    @Test
    public void testTable1Name(){
        Table1.clearOrder();
        TableOrder table1 = Table1.getInstance();
        assertEquals("Table 1", table1.tableName);
    }

    @Test
    public void testClear(){
        TableOrder table1 = Table1.getInstance();
        Table1.clearOrder();
        TableOrder table11 = Table1.getInstance();
        assertEquals(false, table1 == table11);
    }
}
