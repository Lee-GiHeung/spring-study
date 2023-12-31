package exam02;

import exam01.Apple;

public class Box<T extends Fruit> {
    private T item;

    //private static T items;
    //private T[] item3 = new T[];

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void printItem() {
        // T -> Object, 객체를 만드는 시점 -> 투입된 타입으로 형변환 발생
        // T -> Fruit, 객체를 만드는 시점 -> 투입된 타입으로 형변환
        item.print();
    }

    public <T> void testMethod(T t) { // 지네릭 메서드 - 메서드가 호출될 때 타입이 결정
        
    }
}
