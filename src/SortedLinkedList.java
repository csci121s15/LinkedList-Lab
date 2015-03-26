public class SortedLinkedList
{
  private Node head;
  /**
   * Create an empty list.
   */
  private int length;
  
  public SortedLinkedList()
  {
    head = null;
    length = 0;
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
    Node f = head;
    
    if (f == null){
      return null;
    }
    if (index == 0){
      return f.getName();
    }
      
      for (int i = 0; i < index; i++){
        f = f.getNext();
  }
        return f.getName();
  }
    
  
  
  
  /**
   * This method will return the quantity at the specified index.  Similar to
   * an array, the index of the first entry is zero.  If the index is invalid,
   * this method will return -1.
   */
  public int getQuantity(int index)
  {
    if (head == null){
    return -1;
  }
    
    Node r = head;
   
    for (int i = 0; i < index; i++)
  {
      r = r.getNext();
  }
    
    return r.getQuantity();
  }
  
  /**
   * This method will return the number of elements currently held in the list.
   */
  public int length()
  {
    return length;
  }
  
  /**
   * This method will return whether or not the specified name is contained in
   * the list.
   */
  public boolean isMember(String name)
  {
    if (length == 0){
      return false;
    }
    else if (head.getName().equals(name)){
      return true;
    }
    else{
      return false;
    }
  }
  
  /**
   * This method will add the specified name/quantity to the list in sorted
   * order.  This order is specified by the quantity from low to high.
   */
  public void insert(String name, int quantity)
  {
    Node newNode = new Node(name, quantity);
    
    head = newNode;
    length +=1;
  }  
}
