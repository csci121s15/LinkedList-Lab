import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class SortedLinkedListTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testEmptyList() {
    SortedLinkedList l = new SortedLinkedList();
    
    assertEquals(null, l.getName(0));
    assertEquals(-1, l.getQuantity(0));
    assertEquals(0, l.length());
    assertFalse(l.isMember("Fred"));
  }
  
  public void testSingleNode() {
    SortedLinkedList l = new SortedLinkedList();
    
    l.insert("Fred", 1);
    
    
    assertEquals("Fred", l.getName(0));
    assertEquals(1, l.getQuantity(0));
    assertEquals(1, l.length());
    assertTrue(l.isMember("Fred"));
  }
  
  
  public void testSecondNodeNewHead() {
    SortedLinkedList l = new SortedLinkedList();
    
    l.insert("Fred", 1);
    l.insert("Cats", 5);
    
    //Index 0, the cats.
    assertEquals("Cats", l.getName(0));
    assertEquals(5, l.getQuantity(0));
    assertTrue(l.isMember("Cats"));
    
    //Index 1, Fred
    assertEquals("Fred", l.getName(1));
    assertEquals(1, l.getQuantity(1));
    assertTrue(l.isMember("Fred"));
    
    //Length == 2
    assertEquals(2, l.length());
    
  }
}
