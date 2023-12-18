package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex02 {
    public static void main(String[] args) {
        String[] words1 = {"aaa", "aaa", "bb", "ccc", "ccc", "abcd"};
        Arrays.stream(words1)
                .distinct() // 중간연산
                .filter(s -> s.length() >= 3) // 중간연산
               .forEach(System.out::println); // 최종연산

        /*
        List<String> words2 = Arrays.asList("aaa", "aaa", "bb", "ccc", "ccc", "abcd");
        Stream<String> stm = words2.stream();
        stm.distinct()
                .filter(s->s.length() >= 3)
                .forEach(System.out::println);

        */
        /*
        스트림은 재사용 못한다는것을 뜻하는 코드
        stm.distinct()
                .filter(s->s.length() >= 3)
                .forEach(System.out::println);
        */
        //System.out.println(words2);
        

    }
}
