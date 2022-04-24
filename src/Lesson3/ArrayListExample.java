package Lesson3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        // Все инициализации коллекций идут по типу интерфейса.
        // тоесть когда мы инициализируем ArrayList мы всегда ставим тип List.
       // List<String> strings = new ArrayList<>();
       // List<String> stringLinkedList = new LinkedList<>(); // когда мы инициализируем LinkedList мы всегда ставим тип List.
        // <В треугольных скрбках увказывается тип коллекции>
        // Метода коллекции
        List<String> stringList = new ArrayList<>();
        stringList.add("Vadim"); //Метод add добавляет элементы
        stringList.add("Anton"); // Метод add добавляет элементы
        stringList.add("Egor"); // Метод add добавляет элементы
        stringList.add("Danil");// Метод add добавляет элементы
        System.out.println(stringList);
       stringList.remove("Egor");// Удалять элементы
        System.out.println(stringList);
        /*List<Integer> IntegerList = new ArrayList<>();
        IntegerList.add(1);
        IntegerList.add(5);
        IntegerList.add(2);
        IntegerList.add(3);
        IntegerList.add(4);
        IntegerList.add(1);
        System.out.println(IntegerList);*/
        //IntegerList.remove(1);// В данном случае удалится цифра 5.

        // Как удалить цифру 1?
        //IntegerList.remove(Integer.valueOf(1));// В этом случае удалится цифра 1.

        //Что бы удалит все 1 из списка , надо !
        /* for (Integer integer : IntegerList) {//В данном случае нельзя удалить все 1 из списка .
            if (integer.equals(Integer.valueOf(1))){
                IntegerList.remove(integer);
              }
            }*/
        /*IntegerList.removeIf(integer -> integer.equals(Integer.valueOf(1)));// Этим способом можно удалить все 1 из списка.
        System.out.println(IntegerList);*/

        List<Integer> IntegerList = new LinkedList<>();//Если мы поменяем реализацию ArrayList на LinkedList , то изменятся методы
        IntegerList.add(1);
        IntegerList.add(5);
        IntegerList.add(2);
        IntegerList.add(3);
        IntegerList.add(4);
        IntegerList.add(1);
        System.out.println(IntegerList);
         IntegerList.add(1);//В данном случае 1 добавится в конец списка.
        System.out.println(IntegerList);
        IntegerList.add(1,1);//В данном случае 1 подвинет 5 и станет на позицию 2.
        System.out.println(IntegerList);
        // ЗАПОМНИТЬ !!! Элементы в LinkedList хранятся в виде двухсвязанного списка

        // Методы  List
        stringList.size();// Размер коллекции , типе length у массива

        String s = stringList.get(2);// Метод get показывает какой элемент находится под индексом.

        System.out.println("IntegerList.contains(3) = "+IntegerList.contains(3));//Метод contains проверяет есть ли в массиве 3 или нет, если да то true.

        if (!stringList.isEmpty()){//Метод на проверку пустая ли колеция , если так stringList.isEmpty() то пустая если !stringList.isEmpty() то не пустая.
            System.out.println("коллекция не пустая");
        }
         int DanilIndex = stringList.indexOf("Danil");//Метод indexOf выводит в консоль индекс элемента .
        System.out.println("DanilIndex = " + DanilIndex);

        stringList.set(2, "Daniil");//Метод set меняет элементы по индексу : был Danil - Daniil
        System.out.println(stringList);







    }




}





