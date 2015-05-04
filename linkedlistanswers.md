**Martin Nesbitt**

***Linked List Lab***

**Question 1:**
The getName() method can be tested by asserting null. the getQuantity() method can be tested by asserting -1 as the return value for an invalid index. The length() method may be tested by asserting 0. The isMember() method can be tested by asserting false and using anything except for a valid value as the parameter.

**Question 2:**
The getName() method will be tested with an assertion of b. The getQuantity method can be tested by asserting 1. The length() method can be tested by asserting 1. The isMember() method can be tested by asserting true when calling isMember(b).

**Question 4:**
The code at this point will not be sufficient because it does not take into account the node that is currently in the list. 

**Question 5:**
Prev should be null and head should be curr so it can set its next as the new node.

**Question 6:** 
Prev should be the first node so it can set its next as the new node and the new node can set its next as curr.

**Question 7:**
These tests are sufficient in that the test all possible scenarios when inserting an element, however in the grand scheme of linked lists, this class itself would be insufficient seeing as there is no remove function.




