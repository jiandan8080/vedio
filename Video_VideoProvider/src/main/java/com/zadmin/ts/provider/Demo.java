package com.zadmin.ts.provider;

/**
 * @BelongsProject: vedio
 * @BelongsPackage: com.zadmin.ts.provider
 * @Author: ZAdmin
 * @CreateTime: 2019-09-20 21:36
 * @Description: 联系
 */
public class Demo {
    public static void main(String[] args) {

        //Test1(3001);
        //Test2(5);
        //Test3(2,5);
        //Test4(100,1);
        //Test5();
        //Test6(200,0);
        //Test7();
        Test8(5, 8);
    }

    /**
     * 判断某一年是否为闰年（被4整除但不能被100整除或能被400整除）是闰年，否则为平年
     *
     * @param year
     */
    public static void Test1(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "是平年");
        }
    }

    /**
     * 编写一个程序实现如下功能，输入1，2，3，4，5，6，7（分别对应周一到周日）中的数
     *
     * @param day
     */
    public static void Test2(int day) {
        switch (day) {
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            default:
                System.out.println("error");
                break;
        }
    }

    /**
     * 计算两个整数之间所有整数的和。
     *
     * @param num 形式参数
     * @param i   形式参数
     */
    public static void Test3(int num, int i) {
        //如果i值大于num值，；两个值交换
        if (i > num) {
            int tmp = i;
            i = num;
            num = tmp;
        }
        //计数
        int count = 0;
        while (i <= num) {
            count += i;
            i++;
        }
        System.out.println("count =" + count);
    }

    /**
     * 打印出100以内所有的奇数，偶数和3的倍数（不包括100）
     */
    public static void Test4(int i, int num) {
        //如果i值大于num值，；两个值交换
        if (i > num) {
            int tmp = i;
            i = num;
            num = tmp;
        }
        while (i < num) {
            if (i % 2 != 0) {
                System.out.println("奇数：" + i);
            } else if (i % 2 == 0) {
                System.out.println("偶数：" + i);
            }
            if (i % 3 == 0) {
                System.out.println("3的倍数:" + i);
            }
            i++;
        }
    }

    /**
     * java阶乘求和 1! + 2! + 3! +4! + ...+10!
     */
    public static void Test5() {
        int num = 0; //记录总和
        int i = 1;
        do {
            int j = 1;
            int jc = 1;
            while (j <= i) {
                jc *= i;    //记录乘积
                j++;
            }
            num += jc;      //乘积相加
            i++;
        } while (i <= 10);
        System.out.println("1! + 2! + 3! +4! + ...+10! = " + num);
    }

    /**
     * 打印出0-200之间能被7整除但不能被4整除的所有整数
     *
     * @param i   形式参数
     * @param num 形式参数
     */
    public static void Test6(int num, int i) {
        //如果i值大于num值，；两个值交换
        if (i > num) {
            int tmp = i;
            i = num;
            num = tmp;
        }
        for (int j = i; j < num; j++) {
            if (j % 7 == 0 && j % 4 != 0) {
                System.out.println(j);
            }
        }
    }

    /**
     * 输出10个斐波那契数列
     */
    public static void Test7() {
        //第一个数和第二个数的和
        int next = 0;
        int x = 1;
        int y = 1;
        int count = 0;
        for (int i = 1; i < 8; i++) {
            next = x + y;
            System.out.println(next);
            x = y;
            y = next;
        }
        count = x + y;
        System.out.println(count);
    }

    public static void Test8(int num1, int num2) {
        int count = 0;
        //如果num2值大于num1值，；两个值交换
        if (num1 > num2) {
            int tmp = num2;
            num2 = num1;
            num1 = tmp;
        }
        for (int i = num1; i <= num2; i++) {
            count += i;
            if (i < num2 - 1) {
                System.out.print(i + "+");
            } else if (i == num2 - 1) {
                System.out.print(i);
            } else {
                System.out.print("+" + i + "=" + count);
            }

        }

    }
}
