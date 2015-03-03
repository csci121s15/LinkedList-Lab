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
  
}
