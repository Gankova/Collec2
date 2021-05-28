package com.company;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// коллекции
        // ArrayList - обычный массив
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12); // add - добавляет элемент в конец
        list.add(-15);
        list.add(0);
        list.add(1,45);
        System.out.println(list);
        System.out.println(list.get(2));
        list.remove(1);
        System.out.println(list);
        Integer i = -15;
        list.remove(i);
        System.out.println(list);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(2);
        list2.add(3);
        System.out.println(list);

        //removeAll удалит из list все пересечения из list 2
        list.removeAll(list2);
        System.out.println(list);
        // list.clear - удаляет все элементы из коллекции
        list.addAll(0,list2);
        System.out.println(list);
        list.toArray();
        list.ensureCapacity(40);// предвыделение памяти
        System.out.println(list.size()); // возвращает количество элементов

        //LinkedList хранит элементы в виде двухсвязного списка

        LinkedList<String> llist = new LinkedList<>();
        llist.add("hello");
        llist.add("world");
        llist.add(1," ");
        System.out.println(llist);
        llist.remove();//всегда удаляет первый элемент
        benchInsert();
        benchAppend();

        //Stack = LIFO (Last In - First Out)
        //Queue = FIFO (First in -First out)

        Stack<Float> stack = new Stack<>();

        stack.push(12.35f);
        stack.push(2.f);
        stack.push(55.3f);
        stack.push(-67.8f);
        float p = stack.pop(); //достаем первый элемент steak
        System.out.println(p);
        System.out.println(stack);

        p = stack.peek();// возвращает последний элемент steak  без удаления
        System.out.println(p);
        System.out.println(stack);



    }
    public static void benchInsert () {
        ArrayList<Integer> listA = new ArrayList<>();
        LinkedList<Integer> listB = new LinkedList<>();
        //добавление в начало
        long t = System.currentTimeMillis();// возвращает время, когда запущен
        listA.ensureCapacity(100000);
        for (int j = 0; j < 100000; j++) {
            listA.add(0, j);
        }
        long dtA = System.currentTimeMillis() - t;

        t = System.currentTimeMillis();
        for (int j = 0; j < 100000; j++) {
            listB.add(0, j);
        }
        long dtB = System.currentTimeMillis() - t;
        String result = String.format("Добавление в начало\nArrayList: %dms, LinkedList: %dms", dtA, dtB);
        System.out.println(result);
    }
    public static void benchAppend () {
        ArrayList<Integer> listA = new ArrayList<>();
        LinkedList<Integer> listB = new LinkedList<>();
        //добавление в начало
        long t = System.currentTimeMillis();// возвращает время, когда запущен
        //listA.ensureCapacity(100000);
        for (int j = 0; j < 100000; j++) {
            listA.add(j);
        }
        long dtA = System.currentTimeMillis() - t;

        t = System.currentTimeMillis();
        for (int j = 0; j < 100000; j++) {
            listB.add(j);
        }
        long dtB = System.currentTimeMillis() - t;
        String result = String.format("Добавление в конец\nArrayList: %dms, LinkedList: %dms", dtA, dtB);
        System.out.println(result);
    }
}
