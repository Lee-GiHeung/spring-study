package exam01;
        
import java.util.Optional;

public class Ex05 {
    public static void main(String[] args) {
        String str = null;
        // Optional<String> opt = Optional.of(str); // 값이 null이면 예외발생
        Optional<String> opt = Optional.ofNullable(str);
        // String str2 = opt.get(); // 값이 없으면 예외 발생
        // String str2 = opt.orElse("기본값");
        /*
        String str2 = opt.orElse(null);
        if(str2 == null) {
            throw new RuntimeException("값이 없음 예외가 발생");
        }
        */
        // String str2 = opt.orElseThrow(); // NoSuchElementException 발생
        String str2 = opt.orElseThrow(() -> new RuntimeException("값이 없음, 예외 발생"));
        System.out.println(str2);
        
    }
}