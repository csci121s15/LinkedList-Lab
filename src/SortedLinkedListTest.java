import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class SortedLinkedListTest extends TestCase 
{
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testEmptyList() 
  {
  
  SortedLinkedList list = new SortedLinkedList();
  
  assertEquals(null, list.getName(0));
  assertEquals(-1, list.getQuantity(0));
  assertEquals(0, list.length());
  assertEquals(false, list.isMember("banana"));
  }
  
  public void testSingleNode() 
  {
    SortedLinkedList list = new SortedLinkedList();
    list.insert("apples", 3);
    
    assertEquals("apples", list.getName(0));
    assertEquals(3, list.getQuantity(0));
    assertEquals(1, list.length());

    assertEquals(true, list.isMember("apples"));
    assertFalse(list.isMember("banana"));
  }
  
  public void testSecondNodeNewHead()
  {
    SortedLinkedList list = new SortedLinkedList();
    list.insert("apples", 3);
    list.insert("bananas", 15);
    
    assertEquals("bananas", list.getName(0));
    assertEquals(15, list.getQuantity(0));
    
    assertEquals("apples", list.getName(1));
    assertEquals(3, list.getQuantity(1));
    
    assertEquals("bananas", list.getName(0));
    assertEquals(15, list.getQuantity(0));
    
    assertEquals("apples", list.getName(1));
    assertEquals(3, list.getQuantity(1));
    
    assertEquals(2, list.length());
    
    assertEquals(true, list.isMember("apples"));
    assertEquals(true, list.isMember("bananas"));
    assertEquals(false, list.isMember("mango"));
  }
  
  public void testRepeatedHeadInsert()
  {
    SortedLinkedList list = new SortedLinkedList();
    list.insert("apples", 3);
    list.insert("bananas", 15);
    list.insert("mangos", 34);
    list.insert("starfruit", 437);
    
    assertEquals(437, list.getQuantity(0));
    assertEquals(3, list.getQuantity(3));
    assertEquals(34, list.getQuantity(1));
    assertEquals(15, list.getQuantity(2));
    
    assertEquals("starfruit", list.getName(0));
    assertEquals("apples", list.getName(3));
    assertEquals("mangos", list.getName(1));
    assertEquals("bananas", list.getName(2));
    
    assertEquals(4, list.length());
    
    assertEquals(true, list.isMember("apples"));
    assertEquals(true, list.isMember("starfruit"));
    assertTrue(list.isMember("bananas"));
    assertTrue(list.isMember("mangos"));
    assertFalse(list.isMember("guava"));
  }
  
  public void testSecondTail()
  {
    SortedLinkedList list = new SortedLinkedList();
    list.insert("apples", 3);
    list.insert("bananas", 2);
    
    assertEquals("apples", list.getName(0));
    assertEquals("bananas", list.getName(1));
    assertEquals(2, list.getQuantity(1));
    assertEquals(3, list.getQuantity(0));
    
    assertEquals(2, list.length());
  }
  
  public void testMiddleThird()
  {
    SortedLinkedList list = new SortedLinkedList();
    list.insert("apples", 4);
    list.insert("bananas", 2);
    list.insert("mangos", 3);
    
    assertEquals("apples", list.getName(0));
    assertEquals("mangos", list.getName(1));
    assertEquals("bananas", list.getName(2));
    
    assertEquals(3, list.length());
  }
  
  public void testMixedRepeated()
  {
    SortedLinkedList list = new SortedLinkedList();
    list.insert("apples", 7);
    list.insert("bananas", 2);
    list.insert("mangos", 3);
    list.insert("guava", 54);
    list.insert("pears", 7);
    list.insert("starfruit", 2);
    list.insert("plums", 54);
    
    assertEquals("guava", list.getName(0));
    assertEquals("plums", list.getName(1));
    assertEquals("apples", list.getName(2));
    assertEquals("pears", list.getName(3));
    assertEquals("mangos", list.getName(4));
    assertEquals("bananas", list.getName(5));
    assertEquals("starfruit", list.getName(6));
    
    assertEquals(7, list.getQuantity(3));
    
    assertEquals(7, list.length());
  } 
  
  public void testRepeatedTail()
  {
    SortedLinkedList list = new SortedLinkedList();
    list.insert("apples", 7);
    list.insert("bananas", 5);
    list.insert("mangos", 4);
    list.insert("pears", 2);
    list.insert("plums", 1);
    
    assertEquals("apples", list.getName(0));
    assertEquals("bananas", list.getName(1));
    assertEquals("mangos", list.getName(2));
    assertEquals("pears", list.getName(3));
    assertEquals("plums", list.getName(4));
  }
  
  public void testMiddleSortig()
  {
    SortedLinkedList list = new SortedLinkedList();
    list.insert("apples", 473);
    list.insert("bananas", 1);
    list.insert("plums", 3);
    list.insert("pears", 327);
    list.insert("mangos", 100);
    list.insert("starfruit", 240);
    list.insert("guava", 2);
    
    assertEquals("apples", list.getName(0));
    assertEquals("pears", list.getName(1));
    assertEquals("starfruit", list.getName(2));
    assertEquals("mangos", list.getName(3));
    assertEquals("plums", list.getName(4));
    assertEquals("guava", list.getName(5));
    assertEquals("bananas", list.getName(6));
  }
  
}
  
