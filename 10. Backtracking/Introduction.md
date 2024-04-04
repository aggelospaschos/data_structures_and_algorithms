## Backtracking

Backtracking is a technique where we find a solution incrementally by trying different paths and undoing them if they hit a dead end. It’s mostly used when we want to search a path

void FIND_SOLUTIONS( parameters):

    if (valid solution):

        store the solution

    Return

    for (all choice):

        if (valid choice):

            APPLY (choice)

            FIND_SOLUTIONS (parameters)

            BACKTRACK (remove choice)

    Return