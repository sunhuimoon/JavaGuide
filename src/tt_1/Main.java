package tt_1;
/*
public class Temperature {
    double[] temperatures = new double[365];

    public static int coldest(double[] temperatures) {
        double minTem=0;
        int day=0;
        for(int i=0; i<365; i++) {
            if (temperatures[i]< minTem) {
                minTem= temperatures[i];
                day=i;
            }
        }
        return (int)minTem;
    }

    public static void main(String[] args) {

        Temperature t=new Temperature();
        System.out.println();


    }
}
*/


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private final static int NUM = 5;             //设置12天
    public static void main(String[] args) {
        double[] temperatures = new double[5];   //定义数组
        int i;
        Scanner input = new Scanner(System.in); //创建 Scanner 对象
        for (i = 0 ; i < 5  ;i++) {
            System.out.println("input temp " + i);

            temperatures[i]= input.nextDouble();
        }                                       //循环输入

        System.out.println(Arrays.toString(temperatures));    //输出 之前输入的 看看  可以不看
        int[] data = coldest(temperatures);                    //把 输入的温度 当作参数输入函数
        //结果存在数组里，为了一次返回2个值
        System.out.println("The Lowest day of The Year is: " + data[0] + ", there are " + data[1] +" day(s) which have the same temperature."
        );              //输出结果
    }

    private static int[] coldest(double[] temperatures) {
        int i;
        double LowestTemp = 0;                 //设置比较最低值
        int day = 0 ;                            //第几天
        int num = 0;                             //有几天

        for(i = 0 ; i < NUM ; i++) {
            if (temperatures[i] < LowestTemp) {      //新值比原来最低值低
                LowestTemp = temperatures[i] ;       //就更换最低值
                num = 1;                            //“有几天”重置为1
                day = i + 1;                        //”第几天“为循环次数加1 （从0 开始）
            }
            else if(temperatures[i] == LowestTemp) {  //新值和原来最低值一样
                num ++;                              //”有几天“加1
            }
        }
        int[] data = {day , num };                    //吧结果赋值到数组

        System.out.println(Arrays.toString(data));   //输出结果看看 可以不看
        return data;
    }

}
