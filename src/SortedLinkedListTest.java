import junit.framework.TestCase;

public class SortedLinkedListTest extends TestCase {
  public void testEmptyList() {
    SortedLinkedList a = new SortedLinkedList();
    assertEquals(null, a.getName(0));
    assertEquals(-1, a.getQuantity(0));
    assertEquals(0, a.length());
    assertEquals(false, a.isMember("Frank"));
   }
  public void testSingleNode() {
    SortedLinkedList a = new SortedLinkedList();
    a.insert("b", 1);
    assertEquals("b", a.getName(0));
    assertEquals(1, a.getQuantity(0));
    assertEquals(1, a.length());
    assertEquals(true, a.isMember("b")); 
   }
  public void testSecondNodeNewHead() {
    SortedLinkedList l = new SortedLinkedList();
    l.insert("a", 1);
    l.insert("b", 2);
    assertEquals("b", l.getName(0));
    assertEquals("a", l.getName(1));
    assertEquals(2, l.getQuantity(0));
    assertEquals(1, l.getQuantity(1));
    assertEquals(2, l.length());
    assertEquals(true, l.isMember("a"));
    assertEquals(true, l.isMember("b"));
  }

  public void testRepeatedHeadInsert() {
    SortedLinkedList l = new SortedLinkedList();
    l.insert("a", 1);
    l.insert("b", 2);
    l.insert("c", 3);
    assertEquals("c", l.getName(0));
    assertEquals("b", l.getName(1));
    assertEquals("a", l.getName(2));
    assertEquals(3, l.getQuantity(0));
    assertEquals(2, l.getQuantity(1));
    assertEquals(1, l.getQuantity(2));
    assertEquals(3, l.length());
    assertEquals(true, l.isMember("a"));
    assertEquals(true, l.isMember("b"));
    assertEquals(true, l.isMember("c"));
    
  }
  
  
  public void testSecondTail() {
    SortedLinkedList l = new SortedLinkedList();
    l.insert("a", 1);
    l.insert("b", 0);
    assertEquals("a", l.getName(0));
    assertEquals("b", l.getName(1));
    assertEquals(1, l.getQuantity(0));
    assertEquals(0, l.getQuantity(1));
    assertEquals(2, l.length());
    assertEquals(true, l.isMember("a"));
    assertEquals(true, l.isMember("b"));
  }
  
  public void testMiddleThird() {
    SortedLinkedList l = new SortedLinkedList();
    l.insert("a", 3);
    l.insert("c", 1);
    l.insert("b", 2);
    assertEquals("b", l.getName(1));
    assertEquals("a", l.getName(0));
    assertEquals("c", l.getName(2));
    assertEquals(3, l.getQuantity(0));
    assertEquals(2, l.getQuantity(1));
    assertEquals(1, l.getQuantity(2));
    assertEquals(3, l.length());
    assertEquals(true, l.isMember("a"));
    assertEquals(true, l.isMember("b"));
    assertEquals(true, l.isMember("c"));
  }
}
             








