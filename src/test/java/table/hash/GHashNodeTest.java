package table.hash;

import org.junit.Test;

/**
 * A class maintaining tests for our generic Hash Node.
 */
public class GHashNodeTest {
    
    /**
     * Assert that a new node is completely empty.
     */
    @Test
    public void testNewNodeIsEmpty() {
        var node = new GHashNode<String>(1);
        var originalCount = node.getValues().size();
        org.junit.Assert.assertTrue(originalCount == 0);
    }

    /**
     * Assert that a new node accepts a new value.
     */
    @Test
    public void testAddValueIsValid() {
        var node = new GHashNode<String>(1);
        var originalCount = node.getValues().size();
        node.addValue("test");
        var newCount = node.getValues().size();
        org.junit.Assert.assertTrue(originalCount != newCount);
        var value = node.getValues().get(0);
        org.junit.Assert.assertTrue(value.equals("test"));
    }
}
