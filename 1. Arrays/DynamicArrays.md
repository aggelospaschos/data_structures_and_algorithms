## Let's Continue

The memory access is random, meaning the insertion of an element in an array is not assuring it will be contiguous.

To solve this, we re-allocate in memory a new array ( preferably with double the size for more efficient time and space management operations ), that can hold the new inserted values.

### Dynamic Array Operations

To declare and initialize `DynamicArray()`:

1. Declare an object `DynamicArray()` with attributes: `length`, `capacity`, `fixed_type`
2. If length equals capacity:
    a. Double the capacity
	     a1. Create a new array with the new capacity
	     a2. Copy elements from the old array to the new array
	     a3. Make the new array the default one
3. Insert a value at the end of the array (`array[length] = value`)
4. Increase the length by 1

To pop an element from the end of the array:

1. Ensure the array is not empty
2. Decrease the length by 1

To get an element at a specific index of the array:

1. Ensure the index is within bounds (out of bounds exception)
2. Return the value at the specific index (`array[index]`)

To insert an element at a specific index of the array:

1. Assign a value to the specified index of the array (`array[index] = value`)