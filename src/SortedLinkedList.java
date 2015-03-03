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
    //Make sure there is something in the list
    if (head == null)
      return null;
    
    int i = 0;
    Node temp = head;
    while(i < index) {
      temp = temp.getNext();
      i++;
    }
    return temp.getName();
  }
  
  /**
   * This method will return the quantity at the specified index.  Similar to
   * an array, the index of the first entry is zero.  If the index is invalid,
   * this method will return -1.
   */
  public int getQuantity(int index)
  {
    //Make sure there is something in the list
    if (head == null)
      return -1;
    
    int i = 0;
    Node temp = head;
    while(i < index) {
      temp = temp.getNext();
      i++;
    }
    return temp.getQuantity();
  }
  
  /**
   * This method will return the number of elements currently held in the list.
   */
  public int length()
  {
    Node temp = head;
    int count = 0;
    
    while(temp != null) {
      count += 1;
      temp = temp.getNext();
    }
    return count;
  }
  
  /**
   * This method will return whether or not the specified name is contained in
   * the list.
   */
  public boolean isMember(String name)
  {
    Node temp = head;
    
    while(temp != null) {
      if (temp.getName() == name)
        return true;
      
      temp = temp.getNext();
    }
    
    //All-else, return false
    return false;
  }
  
  /**
   * This method will add the specified name/quantity to the list in sorted
   * order.  This order is specified by the quantity from low to high.
   */
  public void insert(String name, int quantity)
  {
    String nodeName = name;
    int nodeQuantity = quantity;
    
    if ( head == null)
      head = new Node(nodeName, nodeQuantity);
    
    else {
      //Create a new node that will be the head
      Node newHead = new Node(nodeName, nodeQuantity);
      
      //link the newHead to the old head...
      newHead.setNext(head);
      
      //Change head to reference the newHead
      head = newHead;
    }
  }  
}
