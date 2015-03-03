# CSCI 121: Computer Science II
## Linked List Lab

### Overview

The goal of this lab is for you to gain some experience writing and testing
code using linked lists. Along the way, you will likely need to use the
debugger to find errors. You are expected to complete the following activities
*without using your notes or other written resources*. Instead, think about the
existing code and use logic, pictures, testing, and debugging to ensure your
code is correct.

In this lab you will continue to practice Test-Driven Development. As you did in
the scoreboard lab, you will write tests first and then implement the class
methods to make the tests pass.

Recall that the basic "mantra" of testing is to:

1. Make an instance of the object in a known state.
2. Exercise that object by calling mutator methods.
3. Verify that the object is in the proper state by calling query methods and
asserting the expected values.

### Sorted Linked Lists

In class we have discussed the following operations on linked lists:

- Inserting at the head of a list.
- Printing a list.
- Checking if an item is contained in a list.
- Removing an item from a list.

In this lab you will implement several more operations and implement a sorted
linked list.

Instead of storing just a string, each node of our sorted linked list will
store a string and an integer which represents a quantity. Instead of
inserting items at the head, new items will be inserted in such a way that the
list remains sorted by quantity after each node is inserted.

The `print()` method is already implemented, but you will need to implement the
following additional operations:

- Get the name of a node at a specified index (similar to an array).  Return `null` if the index does not exist
- Get the quantity of a node at a specified index.  Return -1 if the index does not exist.
- Get the length of the list.
- Check if a node with the specified name is in the list.
- Insert a node with a given name and quantity into the appropriate position
in the list.

A `Node` class and a skeleton for the `SortedLinkedList` class are in the
`src/` directory. Before you continue, read the comments above each method so
you understand how each method works.

### Empty Lists

With test-driven development, our goal is to start with "easy" cases and work
up to more complicated ones.  For a linked list, an empty list is the easiest
case because we simply have to make the the `head` reference equal to `null`.

Therefore, we will begin our implementation by writing a test for an empty list.

**Question 1:** Draw a picture of an empty linked list and describe how you
could test that the methods work correctly on this list.

Implement a test named `testEmptyList`, and make *limited* changes to the
`SortedLinkedList` class so that this test passes.

### Single Node Lists

When we add a node to an empty list, it becomes the head node, which only
requires a very small amount of code.

**Question 2:** Draw a picture of a linked list with one node, and describe how
you could test that the methods work correctly on this list.

Implement a test named `testSinlgeNode`, and make *limited* changes to the
`SortedLinkedList` class so that *both* tests pass.

### Adding a Second Node

The second node added to the list could go before or after the first.  As we saw in class, a head insert is "easier" than adding at the middle or end.

**Question 3:** Draw a picture of a linked list with two nodes, the node from Question 2 and one other node *before* that node.  Remember that we are keeping the list sorted by quanity with the largest number at the head of the list.

Implment a test named `testSecondNodeNewHead`, and make changes to the `SortedLinkedList` class so that all three tests pass.  For the `getName` and `getQuantity` methods, you will have to *traverse* the list.  Notice the code from the `print` method:

```
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
```

This code uses a temporary `Node` reference to keep track of our current location in the list.  After we print that `Node`, the code `temp = temp.getNext()` moves temp to the next `Node` in the list.  In `getName` and `getQuantity`, we use a similar pattern with an additional counter to keep track of our current index.

### Repeated Head Insert

** Question 4:** Draw a picture of a linked list with three nodes, the first two from Question 3 and one other node *before* that node.  Do you think your code will work to add nodes in reverse order?

Implement a test named `testRepeatedHeadInsert`, and make any necessary changes to the `SortedLinkedList` class so that all four tests pass.

### Generalized Insertion

We have now handled all the cases of insertion that can be completed without traversing the list (empty, single, head).  The process for a generalized insertion is to:

1. Find where to insert
2. Change the references to add the `Node` to the list

To find the place where the new node belongs, we need to extend the traversal pattern:


```
Node curr = head;
Node prev = null;

while(curr != null)
{
  // do something with curr or prev
  prev = curr;
  curr = curr.getNext();
}
```

Before you continue, you should trace this code for a sample list of four nodes.

**Question 4:** Draw a picture of a list with one node.  What should `prev` be so we can add a second node to the end of the list?

Implement a test named `testSecondTail`, and make the necessary changes to the `SortedLinkedList` so that all your tests pass.


**Question 5:** Draw a picture of a list with two nodes.  What should `prev` be so that we can add a third node in the middle of the list?

Implement a test named `testMiddleThird`, and make the necessary changes to the `SortedLinkedList` so that all your tests pass.

**Question 6:** Now that all tests pass, is this convincing evidence that the
class is working?  If so, explain why.  If not, describe further tests needed
(and implement them).

### Reflection

**Question 7:** Reflect on what you learned in this lab.  How has implementing
these methods "from scratch" helped clarify your understanding of linked lists?
