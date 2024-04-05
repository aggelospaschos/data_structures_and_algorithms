## Important!

Recursion is an act in which a function calls itself in order to solve the sub-problem of the original problem. There are some fundamental steps you need to have in mind when implementing recursion:

### Define a Base Case

1. **Determine the simplest case for which the solution is known.**
2. **Check if the input parameter meets the condition for the base case.**
3. **If the condition is met, return the known solution.**

### Define a Recursive Case

1. **Break down the problem into smaller versions of itself.**
2. **Define the recursive function in terms of itself, with the input parameter(s) adjusted to approach the base case.**
3. **Ensure that each recursive call moves closer to the base case.**

### Ensure the Recursion Terminates

1. **Make sure that the recursive calls eventually reach the base case.**
2. **Verify that the input parameter(s) are adjusted in a way that leads to the base case.**
3. **Avoid infinite recursion by providing a mechanism to reach the base case.**

