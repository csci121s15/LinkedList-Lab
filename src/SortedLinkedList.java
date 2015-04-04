public class SortedLinkedList
{
  private Node head;
  public int getlength;
  
  
  public SortedLinkedList()
  {
    head = null;
    getlength = 0;
  }
  
  
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
  
  public String getName(int index)
  {
    if (head == null)
   {
     return null;
     }
    
     Node ref = head;
    
     for (int i = 0; i < index; i++)
     {
      ref = ref.getNext();
    }
   return ref.getName();
   }
  
  
  public int getQuantity(int index)
  {
    if (head == null)
    {
    return -1;
    }
     
     Node ref = head;
    
    for (int i = 0; i < index; i++)
    {
      ref = ref.getNext();
    }
     
    return ref.getQuantity();
   }   

  public int length()
  {
    
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
 
  public void insert(String name, int quantity){
    Node newNode = new Node(name, quantity);
    Node temp = head;
    Node prev = head;     

   
    if (head == null) {
      head = newNode;
      
      return;
    }
      
      if (quantity >= head.getQuantity()){
        newNode.setNext(head);
        head = newNode;
      }
      
      
      else{
        temp = temp.getNext();
        
        
        if (temp == null){
          prev.setNext(newNode);
        }
      
        
        
        else {
          
          while (temp.getNext() != null){
            if (quantity >= temp.getQuantity() && quantity <= prev.getQuantity()){
              newNode.setNext(temp);
              prev.setNext(newNode);
              break;
            }
            prev = prev.getNext();
            temp = temp.getNext();
          }
          
          if (temp.getNext() == null){
            if (quantity >= temp.getQuantity() && quantity <= prev.getQuantity()){
              newNode.setNext(temp);
              prev.setNext(newNode);
            }
           
            else {
              temp.setNext(newNode);
            }
          }
        }
      }
    }
}
          
