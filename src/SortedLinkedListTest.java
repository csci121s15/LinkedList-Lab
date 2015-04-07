import junit.framework.TestCase;

public class SortedLinkedListTest extends TestCase {

  public void testEmptyList() {
    SortedLinkedList l = new SortedLinkedList();
      
    assertEquals(null, l.getName(0));
    assertEquals(-1, l.getQuantity(0));
    assertEquals(0, l.length());
    assertFalse(l.isMember("member"));
  }
  
  public void testSingleNode() {
    SortedLinkedList l = new SortedLinkedList();
    
    l.insert("Joe", 35);

    assertEquals("Joe", l.getName(0));
    assertEquals(35, l.getQuantity(0));
    assertEquals(1, l.length());
    assertTrue(l.isMember("Joe"));
  }
  
  public void testSecondNodeNewHead() {
    SortedLinkedList l = new SortedLinkedList();
    
    l.insert("Joe", 35);
    l.insert("Barbara", 23);
    
    assertEquals("Barbara", l.getName(0));
    assertEquals(23, l.getQuantity(0));
    assertEquals("Joe", l.getName(1));
    assertEquals(35, l.getQuantity(1));
    assertEquals(2, l.length());
    assertTrue(l.isMember("Barbara"));
    assertTrue(l.isMember("Joe"));
  }
  
  public void testRepeatedHeadInsert() {
    SortedLinkedList l = new SortedLinkedList();
    
    l.insert("Joe", 35);
    l.insert("Barbara", 23);
    l.insert("Greg", 14);
    l.insert("Josephina", 3);
    
    assertEquals("Barbara", l.getName(2));
    assertEquals(23, l.getQuantity(2));
    assertEquals("Greg", l.getName(1));
    assertEquals(14, l.getQuantity(1));
    assertEquals("Joe", l.getName(3));
    assertEquals(35, l.getQuantity(3));
    assertEquals("Josephina", l.getName(0));
    assertEquals(3, l.getQuantity(0));
    assertEquals(4, l.length());
    assertTrue(l.isMember("Barbara"));
    assertTrue(l.isMember("Joe"));
  }
  
  public void testSecondTail() {
    SortedLinkedList l = new SortedLinkedList();
    
    l.insert("Joe", 35);
    l.insert("Josephina", 38);
    
    assertEquals("Joe", l.getName(0));
    assertEquals(35, l.getQuantity(0));
    assertEquals("Josephina", l.getName(1));
    assertEquals(38, l.getQuantity(1));
    assertEquals(2, l.length());
    assertTrue(l.isMember("Joe"));
    assertTrue(l.isMember("Josephina"));
  }
  
  public void testMiddleThird() {
    SortedLinkedList l = new SortedLinkedList();
    
    l.insert("Joe", 35);
    l.insert("Barbara", 23);
    l.insert("Greg", 29);
    
    assertEquals("Barbara", l.getName(0));
    assertEquals(23, l.getQuantity(0));
    assertEquals("Joe", l.getName(2));
    assertEquals(35, l.getQuantity(2));
    assertEquals("Greg", l.getName(1));
    assertEquals(29, l.getQuantity(1));
    assertEquals(3, l.length());
    assertTrue(l.isMember("Barbara"));
    assertTrue(l.isMember("Joe"));
    assertTrue(l.isMember("Greg"));
  }
}
