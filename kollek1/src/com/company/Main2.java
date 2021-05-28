package com.company;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        //HashSet не может содеражать дубликатыб
        // уникальность определяется хэшкодом объекта
        HashSet<Integer> set = new HashSet<>();
        set.add(12);
        set.add(45);
        for (Integer e : set) {
            System.out.println(e);
        }
        set.add(45);
        System.out.println(set);
        // если значение объектов классов оберток над примитивными типами совпадают, то и их хэшкоды будут совпадать
        Float f1 = 12.5f;
        Float f2 = 12.5f;
        System.out.println(f1.hashCode());
        System.out.println(f2.hashCode());

        HashSet<User> users = new HashSet<>();
        users.add(new User(1));
        users.add(new User(10));
        users.add(new User(4));
        users.add(new User(1));

        System.out.println(users);

        //HasMap = key +value
        //key - должен быть постоянным
        //value - может дублироваться
        HashMap<String, User> usersEmails = new HashMap<>();
        // put добавляет в коллекцию новый ключ + значение
        usersEmails.put("vasya@mail.com",new User(2));
        usersEmails.put("petya@mail.com",new User(5));
        System.out.println(usersEmails);
        // при добавлении ключа, который уже есть в коллекции, вместо добавления, произойдет замена
        // старого значения на новое по этому ключу
        usersEmails.put("petya@mail.com",new User(4));
        System.out.println(usersEmails);
        // keySet  возвращает списсок ключей (объект Set
        Set keys = usersEmails.keySet();
        System.out.println(keys);

        //values -возвращает список значений
         Collection values = usersEmails.values();
         LinkedList<User> userList= new LinkedList<>(values);

         User u  = usersEmails.get("petya@mail.com");
         System.out.println(u);

         User u2 = usersEmails.getOrDefault("test",new User(123));

    }
}
