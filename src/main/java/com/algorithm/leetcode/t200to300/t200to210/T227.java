package com.algorithm.leetcode.t200to300.t200to210;

import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class T227 {

    @Test
    public void  testMakeConnected(){
        int n = 4;
        int[][] arr = {{0,1},{0,2},{1,2}};
        System.out.println(makeConnected(n, arr));
    }

    private int makeConnected(int n, int[][] connections) {
        int rows = connections.length;
        //初始化返回矩阵
        int res = 0;
        int[][] arr = new int[n][n];
        //先将链接矩阵初始化
        for (int i=0;i<rows;i++){
            arr[connections[i][0]][connections[i][1]] =1;
        }
        //
        return res==0?-1:res;
    }

    //判断 check 这行和这列到对角线的位置存在1的个数
    private int hashOne(int[][] arr, int check){
        int res  = 0;
        int row = 0;
        while (row<check){
            if (arr[row][check] ==1){res +=1 ;}
            row += 1;
        }
        int col = check +1;
        while (col< arr[0].length){
            if (arr[check][col] ==1){res+= 1 ;}
            col += 1;
        }
        return res;
    }



    @Test
    public void testMinFlips(){
        int curNum = 1;
        //3, 1, 0, 3
        int[] a = {2,4,1,8};
        int[] b = {6,2,2,3};
        int[] c = {5,7,3,5};
        int start = 0;
        int end = 3;
        for (int i=start;i<=end;i++) {
            System.out.println("----------------------------");
            System.out.println(minFlips(a[i], b[i], c[i]));
        }
    }

    private int minFlips(int a, int b, int c) {
        //初始化返回值
        int res = 0;
        //当前二进制的位数
        int curNum = 1;
        int maxNum = Math.max(Math.max(a,b),c);
        while (curNum <= maxNum) {
//            System.out.println(curNum);
            //判断c在当前位置是1还是0
            boolean curAIsOne = (curNum & a) == curNum;
            boolean curBIsOne = (curNum & b) == curNum;
            boolean curCIsOne = (curNum & c) == curNum;
            //如果 c位置是1
            if (curCIsOne) {
                //b和c都不为1，则至少要改变一个
                if (!curAIsOne && !curBIsOne) {
                    res += 1;
                }
            }
            //如果c位置是0
            else {
                //则b和c哪个为1就将哪个改为0
                if (curAIsOne) {
                    res += 1;
                }
                if (curBIsOne){
                    res +=1;
                }
            }
            curNum <<= 1;
        }
        return res;
    }


    @Test
    public void testGetNoZeroIntegers(){
        System.out.println(hashzero(10));
        System.out.println(Arrays.toString(getNoZeroIntegers(69)));
    }

    public int[] getNoZeroIntegers(int n) {
        int i = 1;
        int j = n-1;
        while (hashzero(i) || hashzero(j)) {
            i = i+1;
            j = j-1;
        }
        return new int[]{i, j};
    }

    //判断n的十进制表示是否含有0
    private  boolean hashzero(int n){
        while (n!=0){
            if (n%10==0){return true;}
            n = n/10;
        }
        return false;
    }



    @Test
    public void  testRotate(){
        int[] arr ={1,2,3,4,5,6,7};
        int k=3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }


    //旋转数
    public void rotate(int[] nums, int k) {
        //如果k等于0，则不做旋转的操作
        if (k==0){return;}
        //求数组的长度
        int lenArr = nums.length;
        //先用一个数组保留最后k个数
        int[] lastArr = new int[k];
        int j=0;
        for (int i=lenArr-1;i>=k;i--){
            if (k-1-j>=0) {
                lastArr[k - 1 - j] = nums[i];
                j += 1;
            }
            nums[i]= nums[i-k];
        }
        for (int l=0;l<k;l++){
            nums[l] = lastArr[l];
        }
    }


    @Test
    public void testStringToInteger(){
//        System.out.println(stringToInteger("33242"));
        String[] str ={"1+1-1", "1-1+1","0-2147483647","1 + 1", "42", "0", "3+2*2", " 3/2 ", " 3+5 / 2 ", " 332 + 24 * 2 "};//
        for (String s:str){
            System.out.println(calculate(s));
        }
    }


    private int calculate(String s) {
        if (s.length()==1){return (int)(s.charAt(0)-'0');}
        //首先将字符串中的空格去除
        s = s.replace(" ", "");
        //字符串的长度
        int sLen = s.length();
        //定义一个栈用来存放数据
        Stack<Character> myStackOperator = new Stack<>();
        Stack<Integer> myStackNum = new Stack<>();
        for (int i=0; i<sLen ;){
            //如果当前的字符是+或者-，我们先不做运算，直接将其压入栈中
            if (s.charAt(i)=='+' || s.charAt(i)=='-'){
                myStackOperator.push(s.charAt(i));
                i=i+1;
            }
            else {
                //找到下一个操作符的位置j。那么从i到j即为当前的数字。例如对于523+423，此时i=0，首先我们找到操作符的位置j=3。则第一个数字是523
                int j = i;
                while (j < sLen && s.charAt(j) != '+' && s.charAt(j) != '-' && s.charAt(j) != '*' && s.charAt(j) != '/') {
                    j++;
                }
                String curString = s.substring(i, j);
                myStackNum.push(stringToInteger(curString));
                if (j==sLen){
                    break;
                }
                //将字符串转成相应的数字
                //如果当前值是数字，则放到栈中
                if (s.charAt(j) == '+' || s.charAt(j) == '-') {
                    i = i == j ? i + 1 : j;
                }
                //如果当前是乘和除法。例如对于3*2+4*5。现在栈中是3。当输入*2后
                else {
                    //其次我们得找到与该操作符进行运算的下一个元素
                    int k1 = j + 1;
                    int k2 = k1;
                    while (k2 < sLen && s.charAt(k2) != '+' && s.charAt(k2) != '-' && s.charAt(k2) != '*' && s.charAt(k2) != '/') {
                        k2++;
                    }
                    //此时k1和k2之间的字符串就构成了下一个即将做运算的元素
                    int afterNum = stringToInteger(s.substring(k1, k2));
                    //然后将新运算出来的元素加到数字栈中
                    int beforeNum = myStackNum.pop();
                    if (s.charAt(j) == '*') {
                        myStackNum.push( beforeNum* afterNum);
                    } else {
                        myStackNum.push(beforeNum / afterNum);
                    }
                    i = k2;
                }
            }
        }
        //
        Stack<Character> myStackOperatorCopy = new Stack<>();
        Stack<Integer> myStackNumCopy = new Stack<>();
        if (myStackNum.size()>2) {
            while (!myStackNum.isEmpty()) {
                myStackNumCopy.push(myStackNum.pop());
            }
            while (!myStackOperator.isEmpty()) {
                myStackOperatorCopy.push(myStackOperator.pop());
            }
        }
        else {
            myStackOperatorCopy = myStackOperator;
            myStackNumCopy = myStackNum;
        }
        int curSum = myStackNumCopy.pop();
        //将栈中的元素依次弹出进行计算。此时栈中只有+-。只需进行顺序计算即可
        while (myStackNumCopy.size()!=0){
            char curOper   = myStackOperatorCopy.pop();
            int beforNum = myStackNumCopy.pop();
            if (curOper == '+'){
                curSum += beforNum;
            }
            else {
                curSum -= beforNum;
            }
        }
        return curSum;
    }


    private int stringToInteger(String str){
        //例如523转成数字，等于3+2*10+5*100=(5*10+2)*10+3
        int res =0;
        for (int i=0;i<str.length();i++){
            res = (int) (str.charAt(i)-'0')+res*10;
        }
        return res;
    }
}
