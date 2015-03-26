import junit.framework.TestCase;


public class SortedLinkedListTest extends TestCase {
  public void testEmptyList() {
    SortedLinkedList list = new SortedLinkedList ();
    
    assertEquals(null, list.getName(2));
    assertEquals(-1, list.getQuantity(0));
    assertEquals(0, list.length());
    assertFalse(list.isMember("member"));        
    
  }
  
  public void testSingleNode() {
    SortedLinkedList list = new SortedLinkedList ();
    
    list.insert("John", 1);
    
    assertEquals("John", list.getName(0));
    assertEquals(1, list.getQuantity(0));
    assertEquals(1, list.length());
    assertTrue(list.isMember("John"));
 
  }
  
  public void testSecondNodeNewHead() {
    SortedLinkedList list = new SortedLinkedList ();
    
    list.insert("Paul", 2);
    list.insert("John", 1);
    
    assertEquals("John", list.getName(0));
    assertEquals("Paul", list.getName(1));
    assertEquals(1, list.getQuantity(0));
    assertEquals(2, list.getQuantity(1));
    assertEquals(2, list.length());
    assertTrue(list.isMember("John"));
    assertTrue(list.isMember("Paul"));
  
  }
  
  public void testRepeatedHeadInsert() {
    SortedLinkedList list = new SortedLinkedList ();
    
    list.insert("Ferguson", 3);
    list.insert("Paul", 2);
    list.insert("John", 1);
    
    assertEquals("Ferguson", list.getName(2));
    assertEquals("Paul", list.getName(1));
    assertEquals("John", list.getName(0));
    assertEquals(3, list.getQuantity(2));
    assertEquals(2, list.getQuantity(1));
    assertEquals(1, list.getQuantity(0));
    assertEquals(3, list.length());
    assertTrue(list.isMember("Ferguson"));
    assertTrue(list.isMember("Paul"));
    assertTrue(list.isMember("John"));
   
  }
  
  public void testSecondTail() {
    SortedLinkedList list = new SortedLinkedList ();
    
    list.insert("John", 1);
    list.insert("Paul", 2);
    list.insert("Ferguson", 3);
    
    assertTrue(list.isMember("John"));
    assertTrue(list.isMember("Paul"));
    assertTrue(list.isMember("Ferguson"));
    assertEquals(3, list.length());
    assertEquals("Ferguson", list.getName(2));
    assertEquals("Paul", list.getName(1));
    assertEquals("John", list.getName(0));
    assertEquals(3, list.getQuantity(2));
    assertEquals(2, list.getQuantity(1));
    assertEquals(1, list.getQuantity(0));
   
  
  }
  
  public void testMiddleThird() {
    SortedLinkedList list = new SortedLinkedList ();
    
    list.insert("John", 1);
    list.insert("Ferguson", 3);
    list.insert("Paul", 2);
    
    
    assertEquals("Ferguson", list.getName(2));
    assertEquals("Paul", list.getName(1));
    assertEquals("John", list.getName(0));
    assertEquals(3, list.getQuantity(2));
    assertEquals(2, list.getQuantity(1));
    assertEquals(1, list.getQuantity(0));
    assertEquals(3, list.length());
    assertTrue(list.isMember("John"));
    assertTrue(list.isMember("Paul"));
    assertTrue(list.isMember("Ferguson"));
  }
  
  
    
    
  
  
}
