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

- Getting the name of a node at a specified index (similar to an array).
- Getting the quantity of a node at a specified index.
- Getting the length of the list.
- Checking if a node with the specified name is in the list.
- Inserting a node with a given name and quantity into the appropriate position
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

### Multiple Nodes

Moving to multiple nodes causes an explosion of possibilities because the
methods may need to manipulate data:

1. At the beginning of the list.
2. In the middle of the list.
3. At the end of the list.

Of these three, manipulating the list at the beginning is the easiest because
we do not need to traverse the list.

**Question 3:** Draw a picture of a four-node list, and describe how you could
test that all the methods work correctly when we only manipulate the list at
the beginning.

Implement a test named `testBeginManip`, and make changes to the
`SortedLinkedList` class so all tests pass.

**Question 4:** Using your picture of the four-node list, describe how you
could test that all the methods work when we only manipulate the list in the
middle.

Implement a test named `testMiddleManip`, and make all tests pass.

**Question 5:** Using your picture of the four-node list, describe how you
could test that all the methods work when we only manipulate the list at the
end.

Implement a test named `testEndManip`, and make all tests pass.

**Question 6:** Now that all tests pass, is this convincing evidence that the
class is working?  If so, explain why.  If not, describe further tests needed
(and implement them).

### Reflection

**Question 7:** Reflect on what you learned in this lab.  How has implementing
these methods "from scratch" helped clarify your understanding of linked lists?
