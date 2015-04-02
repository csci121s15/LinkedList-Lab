public class SortedLinkedList
{
  private Node head;
  private int length;
  /**
   * Create an empty list.
   */
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
    if(head == null || index >= length){
      return null;
    }  
      else{
      Node temp = head;
      for(int i=0; i < index; i++){
        temp.getNext();
        temp = temp.getNext();
      }
      return temp.getName();
      }
  }
  /**
   * This method will return the quantity at the specified index.  Similar to
   * an array, the index of the first entry is zero.  If the index is invalid,
   * this method will return -1.
   */
  public int getQuantity(int index)
  {
    
    if(head == null){
      return -1; 
    }else{
      Node temp = head;
      for(int i=0; i < index; i++){
        temp.getNext(); 
        //doesn't set anything, just gives the next value
        temp = temp.getNext();
    }
      return temp.getQuantity();
  }
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
    Node temp = head;
    if(head = null){
      return false;
  }else {
    return true;
  
}
  }
  /**
   * This method will add the specified name/quantity to the list in sorted
   * order.  This order is specified by the quantity from low to high.
   */
  public void insert(String name, int quantity)
  {
    Node newNode = new Node(name, quantity);

    if(head == null){ 
      head = newNode;
      length += 1; 
      return; 
    } 
    if(newNode.getQuantity() < head.getQuantity()){ 
      newNode.setNext(head);
      head = newNode;
      length += 1;
      return;
  }  
    Node curr = head.getNext();
    Node prev = head;
    while(curr != null){
      
      if(newNode.getQuantity() >= prev.getQuantity() && newNode.getQuantity() < curr.getQuantity()) {
        prev.setNext(newNode);
        newNode.setNext(curr);
        length += 1;
        return;
    }
         prev = curr;
         curr = curr.getNext();
         }
       prev.setNext(newNode);
       length += 1;
}
}
