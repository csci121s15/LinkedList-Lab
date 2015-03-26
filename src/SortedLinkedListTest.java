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
    
    list.insert("Jose", 1);
    
    assertEquals("Jose", list.getName(0));
    assertEquals(1, list.getQuantity(0));
    assertEquals(1, list.length());
    assertTrue(list.isMember("Jose"));
 
  }
  
  public void testSecondNodeNewHead() {
    SortedLinkedList list = new SortedLinkedList ();
    
    list.insert("Fredrick", 2);
    list.insert("Jose", 1);
    
    assertEquals("Jose", list.getName(0));
    assertEquals("Fredrick", list.getName(1));
    assertEquals(1, list.getQuantity(0));
    assertEquals(2, list.getQuantity(1));
    assertEquals(2, list.length());
    assertTrue(list.isMember("Jose"));
    assertTrue(list.isMember("Fredrick"));
  
  }
  
  public void testRepeatedHeadInsert() {
    SortedLinkedList list = new SortedLinkedList ();
    
    list.insert("Harry", 3);
    list.insert("Fredrick", 2);
    list.insert("Jose", 1);
    
    assertEquals("Harry", list.getName(2));
    assertEquals("Fredrick", list.getName(1));
    assertEquals("Jose", list.getName(0));
    assertEquals(3, list.getQuantity(2));
    assertEquals(2, list.getQuantity(1));
    assertEquals(1, list.getQuantity(0));
    assertEquals(3, list.length());
    assertTrue(list.isMember("Harry"));
    assertTrue(list.isMember("Fredrick"));
    assertTrue(list.isMember("Jose"));
   
  }
  
  public void testSecondTail() {
    SortedLinkedList list = new SortedLinkedList ();
    
    list.insert("Jose", 1);
    list.insert("Fredrick", 2);
    list.insert("Harry", 3);
    
    assertTrue(list.isMember("Jose"));
    assertTrue(list.isMember("Fredrick"));
    assertTrue(list.isMember("Harry"));
    assertEquals(3, list.length());
    assertEquals("Harry", list.getName(2));
    assertEquals("Fredrick", list.getName(1));
    assertEquals("Jose", list.getName(0));
    assertEquals(3, list.getQuantity(2));
    assertEquals(2, list.getQuantity(1));
    assertEquals(1, list.getQuantity(0));
   
  
  }
  
  public void testMiddleThird() {
    SortedLinkedList list = new SortedLinkedList ();
    
    list.insert("Jose", 1);
    list.insert("Harry", 3);
    list.insert("Fredrick", 2);
    
    
    assertEquals("Harry", list.getName(2));
    assertEquals("Fredrick", list.getName(1));
    assertEquals("Jose", list.getName(0));
    assertEquals(3, list.getQuantity(2));
    assertEquals(2, list.getQuantity(1));
    assertEquals(1, list.getQuantity(0));
    assertEquals(3, list.length());
    assertTrue(list.isMember("Jose"));
    assertTrue(list.isMember("Fredrick"));
    assertTrue(list.isMember("Harry"));
  }
  
  
    
    
  
  
}
