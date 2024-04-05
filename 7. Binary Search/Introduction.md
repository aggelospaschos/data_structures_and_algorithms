## Binary Search

### Initializing Search Space

- **Set the low and high indices to the beginning and end of the array, respectively**
- **Calculate the middle index**

### Searching

- **While the low index is less than or equal to the high index:**
  - **Calculate the middle index of the current search space**
  - **Compare the target with the value at the middle index**
    - **If the target is greater than the middle element, update the low index to mid + 1**
    - **If the target is less than the middle element, update the high index to mid - 1**
    - **If the target equals the middle element, return the index**

### Termination

- **If the target is not found after exhausting the search space, return -1 to indicate failure**

### Example:

Consider array `array[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91}` and the target `23`:

1. Start with `Low = 0`, `High = 9`
2. Calculate `mid = (0 + 9) / 2 = 4`. Check if target is greater or less than the mid element (`16`).
3. Since target (`23`) is greater than mid element (`16`), update `Low` to `mid + 1`, making `Low = 5`
4. Calculate `mid = (5 + 9) / 2 = 7`. Check if target is greater or less than the mid element (`56`).
5. Since target (`23`) is less than mid element (`56`), update `High` to `mid - 1`, making `High = 6`
6. Calculate `mid = (5 + 6) / 2 = 5`. Check if target is greater or less than the mid element (`23`).
7. Since target (`23`) equals mid element (`23`), return the index `5`
