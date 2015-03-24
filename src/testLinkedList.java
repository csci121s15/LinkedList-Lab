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
    assertEquals(0, s.length());
  }
  public void testSingleNode(){
    SortedLinkedList s = new SortedLinkedList();
    s.insert("Steve", 5);
    
    assertEquals("Steve", s.getName(0));
    assertEquals(5, s.getQuantity(0));
    assertEquals(true, s.isMember("Steve"));
    assertEquals(1, s.length());
  }
  public void testSecondNodeNewHead(){
    SortedLinkedList s = new SortedLinkedList();
    s.insert("Steve", 5);
    s.insert("Bill", 10);
    
    assertEquals("Bill", s.getName(0));
    assertEquals("Steve", s.getName(1));
  }
  public void testSecondNodeAfterHead(){
    SortedLinkedList s = new SortedLinkedList();
    s.insert("Bill", 10);
    s.insert("Steve", 5);
    
    assertEquals("Bill", s.getName(0));
    assertEquals("Steve", s.getName(1));
  }
  public void testRepeatedHeadInsert(){
    SortedLinkedList s = new SortedLinkedList();
    s.insert("Steve", 5);
    s.insert("Bill", 10);
    s.insert("Sam", 20);
    
    assertEquals(3, s.length());
    assertEquals("Sam", s.getName(0));
    assertEquals("Bill", s.getName(1));
    assertEquals("Steve", s.getName(2));
  }
  public void testSecondTail(){
    SortedLinkedList s = new SortedLinkedList();
    s.insert("Steve", 5);
    s.insert("Bill", 10);
    
    assertEquals("Bill", s.getName(0));
    assertEquals("Steve", s.getName(1));
  }
  public void testMiddleThird(){
    SortedLinkedList s = new SortedLinkedList();
    s.insert("Steve", 5);
    s.insert("Sam", 20);
    s.insert("Bill", 10);
    
    assertEquals("Sam", s.getName(0));
    assertEquals("Bill", s.getName(1));
    assertEquals("Steve", s.getName(2));
  }
  public void testMiddleThird2(){
    SortedLinkedList s = new SortedLinkedList();
    s.insert("Bill", 10);
    s.insert("Steve", 5);
    s.insert("Sam", 20);
    
    assertEquals("Sam", s.getName(0));
    assertEquals("Bill", s.getName(1));
    assertEquals("Steve", s.getName(2));
  }
  public void testSame(){
    SortedLinkedList s = new SortedLinkedList();
    s.insert("Bill", 10);
    s.insert("Steve", 5);
    s.insert("Sally", 5);
    s.insert("Bilbo", 10);
    
    assertEquals("Bilbo", s.getName(0));
    assertEquals("Bill", s.getName(1));
    assertEquals("Sally", s.getName(2));
    assertEquals("Steve", s.getName(3));
    
  }
}
