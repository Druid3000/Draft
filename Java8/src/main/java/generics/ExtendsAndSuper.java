package generics;

import java.util.ArrayList;
import java.util.List;

public class ExtendsAndSuper {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        List<? extends Object> list = arrayList;
        System.out.println(list.get(1).getClass().getTypeName());


        ArrayList<Object> arrayList2 = new ArrayList<>();
        arrayList2.add('c');
        List<? super Number> list2 = arrayList2;
        System.out.println(list2.get(0).getClass().getTypeName());
    }

}
