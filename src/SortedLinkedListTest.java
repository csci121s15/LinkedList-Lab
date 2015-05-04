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
    SortedLinkedList ll = new SortedLinkedList();
    
    assertEquals(null, ll.getName(0));
    assertEquals(-1, ll.getQuantity(0));
    assertEquals(0, ll.length());
    assertEquals(false, ll.isMember("eric"));
  }
  
  public void testSingleNodeList() {
    SortedLinkedList ll = new SortedLinkedList();
    
    ll.insert("robin", 5);
                
    assertEquals("robin", ll.getName(0));
    assertEquals(5, ll.getQuantity(0));
    assertEquals(1, ll.length());
    assertEquals(false, ll.isMember("eric"));
  }
  
  public void testSecondNodeNewHead() {
    SortedLinkedList ll = new SortedLinkedList();
    
    ll.insert("robin", 5);
    ll.insert("nightwing", 10);
    
    assertEquals("robin", ll.getName(1));
    assertEquals("nightwing", ll.getName(0));
    assertEquals(5, ll.getQuantity(1));
    assertEquals(10, ll.getQuantity(0));
    assertEquals(2, ll.length());
    assertEquals(false, ll.isMember("eric"));
  }
}
