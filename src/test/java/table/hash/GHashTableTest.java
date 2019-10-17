package table.hash;

import org.junit.Test;

/**
 * A class maintaining tests for our generic Hash Table.
 */
public class GHashTableTest {
    
    /**
     * Assert that a new table is completely empty.
     */
    @Test
    public void testNewTableIsEmpty() {
        var table = new GHashTable<String>();
        var originalCount = table.size();
        org.junit.Assert.assertTrue(originalCount == 0);
    }

    /**
     * Assert that a new node accepts a new value.
     */
    @Test
    public void testAddValueIsValid() {
        var value = "test";
        var table = new GHashTable<String>();
        var key = value.hashCode();
        table.addValue(value);
        var size = table.size();
        var node = table.getValue(key);
        org.junit.Assert.assertTrue(size.equals(1));
        org.junit.Assert.assertTrue(node.size() == 1);
        org.junit.Assert.assertTrue(node.get(0).equals("test"));
    }
}
