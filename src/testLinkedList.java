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
  public void testEmptyList() {
    SortedLinkedList s = new SortedLinkedList();
    assertEquals(s.getName(0), null);
    assertEquals(s.getQuantity(0), -1);
    assertEquals(s.length(), 0);
    assertTrue(s.isMember(null));    
  }
    
  public void testOneNode() {
    SortedLinkedList s = new SortedLinkedList();
    s.insert("A", 5);
      
    assertEquals(s.getName(0), "A");
    assertEquals(s.getQuantity(0), 5);
    assertEquals(s.length(), 1);
    assertTrue(s.isMember("A"));
    
  }
  
  public void testTwoNodes() {
    SortedLinkedList s = new SortedLinkedList();
    s.insert("A", 5);
    s.insert("B", 10);
      
    assertEquals(s.getName(0), "B");
    assertEquals(s.getName(1), "A");
    assertEquals(s.getQuantity(0), 10);
    assertEquals(s.getQuantity(1), 5);
    assertEquals(s.length(), 2);
    assertTrue(s.isMember("A"));
    assertTrue(s.isMember("B"));
    
  }
    
  public void testThreeNode(){
    SortedLinkedList s = new SortedLinkedList();
    s.insert("A", 5);
    s.insert("B", 10);
    s.insert("C", 15);
    s.insert("D", 7);
    s.insert("E", 4);
    s.insert("F",12);
      
    assertEquals(s.getName(0), "C");
    assertEquals(s.getName(1), "F");
    assertEquals(s.getName(2), "B");
    assertEquals(s.getName(3), "D");
    assertEquals(s.getName(4), "A");
    assertEquals(s.getName(5), "E");
    assertEquals(s.getQuantity(0), 15);
    assertEquals(s.getQuantity(1), 12);
    assertEquals(s.getQuantity(2), 10);
    assertEquals(s.getQuantity(3), 7);
    assertEquals(s.getQuantity(4), 5);
    assertEquals(s.getQuantity(5), 4);
    assertEquals(s.length(), 6);
    assertTrue(s.isMember("C"));
    assertTrue(s.isMember("A"));
    assertTrue(s.isMember("B"));
    assertTrue(s.isMember("D"));
    assertTrue(s.isMember("E"));
    assertTrue(s.isMember("F"));
    
  }
 
  public void testDoubleTailInsert(){
    SortedLinkedList s = new SortedLinkedList();
    s.insert("A", 15);
    s.insert("B", 10);
    s.insert("C", 5);
    s.insert("D", 3);
    
    assertEquals(s.getName(0), "A");
    assertEquals(s.getName(1), "B");
    assertEquals(s.getName(2), "C");
    assertEquals(s.getName(3), "D");
    assertEquals(s.getQuantity(0), 15);
    assertEquals(s.getQuantity(1), 10);
    assertEquals(s.getQuantity(2), 5);
    assertEquals(s.getQuantity(3), 3);
    assertEquals(s.length(), 4);
    assertTrue(s.isMember("C"));
    assertTrue(s.isMember("A"));
    assertTrue(s.isMember("B"));
    assertTrue(s.isMember("D"));
    }

}

