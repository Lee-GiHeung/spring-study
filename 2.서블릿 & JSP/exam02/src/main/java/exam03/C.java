package exam03;

public class C extends B {
    int numC = 30;

    public C() {
        super(); // 상위 클래스의 기본 생성자를 의미. B()
        System.out.println("C 생성자!");

    }

}
