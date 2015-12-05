package mx.iteso;

import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table1;
import mx.iteso.singleton.tables.Table2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Table2Test {

    @Test
    public void testTable1Instance(){
        TableOrder table2 = Table2.getInstance();
        TableOrder table22 = Table2.getInstance();
        assertEquals(true, table2 == table22);
    }

    @Test
    public void testTable1Name(){
        Table1.clearOrder();
        TableOrder table2 = Table2.getInstance();
        assertEquals("Table 2", table2.tableName);
    }

    @Test
    public void testClear(){
        TableOrder table2 = Table2.getInstance();
        Table2.clearOrder();
        TableOrder table22 = Table2.getInstance();
        assertEquals(false, table2 == table22);
    }

}
