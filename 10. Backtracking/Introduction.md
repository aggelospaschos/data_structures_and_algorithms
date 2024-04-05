## Backtracking Algorithm

Backtracking is a technique where we find a solution incrementally by trying different paths and undoing them if they hit a dead end. It’s mostly used when we want to search a path.

```cpp
void FIND_SOLUTIONS(parameters):

    if (valid solution):
        store the solution
        Return

    for (all choice):
        if (valid choice):
            APPLY(choice)
            FIND_SOLUTIONS(parameters)
            BACKTRACK(remove choice)
            
    Return
```

### Explanation:

- `FIND_SOLUTIONS(parameters)`:
  - This function is called recursively to search for solutions incrementally.

- `if (valid solution)`:
  - Checks if the current state is a valid solution. If it is, the solution is stored, and the function returns.

- `for (all choice)`:
  - Iterates through all possible choices or options.

- `if (valid choice)`:
  - Checks if the current choice is valid to proceed.

- `APPLY(choice)`:
  - Applies the current choice to move forward in the search.

- `FIND_SOLUTIONS(parameters)`:
  - Recursively calls the FIND_SOLUTIONS function to continue searching with the updated state.

- `BACKTRACK(remove choice)`:
  - Reverts the applied choice to backtrack and explore other possibilities.

This algorithm efficiently explores all possible paths to find a solution while backtracking whenever a dead end is encountered.
