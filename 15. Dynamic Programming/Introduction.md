# Dynamic Programming

Dynamic Programming is an algorithmic technique in math and computer science that helps us solve tricky problems by breaking them down into smaller, simpler parts.

## How it works

1. **Identify Subproblems**: First, we chop up the big problem into smaller chunks, kind of like breaking a big puzzle into smaller pieces.

2. **Store Solutions**: Next, we solve each of these smaller problems one by one, but we remember the answers and keep them safe in a table or array.

3. **Build Up Solutions**: Now that we've solved the small problems, we use those solutions to tackle the main problem. We put all the pieces together like solving a puzzle.

4. **Avoid Redundancy**: By storing solutions, we make sure we don't waste time solving the same problem over and over again. Once a problem is solved, we just use the answer whenever we need it again.

Dynamic Programming is super handy for solving tricky problems efficiently. We use it when we have a big problem made up of smaller problems, and those smaller problems pop up again and again. There are two main ways to use Dynamic Programming:

- **Top-Down Approach (Memoization)**: Start with the big problem and break it down into smaller ones. We save the solutions to these smaller problems to avoid repeating ourselves.

- **Bottom-Up Approach (Tabulation)**: Start with the smallest problems and work our way up to the big one. We fill up a table with solutions as we go along.
