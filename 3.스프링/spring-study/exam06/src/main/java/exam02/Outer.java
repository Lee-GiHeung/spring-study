package exam02;

public class Outer {
    Calculator method(int num3) {
        return new Calculator() { // 익명 내부 클래스
            public int add(int num1, int num2) {
                // int num3
                // 지역변수로서 스택에서 할당 -> 임시 메모리 제거
                // 지역 내부에서 정의된 클래스의 메서드에서 사용중? -> 제거
                // 상수화(final) -> 데이터 영역 메모리 생성(제거x)
                return num1 + num2 + num3;
            }
        };
    }

    /*
    void method() {
        class Inner {
            void innerMethod() {
                System.out.println("지역 내부 클래스!");
            }
        }

        Inner in = new Inner();
        in.innerMethod();

    }
    */
}
