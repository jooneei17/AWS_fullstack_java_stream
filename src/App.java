import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.sound.midi.Soundbank;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("hello World");

        // String[] strArr = { "aaa", "bbb", "ccc" };
        // List<String> list = Arrays.asList(strArr);
        // list.forEach(System.out::println);

        // System.out.println("===================");
        // Arrays.sort(strArr);
        // for (String s : strArr) {
        // System.out.println(s);
        // }

        // System.out.println("===================");
        // // List
        // Collections.sort(list);
        // for (String s : list) {
        // System.out.println(s);
        // }

        // Stream<String> stream1 = list.stream();
        // Stream<String> stream2 = Arrays.stream(strArr);

        // System.out.println("===================");
        // stream1.sorted().forEach(System.out::println);

        // System.out.println("===================");
        // Iterator<String> iter = list.iterator();
        // System.out.println(iter.next());
        // System.out.println(iter.next());
        // System.out.println(iter.next());
        // // System.out.println(iter.next());

        // iter = list.iterator();
        // System.out.println(iter.next());

        // System.out.println("===================");
        // stream1 = list.stream();
        // stream1.sorted().forEach(s -> System.out.println(s));

        // // IntStream intStream = IntStream.rangeClosed(1, 5);

        // System.out.println("===================");
        // IntStream intStream = new Random().ints(10, 1, 10).limit(20);
        // intStream.forEach(i -> System.out.println(i));

        // Stream<String> stream3 = Stream.of("123", "ganada", "12");
        // System.out.println("===================");
        // stream3.forEach(s -> System.out.println(s));

        List<String> list2 = new ArrayList<>();

        list2.add("김길동");
        list2.add("박길동");
        list2.add("박현빈");
        list2.add("홍길동");
        list2.add("김삼순");
        list2.add("김유신");

        // // 1. 성이 김인 사람
        // list2.stream().filter(str -> str.startsWith("김")).forEach(s ->
        // System.out.println(s));

        // // 2. 이름이 길동인 사람
        // list2.stream().filter(new Predicate<String>() {
        // public boolean test(String s) {
        // return s.endsWith("길동");
        // }
        // }).forEach(new Consumer<String>() {
        // public void accept(String s) {
        // System.out.println(s);
        // }
        // });

        File file = new File("C:\\Users\\joonv\\Desktop");

        // 해당 바탕화면 폴더의 디렉토리가 아닌 파일만 골라서 파일의 이름(map) 출력 >> 해당 파일 명의 길이를 출력하는 것으로 변경
        System.out.println(file);
        Arrays.stream(file.listFiles()).filter(f -> f.isFile())
                .map(f -> {
                    Map<String, Object> map = new HashMap<>();
                    map.put("size", f.length());
                    map.put("name", f.getName());
                    map.put("name.length", f.getName().length());
                    return map;
                })
                // .map((f) -> {
                // return f.getName();
                // }).map((s) -> {
                // return s.length();
                // })
                .forEach(f -> System.out.println(f));

    }
}
