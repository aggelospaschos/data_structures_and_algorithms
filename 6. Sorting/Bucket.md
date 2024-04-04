## Bucket Sort

### Partitioning into Buckets
1. Divide the elements into separate buckets based on a predefined criterion
2. For each element in the array, determine which bucket it belongs to and place it accordingly

### Sorting within Buckets
1. Sort each individual bucket. We can apply Insertion Sort within each bucket

### Concatenating Buckets
1. After sorting, concatenate the elements from all buckets back into the original array, in order

Suppose we have an array `[1, 2, 0, 1, 2, 0, 1, 2]`:
1. Count the occurrences of each value: `counts = [2, 3, 3]`
2. Fill the buckets in the original array based on the counts:
		Bucket 0: `[0, 0]`
		Bucket 1: `[1, 1, 1]`
		Bucket 2: `[2, 2, 2]`
3. Concatenate the buckets: `[0, 0, 1, 1, 1, 2, 2, 2]`