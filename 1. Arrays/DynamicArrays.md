## Dynamic Array Operations

### Initialization

To declare and initialize a `DynamicArray` object:

1. Declare an object `DynamicArray()` with the following attributes:
   - `length`: Current number of elements in the array
   - `capacity`: Current capacity of the array
   - `fixed_type`: Data type of the elements stored in the array

### Insertion

When inserting a value into the array:

1. If `length` equals `capacity`:
    a. Double the capacity
        - Create a new array with the new capacity
        - Copy elements from the old array to the new array
        - Make the new array the default one
2. Insert the value at the end of the array: `array[length] = value`
3. Increase the `length` by 1

### Removal

To pop an element from the end of the array:

1. Ensure the array is not empty
2. Decrease the `length` by 1

### Access

To get an element at a specific index of the array:

1. Ensure the index is within bounds (out of bounds exception)
2. Return the value at the specific index: `array[index]`

### Insertion at Specific Index

To insert an element at a specific index of the array:

1. Assign a value to the specified index of the array: `array[index] = value`
