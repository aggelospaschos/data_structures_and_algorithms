## What About Stacks

Stacks are a Last-In-First-Out data structure that uses constant time operations for linear time operations (insert/remove/peek). In reality, they’re just dynamic array lists of objects:

`ArrayList<Object> stack = new ArrayList<Object>();` 

To remove an element from the stack, just decrease the stack size by 1 `remove(stack.size()-1)`