package runnoob;

public class Box<T> {
    private T t;

    private void add(T t) {
        this.t = t;
    }

    private T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();
        Box<Character> charBox = new Box<>();
//        Box<char []> charArray = new Box<>();

        integerBox.add(10);
        stringBox.add("菜鸟教程");
        charBox.add('e');
//        charArray.add(new char[]{'H', 'E', 'L', 'L', 'O'});

        System.out.printf("整型值为 :%d\n", integerBox.get());
        System.out.printf("字符串为 :%s\n", stringBox.get());
        System.out.printf("字符为 ：%c\n", charBox.get());
        //错误的System.out.println("字符为 ：%s", charBox.get());
//        System.out.printf("%s", charArray.get());
    }
}
