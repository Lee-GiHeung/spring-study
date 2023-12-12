package exam01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ex06 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        ListIterator<String> it = names.listIterator();
        System.out.println("===========순방향===========");
        while(it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }

        System.out.println("-----------역방향-----------");
        while(it.hasPrevious()) {
            String name = it.previous();
            System.out.println(name);
        }
    }
}