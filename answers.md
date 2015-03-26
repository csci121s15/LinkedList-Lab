# Hailey Kester 
# Linked List Lab
## March 19, 2015

**Question 1:** Draw a picture of an empty linked list and describe how you could test that the methods work correctly on this list.

**Answer 1:** In order to test that the methods for an empty linkedlist work correctly, we need to first create a new linked list and then we would have to call all of the query methods for this specific one.  For an emtpy linked list, the name would be null because the head is the null, and the length of the list would be 0 because it is an empty list.

**Question 2:** Draw a picture of a linked list with one node, and describe how you could test that the methods work correctly on this list.

**Answer 2:**  To test that the methods work correctly on the linked list with one node, we need to create a new list agian, as well as, adding an insert method because we need to insert the name and quantity of the one node.  Then we need to adjust our getName and getQuantity methods in order for the test to make sure that it passes for both an empty list and the list with one node.  In order to do that we needed to create if statements.  Lastly, we needed to implement the insert method in order to insert the new node into the beginning of the list. 

**Question 3:** Draw a picture of a linked list with two nodes, the node from question 2 and one other node before that node.  Remember that we are keeping the list sorted by quantity with the largest number at the head of the list.

**Answer 3:** For a linked list with two nodes, we would have to firsst have the head and draw a new node behind the node that is already there.  Then we would have to make sure that the head is now not pointing to the first node, it is instead pointing to the new node.  Lastly, the new node is now pointing to the first node that was already there. 

**Question 4:** Draw a picture of a linked list with three nodes, the first two
from Question 3 and one other node *before* that node.  Do you think your code
will work to repeatedly add nodes that belong at the head?

**Answer 4:** Yes our code will work to repeatedly add nodes that belong at the head because everytime we insert a new node our code sets it to be the head.

**Question 5:** Draw a picture of a list with one node.  What should `prev` be so we can add a second node to the end of the list?

Implement a test named `testSecondTail`, and make the necessary changes to the `SortedLinkedList` so that all your tests pass.

**Answer 5:** The `prev` in this case would be our curr because that way we can add the new node (second node)to the end of our list.


**Question 6:** Draw a picture of a list with two nodes.  What should `prev` be so that we can add a third node in the middle of the list?

Implement a test named `testMiddleThird`, and make the necessary changes to the `SortedLinkedList` so that all your tests pass.

**Answer 6:**  The `prev` in this care would our prev.setNext() because then we can set our curr to null because it fell off the list and now our new node would be in between the `prev` and the curr. 

**Question 7:** Now that all tests pass, is this convincing evidence that the
class is working?  If so, explain why.  If not, describe further tests needed
(and implement them).

**Answer 7:** I believe that this is evidence that the class is working because we were able to test by adding a node to the beginning, adding a node to the end and adding a node in between the prev and the curr.  This class showed us all the ways that nodes can be tested and inserted into the list. 

**Question 8:** Reflect on what you learned in this lab.  How has implementing
these methods "from scratch" helped clarify your understanding of linked lists?

**Answer 8:** In this lab we learned how to insert nodes into different places in the list, beginning, end and in between other current nodes.  Implementing these methods from scratch was a little difficult at first because it was easier for me to visual them in the picture than it was to implement it in code.  After this lab was complete, my understanding of linked lists is a little strong but I still need to keep drawing a picture of what is happening first. 

 
