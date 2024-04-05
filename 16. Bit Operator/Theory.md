## Understanding Bitwise Operations

Bitwise operations work directly on the binary representation of data. They manipulate individual bits, allowing for efficient manipulation and optimization of data. Here's how the provided code aligns with the theory:

### Bitwise Operators Used in the Code

1. **Bitwise AND (`&`):**
   - Used for performing AND operation between individual bits.
   - `int n = 1 & 1;` sets `n` to `1` because `1 & 1` results in `1`.

2. **Bitwise OR (`|`):**
   - Used for performing OR operation between individual bits.
   - `n = 1 | 0;` sets `n` to `1` because `1 | 0` results in `1`.

3. **Bitwise XOR (`^`):**
   - Used for performing XOR operation between individual bits.
   - `n = 0 ^ 1;` sets `n` to `1` because `0 ^ 1` results in `1`.

4. **Bitwise NOT (`~`):**
   - Used for performing NOT (negation) operation, which flips all bits.
   - `n = ~n;` flips all bits of `n`.

5. **Bit Shifting (`<<`, `>>`):**
   - Used for shifting bits to the left (`<<`) or right (`>>`).
   - `n = n << 1;` shifts all bits of `n` one position to the left.

### Counting Bits

The `countBits` function counts the number of set bits (bits with value `1`) in an integer. It does this by using bitwise AND operation with `1` to check the least significant bit and then right shifting the number by 1 (equivalent to division by 2), effectively moving to the next bit.
