import junit.framework.TestCase;

public class SortedLinkedListTest extends TestCase {
  public void testEmptyList() {
    
    SortedLinkedList list = new SortedLinkedList();
  
    assertEquals(null, list.getName(0));
    assertEquals(-1, list.getQuantity(0));
    assertEquals(0, list.length());
    assertEquals(false, list.isMember("member"));
  }
  
  public void testSingleNode() 
  {
    SortedLinkedList list = new SortedLinkedList();
    list.insert ("x", 1);
    
    assertEquals("x", list.getName(0));
    assertEquals(1, list.getQuantity(0));
    assertEquals(1, list.length());
    assertEquals(true, list.isMember("x"));
  } 
  
   public void testSecondNode() 
  {
    SortedLinkedList list = new SortedLinkedList();
    list.insert ("x", 1);
    list.insert ("y", -1);
    
    assertEquals("x", list.getName(1));
    assertEquals("y", list.getName(0));
    assertEquals(1, list.getQuantity(1));
    assertEquals(-1, list.getQuantity(0));
    assertEquals(2, list.length());
    assertEquals(true, list.isMember("x"));
    assertEquals(true, list.isMember("y"));
  }   
  
  }