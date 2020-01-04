# twoDaysAndTopic
描述：基本上天天都会做一道算法题

### 入门训练：

兔子数列

圆的面积

序列求和

A+B问题

### 基础练习：

1. 闰年判断：  满足两个条件的其中一个就可以了，但是都得要写上，用或连接

2. str01 字符串  ：都是把10进制转化成二进制的，方法是取余，对数组进行逆顺序添加

3. 杨辉三角形： 这个自己也没想出来如何解决。

4. 10进制转化成二进制： 这个自己没有想出来好的解决办法

5. 查找整数：  在判断的时候，条件得要注意一下  i>= array1.length  ;  再循环判断的过程中，i==array1.length-1的  当数组长度是1的时候，这种办法就是错误的。

   ```java
   boolean flag = false;
   		int i =0;
   		while(true){
   //			先判断是否到了最后一个
   			if (i==array1.length-1) {
   				break;
   			}
   //			判断值是否相等
   			if (temp==array1[i]) {
   				flag=true;
   				break;
   			}
   			i++;
   		}
   		if (flag) {
   			System.out.println(i+1);
   		}else {
   			System.out.println(-1);
   		}
   ```

   

6. 回文数 ：  这个思路是遍历所有的  其实只用遍历两个  i  k；最终格式  i*1000+k*100+k*10*i,这样就满足了1221，正读和反着读都一样的。

   ```java
   for (int i = 1; i <10 ; i++) {
   			for(int j =0;j<10;j++){
   				System.out.println(i*1000+j*100+j*10+i);
   			}
   		}
   ```

   

7. 数列特征： 我是在添加的是时候就开始进行判断最大的和最小的，也就是输入完毕，计算也完毕；给他们直接敷上了最小的数

   ```java
   int range = input.nextInt();//数组值得范围
   		int max = -100001;  //最大值
   		int min = -100001;  //最小值
   		int sum=0;  //总和
   ```

   

   ```
   for(int i = 0 ;i<range;i++){
   			array1[i]=input.nextInt();
   			if(i!=0){
   				if (max<array1[i]) {
   					max=array1[i];
   				}
   				if (min>array1[i]) {
   					min = array1[i];
   				}
   			}else {
   				max = array1[0];
   				min = array1[0];
   			}
   			sum+=array1[i];
   		}
   ```

   