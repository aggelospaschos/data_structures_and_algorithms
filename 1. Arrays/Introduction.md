## To Get Started

In arrays, we take as a regard the length ( number of values in the array ), the size ( the number of values that take place in RAM ), and the index that points to the specific element address in the array ( the location of next index depends on the data type we use ). 

Space cannot be deleted in an array, just overwritten, either with null value (0), or with a shift of elements (insert/remove operation).

### Insert / Remove Οperations

Τo insert at the end of the array: 

1. Check if length < capacity
2. If true, assign value to `array[length]`
3. Increment length by 1

To remove from the end of the array:

1. Check if array is not empty
2. If true, assign 0 to `array[length - 1]`
3. Decrement length by 1

To insert in the middle of the array:

1. Start looping from end of array (`index = length - 1`) until index before insertion point (`index > i - 1`)
2. Shift elements to the right to make space for insertion value: `array[index + 1] = array[index]`
3. Insert value at desired index: `array[i] = value`

To remove from the middle of the array: 
1. Start looping from index next to index of value to remove (`index = i + 1`) until end of array (`index < length`)
2. Shift elements to the left to overwrite value to remove: `array[index - 1] = array[index]`