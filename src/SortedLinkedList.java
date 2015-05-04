public class SortedLinkedList {
  private Node head;
  private int elements;
  private int i;
  /**
   * Create an empty list.
   */
  public SortedLinkedList() {
    head = null;
  }
  
  /**
   * Print all the elements of the list to the console.  Each element will have
   * the form "name:quantity" and the entries will be separated by a single
   * space.
   */
  public void print() {
    Node temp = head;
    while(temp != null) {
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
  public String getName(int index) {
    Node n = head; 
    int c = 0;
    if (head == null) {
      return null;
    }
    while (c != index) {
      n = n.getNext();
      c++;
    }
    return n.getName();
  }
  /**
   * This method will return the quantity at the specified index.  Similar to
   * an array, the index of the first entry is zero.  If the index is invalid,
   * this method will return -1.
   */
  public int getQuantity(int index) {
    Node curr = head; 
    int c = 0;
    if (head == null) {
      return -1;
    }
    while (c != index) {
      curr = curr.getNext();
      c++;
    }
    return curr.getQuantity();
    }
  
  
  /**
   * This method will return the number of elements currently held in the list.
   */
  public int length() {
    if (head != null) {
      return elements;
    }
    else {
      return 0;
    }
  }
  
  /**
   * This method will return whether or not the specified name is contained in
   * the list.
   */
  public boolean isMember(String name) {
    Node curr = head;
    while(curr != null) {
      if(curr.getName() == name) {
        return true;
      }
      else {
        curr = curr.getNext();
      }
    }
    return false;
  }
  /**
   * This method will add the specified name/quantity to the list in sorted
   * order.  This order is specified by the quantity from low to high.
   */
  public void insert(String name, int quantity) {
    Node temp = new Node(name, quantity);
    Node prev = null;
    Node curr = head;
    if(elements == 0) {
      temp.setNext(head);
      head = temp;
      elements ++;
    }
    else {
    while (curr != null) {
      if (temp.getQuantity() > curr.getQuantity()) {
        elements ++;
        if(prev == null) {
          temp.setNext(head);
          head = temp;
          break;
        }
        else {
          prev.setNext(temp);
          temp.setNext(curr);
          break;
        }
      }
      if(temp.getQuantity() == curr.getQuantity()) {
       elements ++;
        if (prev == null) {
          temp.setNext(head);
          head = temp;
          break;
        }
        else {
          prev.setNext(temp);
          temp.setNext(curr);
        }
      }
         prev = curr;
         curr = curr.getNext();
    }
    if(curr == null) {
      prev.setNext(temp);
      elements++;
      }
    }
  }
}



         
          
         
            
       
          
  



