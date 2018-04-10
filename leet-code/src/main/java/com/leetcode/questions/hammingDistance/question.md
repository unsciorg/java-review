# 计算海明距离

### 海明距离

两个码字的对应比特取值不同的比特数称为这两个码字的海明距离。在一个有效编码集中,任意两个码字的海明距离的最小值称为该编码集的海明距离。举例如下：10101和00110从第一位开始依次有第一位、第四、第五位不同，则海明距离为3。

### 计算方式

计算汉明距离的一种方法，就是对两个位串进行异或（xor）运算，并计算出异或运算结果中1的个数。例如110和011这两个位串，对它们进行异或运算，其结果是：

110⊕011=101

异或结果中含有两个1，因此110和011之间的汉明距离就等于2。

## 作用

用于编码的检错和纠错

为了检测d个错误，需要一个海明距离为d+1的编码方案。因为在这样的编码方案中，d个1位错误不可能将一个有效码字改编成另一个有效码字。当接收方看到一个无效码字的时候，它就知道已经发生了传输错误。类似地，为了纠正d个错误，需要一个距离为2d+1的编码方案，因为在这样的编码方案中，合法码字之间的距离足够远，因而即使发生了d位变化，则还是原来的码字离它最近，从而可以唯一确定原来的码字，达到纠错的目的

### 题目

The [Hamming distance](https://en.wikipedia.org/wiki/Hamming_distance) between two integers is the number of positions at which the corresponding bits are different.

Given two integers `x` and `y`, calculate the Hamming distance.

**Note:**
0 ≤ `x`, `y` < 231.

**Example:**

```
Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
```



