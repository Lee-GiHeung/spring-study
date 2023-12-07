package exam;

public class Ex01 {
    public static void main(String[] args) {
        // 생성자 함수(메소드) - 객체를 생성하는 역할 (메모리에 필요한 자원을 위한 공간 할당)
        // C() -> super() : B() -> super() : A()
        C c = new C();
        A a = c;
        B b = c;

    }
}