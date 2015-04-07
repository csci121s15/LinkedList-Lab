public class SortedLinkedList{
  private Node head;
  private int length;
  /**
   * Create an empty list.
   */
  public SortedLinkedList() {
    head = null;
    length = 0;
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
    Node temp = head;
    if (temp == null) {
      return null;
    }
    else {
      for (int i = 0; i < index; i++) {
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
  public int getQuantity(int index) {
    Node temp = head;
    if (temp == null) {
      return -1;
    }
    else {
      for (int i = 0; i < index; i++) {
        temp = temp.getNext();
      }
    return temp.getQuantity();
    }
  }
  
  /**
   * This method will return the number of elements currently held in the list.
   */
  public int length() {
    Node temp = head;
    int x = 0;
      while (temp != null) {
        x += 1;
        temp = temp.getNext();
      }
    return x;
  }
  
  /**
   * This method will return whether or not the specified name is contained in
   * the list.
   */
  public boolean isMember(String name) {
    Node temp = head;
    boolean inlist = false;
    while (temp != null && !inlist) {
      if (temp.getName().equals(name)) {
        inlist = true;
      }
      else {
        temp = temp.getNext();
      }
    }
      return inlist;
  }
    
  
  /**
   * This method will add the specified name/quantity to the list in sorted
   * order.  This order is specified by the quantity from low to high.
   */
  public void insert(String name, int quantity) {
    Node n = new Node(name, quantity);
    Node curr = head;
    Node prev = null;
    //emptylist
    if (head == null) {
      head = n;
      return;
    }
    //singleinsert
    if (n.getQuantity() <= curr.getQuantity()) {
      n.setNext(head);
      head = n;
      return;
    }
    prev = head;
    
    if (curr.getNext() == null) {
        curr.setNext(n);
        return;
      }
    
    curr = curr.getNext();
    
    while (curr != null) {
      if (n.getQuantity() <= curr.getQuantity()) {
        n.setNext(curr);
        prev.setNext(n);
        break;
      } 
      
      if (curr.getNext() == null) {
        curr.setNext(n);
        break;
      }
      prev = curr;
      curr = curr.getNext();
    }
  }
}
