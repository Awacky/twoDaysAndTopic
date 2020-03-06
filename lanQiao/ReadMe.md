# 十大经典排序算法

先放一张图来镇帖

![](http://yun.awacky.com/2020-2-17.png)

1. **关于时间复杂度**：

   1. 平方阶 (O(n2)) 排序 各类简单排序：直接插入、直接选择和冒泡排序。
   2. 线性对数阶 (O(nlog2n)) 排序 快速排序、堆排序和归并排序；
   3. O(n1+§)) 排序，§ 是介于 0 和 1 之间的常数。 希尔排序
   4. 线性阶 (O(n)) 排序 基数排序，此外还有桶、箱排序。

   **关于稳定性**：

   稳定的排序算法：冒泡排序、插入排序、归并排序和基数排序。

   不是稳定的排序算法：选择排序、快速排序、希尔排序、堆排序。

   **名词解释**：

   **n**：数据规模

   **k**：“桶”的个数

   **In-place**：占用常数内存，不占用额外内存

   **Out-place**：占用额外内存

   **稳定性**：排序后 2 个相等键值的顺序和排序之前它们的顺序相同

## 一、冒泡排序

Bubble Sort（冒泡排序）：是一种种简单直观的排序算法。他重复地走访过要排序的数列，一次比较两个元素，如果小的元素在后面，则交换位置。走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。

### 1、算法步骤

比较相邻的两个元素。如果第一个比第二个大，就交换他们两个。

对每一对相邻的元素重复同样的工作，从开始第一对到结尾最后一对。把最大的元素就沉到最后。每次循环结束，确定一个数的位置。

时间复杂度 O(n*n) 

### 2、动图演示

![](https://raw.githubusercontent.com/hustcc/JS-Sorting-Algorithm/master/res/selectionSort.gif)

### 代码仓库地址：

## 二、选择排序

选择排序是一种简单直观的排序算法，无论什么数据进去都是 O(n²) 的时间复杂度。所以用到它的时候，数据规模越小越好。唯一的好处可能就是不占用额外的内存空间了吧。选择排序算法通过反复地将某个特定的值放到列表中已排序的最后一个位置上从而完成对某一列表值得排序。

### 1、算法步骤

首先在末排序序列中找到最小（大）的那个元素，存放到序列的起始位置

再从剩余末排序元素中继续寻找到最小（大）的那个元素，存放到已排序序列的末尾

重复第二步，知道所有元素均排序完毕

### 2、动图演示

![](https://raw.githubusercontent.com/hustcc/JS-Sorting-Algorithm/master/res/selectionSort.gif)

### 3、代码地址：

## 三、插入排序

插入排序相当于冒泡排序的进化版，冒泡只比较邻近的位置，而插入比较这个元素之前的所有元素，找到合适的位置。

### 1、算法步骤：

将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列

从头到尾依次扫描未排序序列，将扫描到的每一个元素插入有序列的适当位置。（如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素后面）

### 2、动图演示：

![](https://raw.githubusercontent.com/hustcc/JS-Sorting-Algorithm/master/res/insertionSort.gif)

### 3、代码地址：

## 四、希尔排序

希尔排序：也称递减量排序算法，是插入排序的一种更高效改进版本。但是希尔排序是非常稳定的排序算法。

希尔排序是基于插入排序的以下两点性质改进的：

- 插入排序在对几乎已经排好的数据操作时，效率高，既可以达到线性排序的效率；
- 但插入排序一般来说是低效的，因为插入排序每次只能将数据移动一位；

希尔排序的的基本思想是：先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，待整个序列中的记录“基本有序时”，再对全体记录进行依次插入排序。

### 1、算法步骤

1. 选择一个增量序列，t1,t2,······,tk,其中ti>tk,tk=1;
2. 按增量序列个数k，对序列进行k趟排序；
3. 每趟排序，根据对应增量ti,将待排序列分割成若干长度为m的子序列，分别对个子表进行直接插入排序。仅增量因子为1时，整个序列作为一个表来处理，表长度即为整个序列长度。

### 2、代码地址



##五、归并排序

归并排序（Merge sort)是建立在归并操作上一种有效的排序算法。(也是一种递归排序算法)该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。

作为一种典型的分而治之的思想的算法应用，归并排序的实现由两种方法:

自上而下的递归（所有递归的方法都可以用迭代重写，所以就有了第2种方法）；

自下而上的迭代；

###1、算法步骤

申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列；

设置两个指针，最初的位置分别为两个已经排序序列的起始位置；

比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一个位置。

###2、动图演示

![](https://raw.githubusercontent.com/hustcc/JS-Sorting-Algorithm/master/res/mergeSort.gif)
###3、代码仓库

##快速排序
快速排序：通过使用一个任意特定的分区元素（partition element）将该列表分区，然后对分区元素的任一边的子列表进行排序。
###1、算法步骤
首先在列表选择一个列表元素作为分区元素
下一步，分割该列表，使得小于该元素的所有元素位于该元素的左边，所有大于该元素的右边，
最后，将该快速排序策略（递归式）应用于两个分区。

每一次都找到了基准位置。
###动图演示
![](https://raw.githubusercontent.com/hustcc/JS-Sorting-Algorithm/master/res/quickSort.gif)
###代码仓库

##堆排序
堆排序（HeapSort）是指利用堆这种数据结构所设计的一种算法。堆积是一个完全二叉树结构，并同时满足堆积的性质：即子结点的键值或索引值总是小于（或大于）它的父结点。堆排序可以说是利用堆的概念来排序的选择排序。分为两种方法：
1、大顶堆：每个结点的值都大于或等于其子结点的值，在堆排序算法中用于升序排序
2、小顶堆：每个结点的值都小于或等于其子结点的值，在堆排序算法中用于降序排序
算法思想：假设一个小顶堆中有n个元素，如果堆中根结点的元素输出之后，再将剩下的n-1个元素重新建立成一个新堆，并将根结点元素输出输出，重复执行直到堆中没有元素为止，这样输出的序列就已成为了从小到大排序的序列了。
根的左子结点满足 2i+1;
根的右子结点满足 2i+2;
i结点的父结点下标： （i-1） / 2;
###算法步骤
1、创建堆：
如果是大顶堆:arr[0] >= arr[2i+1] && arr[0] >= arr[2i+2] (i=0,1,2,3······) 
如果是小顶堆:arr[0] <= arr[2i+1] && arr[0] <= arr[2i+2] (i=0,1,2,3······)
建立一个小顶堆的思想是：
从位于元素序列中的最后一个非叶子结点（如图这里的索引是从0开始的，所以最后一个非叶子结点是  arr.length/2 -1）
假设当前结点的序号为i，则当前元素为arr[i],其左右孩子的结点分别是arr[2*i+1]和arr[2*i-1]。将子节点其中两个比较小的与arr[i]比较，如果较小的在子节点，则与arr[i]进行交换，反之则不交换。逐层向上执行此操作，直到根节点，这样就建立了一个小顶堆。
2、调整堆
我们已经找到了当前数组中最小的了，将其与最后一个元素进行交换，然后输出最后一个元素，新的数组（不包括最后一个了）继续堆化，重复执行二，直到剩下最后一个元素。
###动图演示
![](https://raw.githubusercontent.com/hustcc/JS-Sorting-Algorithm/master/res/heapSort.gif)
###代码仓库

##计数排序
这个想法还是比较其妙的，常用于找到最小可用ID，计数排序的核心在于将输入的数据值转化成为键储存在额外开辟的空间中。作为一种线性时间复杂度的排序，计数排序要求输入的数据必须是有确定范围的整数。
###动图演示
![](https://raw.githubusercontent.com/hustcc/JS-Sorting-Algorithm/master/res/countingSort.gif)
###代码仓库

##桶排序
桶排序是计数排序的升级版。它利用了函数的映射关系，高效与否的关键就在于这个映射函数的确定。为了是桶排序更加高效，我们需要做到这两点：
1、在额外空间充足的情况下，尽量增大桶的数量
2、使用的映射函数能够将输入N个数据平均分配到K个桶中
所以桶排序需要尽量保证元素分散均匀，否则当所有数据集中在一个桶是，桶排序失效。
###1、什么时候最快
当输入的数据可以平均的分配到每一桶中。
###2、什么时候最慢
当输入的数据被分配到了同一个桶中。
###图解过程
![](https://img-blog.csdnimg.cn/20190219081232815.png)
###代码仓库：





