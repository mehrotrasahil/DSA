# 📚 Sorting Algorithms - Complete Beginner Notes

This document is a one-stop guide to help you understand the most important sorting algorithms in a beginner-friendly way.

---

## ✅ What is Sorting?

Sorting is the process of arranging elements in a particular order (ascending or descending).

### ✨ Why Sorting is Important:

* Makes searching faster (e.g., Binary Search)
* Helps in solving complex problems (like merging, ranking, etc.)
* Used in databases, leaderboards, and real-time systems

---

## 🔢 Types of Sorting

We’ll cover:

* Selection Sort
* Bubble Sort
* Insertion Sort
* Merge Sort
* Quick Sort
* Heap Sort

Each includes:

* Concept
* Step-by-step logic
* Java code
* Time & Space Complexity

---

## 1️⃣ Selection Sort

### 📌 Concept:

Find the smallest element from the unsorted part and put it at the beginning.

### 🔁 Steps:

1. Start from index 0
2. Find the minimum element from index `i` to `end`
3. Swap it with element at index `i`
4. Repeat until the array is sorted

### 🧪 Java Code:

```java
for (int i = 0; i < arr.length - 1; i++) {
    int minIndex = i;
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minIndex]) {
            minIndex = j;
        }
    }
    int temp = arr[minIndex];
    arr[minIndex] = arr[i];
    arr[i] = temp;
}
```

### 🧠 Time & Space:

* Time: O(n^2) for all cases
* Space: O(1)

---

## 2️⃣ Bubble Sort

### 📌 Concept:

Repeatedly swap adjacent elements if they are in the wrong order.

### 🔁 Steps:

1. Compare each pair of adjacent items
2. Swap them if they’re in the wrong order
3. Repeat the process until the array is sorted

### 🧪 Java Code:

```java
for (int i = 0; i < arr.length - 1; i++) {
    for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
    }
}
```

### 🧠 Time & Space:

* Time: Worst: O(n^2), Best: O(n) (if already sorted)
* Space: O(1)

---

## 3️⃣ Insertion Sort

### 📌 Concept:

Build the sorted array one item at a time.

### 🔁 Steps:

1. Take one element at a time
2. Compare with elements in the sorted part
3. Shift larger elements to the right
4. Insert the current element into the correct position

### 🧪 Java Code:

```java
for (int i = 1; i < arr.length; i++) {
    int key = arr[i];
    int j = i - 1;
    while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
    }
    arr[j + 1] = key;
}
```

### 🧠 Time & Space:

* Time: Worst: O(n^2), Best: O(n)
* Space: O(1)

---

## 4️⃣ Merge Sort (Divide & Conquer)

### 📌 Concept:

Divide the array, sort each half, then merge them.

### 🔁 Steps:

1. Divide the array into 2 halves
2. Recursively sort both halves
3. Merge sorted halves

### 🧪 Java Code:

```java
void mergeSort(int[] arr, int l, int r) {
    if (l < r) {
        int m = (l + r) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
    }
}
```

### 🧠 Time & Space:

* Time: O(n log n) all cases
* Space: O(n)

---

## 5️⃣ Quick Sort (Divide & Conquer)

### 📌 Concept:

Choose a pivot, partition the array, and sort recursively.

### 🔁 Steps:

1. Pick a pivot
2. Partition the array around the pivot
3. Recursively sort subarrays

### 🧪 Java Code:

```java
int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;
}
```

### 🧠 Time & Space:

* Time: Average: O(n log n), Worst: O(n^2)
* Space: O(log n)

---

## 6️⃣ Heap Sort

### 📌 Concept:

Convert the array to a heap and extract max/min repeatedly.

### 🔁 Steps:

1. Build a max heap
2. Swap root with last element
3. Heapify the reduced heap

### 🧠 Time & Space:

* Time: O(n log n)
* Space: O(1)

---

## 🧾 Summary Table

| Algorithm      | Best       | Average    | Worst      | Space    | Stable |
| -------------- | ---------- | ---------- | ---------- | -------- | ------ |
| Selection Sort | O(n^2)     | O(n^2)     | O(n^2)     | O(1)     | ❌      |
| Bubble Sort    | O(n)       | O(n^2)     | O(n^2)     | O(1)     | ✅      |
| Insertion Sort | O(n)       | O(n^2)     | O(n^2)     | O(1)     | ✅      |
| Merge Sort     | O(n log n) | O(n log n) | O(n log n) | O(n)     | ✅      |
| Quick Sort     | O(n log n) | O(n log n) | O(n^2)     | O(log n) | ❌      |
| Heap Sort      | O(n log n) | O(n log n) | O(n log n) | O(1)     | ❌      |

---

## 🧠 Tips for Interviews

* Understand how each sort works step-by-step
* Know when to use which sort:

  * Insertion Sort: small or nearly sorted arrays
  * Merge Sort: stable and safe for large data
  * Quick Sort: fast, but risky with bad pivots
  * Heap Sort: great when no extra memory is allowed

---

Feel free to add dry run examples and practice writing each algorithm from scratch. This helps build confidence and understanding! 🚀
