package runnoob;

import java.util.*;

public class GenericTest {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        List<Number> number = new ArrayList<>();

        name.add("hhh");
        name.add("www");
//        age.add(18);
//        number.add(314);

        getData(name);
//        getData(age);
//        getData(number);

    }

    private static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }
}
