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
     if(head == null)
       return null;
     
     Node node = head;
     
     for(int i = 0; i < index; i++)
       node = node.getNext();
      
     return node.getName();
  }
  
  /**
   * This method will return the quantity at the specified index.  Similar to
   * an array, the index of the first entry is zero.  If the index is invalid,
   * this method will return -1.
   */
  public int getQuantity(int index)
  {
    if(head == null)
      return -1;
     
     Node node = head;
     
     for(int i = 0; i < index; i++)
       node = node.getNext();
      
     return node.getQuantity();
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
        return true;
      
      node = node.getNext();
    }
    return false;
  }
  
  /**
   * This method will add the specified name/quantity to the list in sorted
   * order.  This order is specified by the quantity from low to high.
   */
  public void insert(String name, int quantity)
  {
    Node newNode = new Node(name, quantity);
    
    // head case one
    if(head == null)
    {
      head = newNode;
      return;
    }
    
    // head case two
    if(newNode.getQuantity() > head.getQuantity())
    {
      newNode.setNext(head);
      head = newNode;
      return;
    }
    
    // middle
    Node curr = head;
    Node prev = null;
    
    while(curr != null)
    {
      if(newNode.getQuantity() > curr.getQuantity())
      {
        newNode.setNext(curr);
        prev.setNext(newNode);
        return;
      }
      
      prev = curr;
      curr = curr.getNext();
    }
    
    // tail
    prev.setNext(newNode);
        
  }
}
