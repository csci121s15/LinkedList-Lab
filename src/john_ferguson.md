#John Ferguson
#Linked List Lab

>**Question 1:** Draw a picture of an empty linked list and describe how you could test that the methods worked correctly on this list.

**Answer 1:** The way we made the test work correctly was first by creating a new SortedLinkedList that is empty.  Then we had to assertEquals for getName which in that case was null, assertEquals for getQuantity which in that case is -1, assertEquals for length which would be 0 in this case and assertFalse for member because it's an empty list. 

>**Question 2:** Draw a picture of a linked list with one node, and describe how you could test taht the methods work correctly on this list.

**Answer 2:**  To test for a single node, we had to make an if statement in our getName class, we had to show that if index was less than length and index was greater or equal to 0 that we would get the node, otherwise it would return null.  We also had to put an if statement in our getQuantity class where we showed that if index was less than length and index was greter or equal to 0 we could get the quantity, otherwise it would return -1.  We also worked on the insert class where we had to insert a node in the beginning of the list to make it work. 

>**Question 3:** Draw a picture of a linked list with two nodes, the node form Question 2 and one other node before that node.  Remember that we are keeping the list sorted by quantity with the largest number at the head of the list. 

**Answer 3:** In this situation we would have a head and two nodes.  What we would do instead of the head point to  the first node, it would change, it wouldn't point to the first node anymore, it would point to the second node and the second node would then point to the first node. 

>**Question 4:** Draw a picture of a linked list with three nodes, the fist two from Question 3 and one other node before that node.  DO you think your code will work to repeatedly add nodes that belong at the head?

**Answer 4:** I think that our code will work to repeatedly add nodes that belond to the head because everytime we inset a newNode our code sets it to be the head and then we are incrementing by 1.

>**Question 5:** Draw a picture of a list with one node. What should prev be so we can add a second node to the end of the list?

**Answer 5:** Prev should be our curr in this situation so that we could add a second node to the end of the list. 

>**Question 6:**  Draw apicture of a list with two nodes.  What should prev be so that we can add a third node in the middle of the list?

**Answer 6:**  Prev in this case would be prev.setNext(newNode) because if that is that then we can set our curr to null and that would be able to put our new node in betwen the two. 

>**Question 7:** Now that all tests pass, is this convincing evidence that the class is working? If so, explain why.  If not, describe further tests needed(and implement them).

**Answer 7:** Now that all the tests pass this is enough evidence to explain why they class is working.  The reason for this is because not only did we prove that one node works or two nodes work, but we also tested the end tail of the nodes and tested what would happen if we put a new node in the middle and that passed as well. 

>**Question 8:** Reflect on what you learned in this lab.  How was implementing these methods "from scratch" helped clarify your understanding of linked lists?

**Answer 8:** Implementing these methods from scratch was very difficuly but doing it this way helped me really visualize how the nodes are supposed to be placed and in what order and what node points to what, what node is null.  It just really helped things become a lot clearer, because before this it was very difficult to picture this all in my head.