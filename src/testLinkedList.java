import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class testLinkedList extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */

  public void testEmptyList() 
  {
    SortedLinkedList list = new SortedLinkedList();
    assertEquals(0, list.length());
    assertEquals(null, list.getName(0));
    assertEquals(-1, list.getQuantity(0));
  }

  public void testSingleNode() 
  {
    SortedLinkedList list = new SortedLinkedList();
    list.insert("Cats", 6);
    assertEquals(1, list.length());
    assertEquals(true, list.isMember("Cats"));
  }
  
  public void testSecondNodeNewHead()
  {
    SortedLinkedList list = new SortedLinkedList();
    list.insert("Cats", 6);
    list.insert("Dogs", 2);
    assertEquals(2, list.length());
  }
  
  public void testRepeatedHeadInsert()
  {
    SortedLinkedList list = new SortedLinkedList();
    list.insert("Cats", 6);
    list.insert("Dogs", 2);
    list.insert("Hippos", 11);
    list.insert("Squirrels", 5);
    list.insert("Birds", 3);
    assertEquals(5, list.length());
  }
  
  public void testSecondTail()
  {
  } 
}