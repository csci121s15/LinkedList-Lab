import junit.framework.TestCase;

public class SortedLinkedListTest extends TestCase{
  public void testEmptyList(){
    SortedLinkedList ll = new SortedLinkedList(); 
    assertEquals(null, ll.getName(2));
    assertEquals(-1,ll.getQuantity(0));
    assertEquals(0,ll.length());
    assertFalse(ll.isMember("member"));
  } 
  
  public void testSingleNode(){
    SortedLinkedList ll = new SortedLinkedList();
    ll.insert("spoon", 1);
    assertEquals("spoon", ll.getName(0));
    assertEquals(1,ll.getQuantity(0));
    assertEquals(1,ll.length());
    assertTrue(ll.isMember("spoon"));
} 
  
  public void testSecondNodeNewHead(){ 
    SortedLinkedList ll = new SortedLinkedList(); 
    ll.insert("tree", 2); 
    ll.insert("flower",1);
    assertEquals("tree", ll.getName(1));
    assertEquals("flower",ll.getName(0));
    assertEquals(1, ll.getQuantity(0));
    assertEquals(2,ll.getQuantity(1));
    assertEquals(2,ll.length());
    assertTrue(ll.isMember("tree"));
    assertTrue(ll.isMember("flower"));
  }
    
   public void testRepeatedHeadInsert(){ 
     SortedLinkedList ll = new SortedLinkedList(); 
     ll.insert("tiger",3);
     ll.insert("lion",2);
     ll.insert("bear",1);
     assertEquals("tiger", ll.getName(2));
     assertEquals("lion", ll.getName(1));
     assertEquals("bear", ll.getName(0));
     assertEquals(3, ll.getQuantity(2));
     assertEquals(2, ll.getQuantity(1));
     assertEquals(1, ll.getQuantity(0));
     assertEquals(3, ll.length());
     assertTrue(ll.isMember("tiger"));
     assertTrue(ll.isMember("lion"));
     assertTrue(ll.isMember("bear"));
     }
   
   public void testSecond(){
     SortedLinkedList ll = new SortedLinkedList(); 
     ll.insert("toe",3);
     ll.insert("shoulder",2);
     ll.insert("knee",1);
     assertEquals("toes", ll.getName(2));
     assertEquals("shoulder", ll.getName(1));
     assertEquals("knee", ll.getName(0));
     assertEquals(3, ll.getQuantity(2));
     assertEquals(2, ll.getQuantity(1));
     assertEquals(1, ll.getQuantity(0));
     assertEquals(3, ll.length());
     assertTrue(ll.isMember("toe"));
     assertTrue(ll.isMember("shoulder"));
     assertTrue(ll.isMember("knee"));
     }
   
   public void testMiddleThird
     SortedLinkedList ll = new SortedLinkedList(); 
     ll.insert("chicken",3);
     ll.insert("turkey",2);
     ll.insert("pork",1);
     assertEquals("chicken", ll.getName(2));
     assertEquals("turkey", ll.getName(1));
     assertEquals("pork", ll.getName(0));
     assertEquals(3, ll.getQuantity(2));
     assertEquals(2, ll.getQuantity(1));
     assertEquals(1, ll.getQuantity(0));
     assertEquals(3, ll.length());
     assertTrue(ll.isMember("chicken"));
     assertTrue(ll.isMember("turkey"));
     assertTrue(ll.isMember("pork"));
  }