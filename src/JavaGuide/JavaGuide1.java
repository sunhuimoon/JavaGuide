package JavaGuide;

import java.util.Scanner;

public class JavaGuide1 {
    public static void main(String[] args){
        System.out.println("开始");
//        从键盘接收数据
        Scanner input = new Scanner(System.in);
        System.out.println("输入，nextLine方式接收：");
        // nextLine 字符串接受
        String s  = input.nextLine();
//        input.close() 是关闭文件
//        input.close();
        System.out.println(s);
    }
}