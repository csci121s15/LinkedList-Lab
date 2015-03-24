public class SortedLinkedList
{

  private Node head;
  private int theLength;
  
  /**
   * Create an empty list.
   */
  public SortedLinkedList()
  {
    head = null;
    theLength = 0;
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
      System.out.print(temp.getName() + " " + temp.getQuantity() + " ");
      temp = temp.getNext();
    }
    
    System.out.println();
  }
  
  /**
   * This method will return the name at the specified index.  Similar to an
   * array, the index of the first entry is zero.  If the index is invalid,
   * this method will return null.
   */
  public String getName(int index){
    
    Node temp = head;
    if (temp == null) {
      return null;
    }
    if (index == 0) {
      return temp.getName();
    }
    for (int i = 0; i<index; i++){
      temp = temp.getNext();
    }
     if (temp == null) {
        return null;
     }
     else {
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
    Node temp = head;
    if (temp == null) {
      return -1;
    }
    for (int i = 0; i<index; i++){
      temp = temp.getNext();
    }
    if (temp == null) {
      return -1;
    }
    else {
      return temp.getQuantity();
    }
  }

  /**
   * This method will return the number of elements currently held in the list.
   */
  public int length() {
    Node temp = head;
    int i = 0;
    if (head == null) {
      return 0;
    }
    else{ 
      while (temp != null) {
      i += 1;
      temp = temp.getNext();
      }
      return i;
    }
         
  }
  
  /**
   * This method will return whether or not the specified name is contained in
   * the list.
   */
  public boolean isMember(String name)
  {
    Node temp = head;
    if (head == null) {
      if (name == null){
        return true;
      }
      else{
        return false;
      }
    }
    while(temp.getName() != name){
      temp = temp.getNext();
      }
    if (temp.getName() == name){
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
    Node temp = head;
    Node prev = head;     

    // for an empty list
    if (head == null) {
      head = newNode;      
    }

    else {
      
      //if it's larger than the head
      if (quantity >= head.getQuantity()){
        newNode.setNext(head);
        head = newNode;
      }
      
      //otherwise
      else{
        temp = temp.getNext();
        
        //if the head is the only item
        if (temp == null){
          prev.setNext(newNode);
        }
        
        //adding in the middle or end with more than one item
        else {
          //adding in the middle
          while (temp.getNext() != null){
            if (quantity >= temp.getQuantity() && quantity <= prev.getQuantity()){
              newNode.setNext(temp);
              prev.setNext(newNode);
              break;
            }
            prev = prev.getNext();
            temp = temp.getNext();
          }
          //adding at the end or just before
          if (temp.getNext() == null){
            if (quantity >= temp.getQuantity() && quantity <= prev.getQuantity()){
              newNode.setNext(temp);
              prev.setNext(newNode);
            }
            //adds to the end
            else {
              temp.setNext(newNode);
            }
          }
        }
      }
    }
  }
}