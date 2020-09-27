package com.company;

public class Main {
    public static void main(String args[]) {
        List list = new List();
        list.add(new Node("Дикун", 89));
        list.add(new Node("Адамович", 44));
        list.add(new Node("Алексеев", 51));
        list.add(new Node("Алексеев", 24));
        list.add(new Node("Автилова", 0));
        list.add(new Node("Бабич", 243));
        list.add(new Node("Кузьмич", 24));
        list.add(new Node("Курбацкий", 2424));
        list.add(new Node("Притыцкий", 432415));
        list.add(new Node("Палазник", 89148291));
        list.add(new Node("Янович", 898989));
        list.add(new Node("Бабичева", 5110901));
        list.add(new Node("Миранович", 829345));
        list.add(new Node("Кузьмич",7675367));
        list.add(new Node("Кузьмич",121212));
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.getCurrent().getName());
            list.setCurrent(list.getCurrent().getNext());
        }
        System.out.println();

        searchName(list,55);
        searchNumber(list,"Кузьмич");

    }
    public static void searchNumber(List list, String name){
        list.reset();
        while(list.getCurrent() != null && !name.contentEquals(list.getCurrent().getName()))
            list.setCurrent(list.getCurrent().getNext());
        if(list.getCurrent() == null)
            System.out.println("Абонент отсутствует");
        else{
            while(list.getCurrent() != null && list.getCurrent().getName().contentEquals(name)){
                System.out.println(name + " " +  list.getCurrent().getNumber());
                list.setCurrent(list.getCurrent().getNext());
            }
        }
    }

    public static void  searchName(List list, int number) {
        list.reset();
        while (list.getCurrent() != null && number != list.getCurrent().getNumber())
            list.setCurrent(list.getCurrent().getNext());

        if (list.getCurrent() == null)
            System.out.println("Номер отсутствует");
        else System.out.println(list.getCurrent().getName() + " " + number);
    }
}
