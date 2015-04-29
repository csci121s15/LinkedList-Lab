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
    assertTrue(list.isMember("Cats"));
    assertEquals(1, list.length());
    assertEquals(6, list.getQuantity(0));
    assertEquals("Cats", list.getName(0));
  }
  
  public void testSecondNodeNewHead()
  {
    SortedLinkedList list = new SortedLinkedList();
    list.insert("Cats", 6);
    list.insert("Dogs", 2);
    assertEquals(2, list.length());
    assertEquals(6, list.getQuantity(0));
    assertEquals(2, list.getQuantity(1));
    assertEquals("Cats", list.getName(0));
    assertEquals("Dogs", list.getName(1));
    assertTrue(list.isMember("Cats"));
    assertTrue(list.isMember("Dogs"));
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
    assertEquals("Hippos", list.getName(0));
    assertEquals("Dogs", list.getName(4));
    // should be order from greatest to least
    //list.print();
  }
  
  public void testSecondTail() {
    SortedLinkedList list = new SortedLinkedList();
    list.insert("Dogs", 2);
    list.insert("Cats", 6);
    assertEquals("Cats", list.getName(0));
    assertEquals("Dogs", list.getName(1));
  }

  public void testMiddleThird() {
    SortedLinkedList list = new SortedLinkedList();
    list.insert("Dogs", 2);
    list.insert("Cats", 6);
    list.insert("Birds", 3);
    assertEquals("Cats", list.getName(0));
    assertEquals("Birds", list.getName(1));
    assertEquals("Dogs", list.getName(2));
  }
  
  public void testInsertFront() {
    SortedLinkedList list = new SortedLinkedList();
    list.insert("Dogs", 2);
    list.insert("Birds", 3);
    list.insert("Hippos", 11);
    list.insert("Squirrels", 5);
    assertEquals("Hippos", list.getName(0));
    assertEquals("Squirrels", list.getName(1));
    assertEquals("Birds", list.getName(2));
    assertEquals("Dogs", list.getName(3));
  }

}