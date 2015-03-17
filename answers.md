## Andrew Reed
####Linked Lists Lab

**Question 1:** I would test that the methods are working correctly in an empty list by first creating a list without any nodes in it. Then I would assert that the length of the list is 0. This is the most important because it shows that the list truly is empty. Then inserting the number 0 into the `getName` and `getQuantity` methods should return "null" and -1 respectively because there is no string or quantity at index 0. Then entering any string in `isMember` should return false because there are no nodes in the list for a node to return a string contained in a node on the list.

**Question 2:** I will test this by inserting a new name/quantity with `insert` into the sorted linked list and set `getName` and `getQuantity` to 0 then have assert statements that equal the name and quantities that I inserted. I will then assert that the `length` is equal to 1 and assert that `isMember` is true if I assert the string I inserted and is false if I assert a string that is different from the one I inserted.

**Question 3:** For this test I tested it almost exactly like I did for question two but I tested for the values and the strings for both members of the linked list. I also tested each node twice to make sure I was traversing the list properly and wasnít overwriting either of the two members of the list.

**Question 4:** I do believe that the code, after working for one head insert, will work for all repeated head inserts. I also performed the tests out of order with respect to the list in order to once again check that the list traversing worked properly.

**Question 5:** The variable `prev` should have a `getQuantity()` value greater than that of a new node in order to for the new node to be inserted at the end of the list. In the case where there is only one node and a second should be added to the end of a list, this mean that `prev` should be `head`.

**Question 6:** The variable `prev` must be `head` in order to add a third node into a list of two nodes when the third node must be inserted in the middle of the other two nodes.

**Question 7:** Although all the tests pass, this is not convincing evidence that the class is working. Depending on how the code is written, in the case that a new insert has the same quantity as a node already in the list, the new insert may overwrite the old node or be placed in the wrong position in the list. In order to make sure this does not happen, a new test `testMixedRepeated` was created, inserting multiple nodes with the same value, one in the beginning, middle, and ending of the list, in and checking they were all in the right positions.

I also created a test which tested if the sorted linked list was working if the new inserts were supposed to place the created nodes at the tail end of the list multiple times. I then created a test where the head and tail ends are stationary that way the test only checks to see if the nodes was sorting correctly between multiple nodes.

**Question 8:** This lab has helped me understand how traversing a list works much better. It also showed the uses that object oriented programming has in a concrete, project setting with real life applications as opposed to just learning it in class. 
