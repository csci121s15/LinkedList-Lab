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
  
  public void testRepeatedHeadInsert() {
    SortedLinkedList l = new SortedLinkedList();
    
    l.insert("Fred", 1);
    l.insert("Cats", 5);
    l.insert("Spaghetti", 58);
    
    //Index 0, the spaghetti
    assertEquals("Spaghetti", l.getName(0));
    assertEquals(58, l.getQuantity(0));
    assertTrue(l.isMember("Spaghetti"));

    //Index 1, the cats.
    assertEquals("Cats", l.getName(1));
    assertEquals(5, l.getQuantity(1));
    assertTrue(l.isMember("Cats"));
    
    //Index 2, Fred
    assertEquals("Fred", l.getName(2));
    assertEquals(1, l.getQuantity(2));
    assertTrue(l.isMember("Fred"));
    
    //Length == 3
    assertEquals(3, l.length());
  }
  
  public void testSecondTail() {
    SortedLinkedList l = new SortedLinkedList();
    
    l.insert("Cats", 5);
    l.insert("Fred", 1);
    
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
  
  public void testMiddleThird() {
    SortedLinkedList l = new SortedLinkedList();
    
    l.insert("Spaghetti", 58);
    l.insert("Fred", 1);
    l.insert("Cats", 5);
    
    //Index 0, the spaghetti
    assertEquals("Spaghetti", l.getName(0));
    assertEquals(58, l.getQuantity(0));
    assertTrue(l.isMember("Spaghetti"));

    //Index 1, the cats.
    assertEquals("Cats", l.getName(1));
    assertEquals(5, l.getQuantity(1));
    assertTrue(l.isMember("Cats"));
    
    //Index 2, Fred
    assertEquals("Fred", l.getName(2));
    assertEquals(1, l.getQuantity(2));
    assertTrue(l.isMember("Fred"));
    
    //Length == 3
    assertEquals(3, l.length());
  }
  
  public void testFinaltest() {
    SortedLinkedList l = new SortedLinkedList();
    
    l.insert("Dogs", 10);
    l.insert("Lucky Charms", 777);
    l.insert("Cats", 5);
    l.insert("Spaghetti", 58);
    l.insert("Pineapples", 50);
    l.insert("Fred", 1);
    
    //Index 0, the Lucky Charms
    assertEquals("Lucky Charms", l.getName(0));
    assertEquals(777, l.getQuantity(0));
    assertTrue(l.isMember("Lucky Charms"));
    
    //Index 1, the Spaghetti
    assertEquals("Spaghetti", l.getName(1));
    assertEquals(58, l.getQuantity(1));
    assertTrue(l.isMember("Spaghetti"));
    
    //Index 2, the Pineapples
    assertEquals("Pineapples", l.getName(2));
    assertEquals(50, l.getQuantity(2));
    assertTrue(l.isMember("Pineapples"));
    
    //Index 3, the Dogs
    assertEquals("Dogs", l.getName(3));
    assertEquals(10, l.getQuantity(3));
    assertTrue(l.isMember("Dogs"));
    
    //Index 4, the Cats
    assertEquals("Cats", l.getName(4));
    assertEquals(5, l.getQuantity(4));
    assertTrue(l.isMember("Cats"));
    
    //Index 5, Fred
    assertEquals("Fred", l.getName(5));
    assertEquals(1, l.getQuantity(5));
    assertTrue(l.isMember("Fred"));
    
    //Length == 6
    assertEquals(6, l.length());
  }
}
