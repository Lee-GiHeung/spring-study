package exam03;

import exam02.Fruit;

public class Ex01 {
    public static void main(String[] args) {
        FruitBox<Fruit> appleBox = new FruitBox<>();
        Fruit pear = new Pear();
        appleBox.add(new Apple()); // Apple, Fruit, Object
        appleBox.add(new Apple());
        appleBox.add(pear);

        Juicer.make(appleBox);

        FruitBox<Object> pearBox = new FruitBox<>();
        pearBox.add(new Pear());
        pearBox.add(new Pear());

        Juicer.make(pearBox);
    }
}
