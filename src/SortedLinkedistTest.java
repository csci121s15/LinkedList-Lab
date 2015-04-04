import junit.framework.TestCase;
  

  public class SortedLinkedistTest extends TestCase {
  public void testEmptyList() {
    
    SortedLinkedList list = new SortedLinkedList();
  
  assertEquals(null, list.getName(0));
  assertEquals(-1, list.getQuantity(0));
  assertEquals(0, list.length());
  assertEquals(false, list.isMember("Marlon"));
  }


  
  public void testOneNode() {
    SortedLinkedList s = new SortedLinkedList();
    s.insert("Gelmar", 3);
      
    assertEquals(s.getName(0), "Gelmar");
    assertEquals(s.getQuantity(0), 3);
    assertEquals(s.length(), 1);
    assertTrue(s.isMember("Gelmar"));
    
  }
  
  public void testTwoNodes() {
    SortedLinkedList s = new SortedLinkedList();
    s.insert("Marlon", 5);
    s.insert("Gelmar", 10);
      
    assertEquals(s.getName(0), "Gelmar");
    assertEquals(s.getName(1), "Marlon");
    assertEquals(s.getQuantity(0), 10);
    assertEquals(s.getQuantity(1), 5);
    assertEquals(s.length(), 2);
    assertTrue(s.isMember("Marlon"));
    assertTrue(s.isMember("Gelmar"));
    
  }
    
  public void testThreeNode(){
    SortedLinkedList s = new SortedLinkedList();
    s.insert("Adam", 5);
    s.insert("Bayardo", 10);
    s.insert("Colleen", 15);
    s.insert("David", 7);
    s.insert("Esteban", 4);
    s.insert("Fahad",12);
      
    assertEquals(s.getName(0), "Colleen");
    assertEquals(s.getName(1), "Fahad");
    assertEquals(s.getName(2), "Bayardo");
    assertEquals(s.getName(3), "David");
    assertEquals(s.getName(4), "Adam");
    assertEquals(s.getName(5), "Esteban");
    assertEquals(s.getQuantity(0), 15);
    assertEquals(s.getQuantity(1), 12);
    assertEquals(s.getQuantity(2), 10);
    assertEquals(s.getQuantity(3), 7);
    assertEquals(s.getQuantity(4), 5);
    assertEquals(s.getQuantity(5), 4);
    assertEquals(s.length(), 6);
    assertTrue(s.isMember("Colleen"));
    assertTrue(s.isMember("Adam"));
    assertTrue(s.isMember("Bayardo"));
    assertTrue(s.isMember("David"));
    assertTrue(s.isMember("Esteban"));
    assertTrue(s.isMember("Fahad"));
    
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