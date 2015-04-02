import junit.framework.TestCase;

public class SortedLinkedListTest extends TestCase {
  public void testEmptyList() {
    SortedLinkedList ll = new SortedLinkedList();
    assertEquals(null, ll.getName(2));
    assertEquals(-1, ll.getQuantity(0));
    assertEquals(0, ll.length());
    assertFalse(ll.isMember("member"));
  }
  
  public void testSingleNode() {
    SortedLinkedList ll = new SortedLinkedList();
    ll.insert("Dan", 1);
    assertEquals("Dan", ll.getName(0));
    assertEquals(1, ll.getQuantity(0));
    assertEquals(1, ll.length());
    assertTrue(ll.isMember("Dan"));
  }
  
  public void testSecondNodeNewHead() {
    SortedLinkedList ll = new SortedLinkedList();
    ll.insert("Banana", 2);
    ll.insert("Apple", 1);
    assertEquals("Banana", ll.getName(1));
    assertEquals("Apple", ll.getName(0));
    assertEquals(1, ll.getQuantity(0));
    assertEquals(2, ll.getQuantity(1));
    assertEquals(2, ll.length());
    assertTrue(ll.isMember("Banana"));
    assertTrue(ll.isMember("Apple"));
  }
  
  public void testRepeatedHeadInsert() {
    SortedLinkedList ll = new SortedLinkedList();
    ll.insert("Rich", 3);
    ll.insert("Richy", 2);
    ll.insert("Dollar", 1);
    assertEquals("Rich", ll.getName(2));
    assertEquals("Richy", ll.getName(1));
    assertEquals("Dollar", ll.getName(0));
    assertEquals(3, ll.getQuantity(2));
    assertEquals(2, ll.getQuantity(1));
    assertEquals(1, ll.getQuantity(0));
    assertEquals(3, ll.length());
    assertTrue(ll.isMember("Rich"));
    assertTrue(ll.isMember("Richy"));
    assertTrue(ll.isMember("Dollar"));
  }
  
  public void testSecondTail() {
    SortedLinkedList ll = new SortedLinkedList();
    ll.insert("Todd", 3);
    ll.insert("Millie", 2);
    ll.insert("Brad", 1);
    assertEquals("Todd", ll.getName(2));
    assertEquals("Millie", ll.getName(1));
    assertEquals("Brad", ll.getName(0));
    assertEquals(3, ll.getQuantity(2));
    assertEquals(2, ll.getQuantity(1));
    assertEquals(1, ll.getQuantity(0));
    assertEquals(3, ll.length());
    assertTrue(ll.isMember("Todd"));
    assertTrue(ll.isMember("Millie"));
    assertTrue(ll.isMember("Brad"));
  }
  
  public void testMiddleThird() {
    SortedLinkedList ll = new SortedLinkedList();
    ll.insert("Bubbles", 3);
    ll.insert("Blossom", 2);
    ll.insert("Buttercup", 1);
    assertEquals("Bubbles", ll.getName(2));
    assertEquals("Blossom", ll.getName(1));
    assertEquals("Buttercup", ll.getName(0));
    assertEquals(3, ll.getQuantity(2));
    assertEquals(2, ll.getQuantity(1));
    assertEquals(1, ll.getQuantity(0));
    assertEquals(3, ll.length());
    assertTrue(ll.isMember("Bubbles"));
    assertTrue(ll.isMember("Blossom"));
    assertTrue(ll.isMember("Buttercup"));
  }
}
