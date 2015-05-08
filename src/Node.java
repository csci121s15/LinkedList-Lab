
/**
 * This class represents a single node in a linked list.  The data stored
 * in the node is immutable, but the next field can be modified.
 */
public class Node
{
  private String name;
  private int quantity;
  private Node next;

  /**
   * Create a node with the specified name and quantity.  The next field will
   * be null.
   */
  public Node(String itemName, int itemQuantity)
  {
    name = itemName;
    quantity = itemQuantity;
    next = null;
  }

  public String getName()
  {
    return name;
  }
  
  public int getQuantity()
  {
    return quantity;
  }
  
  public Node getNext()
  {
    return next;
  }
  
  public void setNext(Node newNext)
  {
    next = newNext;
  }
}
