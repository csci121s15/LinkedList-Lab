public class SortedLinkedList
{
  private Node head;
  
  /**
   * Create an empty list.
   */
  public SortedLinkedList()
  {
    head = null;
  }
  
  /**
   * Print all the elements of the list to the console.  Each element will have
   * the form "name:quantity" and the entries will be separated by a single
   * space.
   */
  public void print()
  {
    Node temp = head;
    while(temp != null)
    {
      System.out.print(temp.getName() + ":" + temp.getQuantity() + " ");
      temp = temp.getNext();
    }
    
    System.out.println();
  }
  
  /**
   * This method will return the name at the specified index.  Similar to an
   * array, the index of the first entry is zero.  If the index is invalid,
   * this method will return null.
   */
  public String getName(int index)
  {
    Node node = head;
    if(node != null) 
    {
      return node.getName();
    }
    else 
    {
      return null;
    }
  }
  
  /**
   * This method will return the quantity at the specified index.  Similar to
   * an array, the index of the first entry is zero.  If the index is invalid,
   * this method will return -1.
   */
  public int getQuantity(int index)
  {
    Node node = head;
    if(node != null) 
    {
      return node.getQuantity();
    }
    else 
    {
      return -1;
    }
  }
    
    /* Dr Coleman's work
     * public int getQuantity(int index)
     * {
     * if(index < 0 || index >= length)
     * return -1;
     * 
     * // index D valid
     * Node curr = head
     * for(int i = 0; i < ???; i++)
     * curr = curr.getNext();
     * 
     * return curr.getQuantity()
  }
  
  /**
   * This method will return the number of elements currently held in the list.
   */
  public int length()
  {
    int count = 0;
    Node node = head;
    while(node != null) 
    {
      count += 1;
      node = node.getNext();
    }
    return count;
  }
  
  /**
   * This method will return whether or not the specified name is contained in
   * the list.
   */
  public boolean isMember(String name)
  {
    Node node = head;
    while(node != null) 
    {
      if(node.getName() == name)
      {
        return true;
      }
      node = node.getNext();
    }
    return false;
  }
  
  /**
   * This method will add the specified name/quantity to the list in sorted
   * order.  This order is specified by the quantity from low to high.
   */
  
  // Add sorting for this method
  public void insert(String name, int quantity)
  {
    Node newNode = new Node(name, quantity);
    newNode.setNext(head);
    head = newNode;
    
    // Sort the list
//    Node temp = head;
//    while(temp.getNext() != null)
//    {
//      if(temp.getQuantity < temp.getNext().getQuantity())
//      {
//        temp.setNext(temp.getNext());
//      }
    }
  }
}
