Hash Usage

**Key:** 
A key is the input value fed into a hash function to determine the index or location for the storage of an item in a data structure.

**Hash Function:** 
The hash function takes the key as input and returns the index (hash index) of an element in an array, known as a hash table.

**Hash Table:** 
A hash table is a data structure that maps keys to values using a hash function. It stores data in an associative manner, where each data value has its unique index.

**Step 1:** Define a set of strings: {"ab", "cd", "efg"}

**Step 2:** Assign numerical values to each character:
- 'a' = 1
- 'b' = 2
- 'c' = 3
- 'd' = 4
- 'e' = 5
- 'f' = 6
- 'g' = 7

**Step 3:** Compute the numerical value for each string by summing the values of its characters:
- "ab" = 1 + 2 = 3
- "cd" = 3 + 4 = 7
- "efg" = 5 + 6 + 7 = 18

**Step 4:** Assume a hash table of size 7 to store these strings

**Step 5:** Compute the hash index for each string using the hash function (sum(string) mod 7):
- "ab" -> hash index = 3 % 7 = 3
- "cd" -> hash index = 7 % 7 = 0
- "efg" -> hash index = 18 % 7 = 4

**Step 6:** Store each string at its corresponding hash index in the hash table

Hash Implementation

**Separate Chaining**

**Step 1:** Create an empty hash table with slots corresponding to possible hash values

**Step 2:** For each key to be inserted:
- **Step 2.1:** Calculate the hash value of the key using the provided hash function
- **Step 2.2:** If the slot corresponding to the hash value is empty:
  - Store the key directly in that slot
- Else:
  - Handle collision by creating a linked list at that slot if not already present
  - Append the key to the linked list

**Linear Probing**

**Step 1:** Create an empty hash table with slots corresponding to possible hash values

**Step 2:** For each key to be inserted:
- **Step 2.1:** Calculate the hash value of the key using the provided hash function
- **Step 2.2:** If the slot corresponding to the hash value is empty:
  - Store the key directly in that slot
- Else:
  - Use linear probing to find the next available slot:
    - Initialize a variable keyIndex to the hash value
    - While the slot at keyIndex is occupied:
      - Increment keyIndex by 1 (with wrapping around if needed)
    - Store the key in the first available slot (keyIndex)

