package Lesson3;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        Set<Integer> IntegerList = new HashSet<>();//Если мы поменяем реализацию ArrayList на LinkedList , то изменятся методы
        IntegerList.add(1);
        IntegerList.add(5);
        IntegerList.add(2);
        IntegerList.add(3);
        IntegerList.add(4);
        IntegerList.add(1);
        System.out.println(IntegerList);
         /*В данном случае в консоль попадет только 1 2 3 4 5 и только в таком порядке
         так как во всех реализациях Set идут только уникальные элементы и толко по порядку так как элементы хранятся не в порядке добавления
         В отличии от List.
         */
        Set<String> stringList1 = new HashSet<>();
        stringList1.add("Vadim");
        stringList1.add("Anton");
        stringList1.add("Egor");
        stringList1.add("Danil");
        System.out.println(stringList1 ); /*В результате в консоль распечатается [Anton, Vadim, Egor, Danil]
        так как элементы хранятся не в порядке добавления*/
        // Чтобы расспечатать элементы в порядке добавления надо использовать LinkedHashSet !
        System.out.println();
        Set<String> stringList2 = new LinkedHashSet<>();
        stringList2.add("Vadim");
        stringList2.add("Anton");
        stringList2.add("Egor");
        stringList2.add("Danil");
        System.out.println(stringList2);// Результат [Vadim, Anton, Egor, Danil]
        System.out.println();

        Set<String> stringList3 = new TreeSet<>();
        stringList3.add("Vadim");
        stringList3.add("Anton");
        stringList3.add("Egor");
        stringList3.add("Danil");
        System.out.println(stringList3);// Результат [Anton, Danil, Egor, Vadim] элементы отсортированны по алфавиту.
    }
}
