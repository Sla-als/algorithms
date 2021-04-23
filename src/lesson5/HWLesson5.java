package lesson5;

import lesson2.MyArrayList;

import java.util.*;

public class HWLesson5 {
    public static int exponentiation(int num, int degree) {
        //1. Написать программу по возведению числа в степень с помощью рекурсии.
        if (degree >= 0) {
            //базовый случай
            if (degree == 0) {
                return 1;
            } else {
                //рекурентный случай
                return exponentiation(num, degree - 1) * num;
            }
        }
        return -1;
    }

    //2. Написать программу «Задача о рюкзаке» с помощью рекурсии.
    //Пример задачи о рюкзаке:
    // необходимо уложить коробки в ранец вместимостью 15 кг так,
    // чтобы стоимость уложенных коробок была максимальной
             //из заданного множества предметов со свойствами «стоимость» и «вес»,
             //требуется отобрать некое число предметов таким образом,
             //чтобы получить максимальную суммарную стоимость при одновременном соблюдении
             //ограничения на суммарный вес.


    public static void main(String[] args) {
//        System.out.println(exponentiation(2, 5));
//        System.out.println(exponentiation(1, 5));
//        System.out.println(exponentiation(5, 5));
//        System.out.println(exponentiation(2, 0));
//        System.out.println(exponentiation(2, -1));




        Pack pack = new Pack(15);

        ItemPack itemPack01 = new ItemPack(10,8);
        ItemPack itemPack02 = new ItemPack(12,2);
        ItemPack itemPack03 = new ItemPack(8,3);
        ItemPack itemPack04 = new ItemPack(6,7);
        ItemPack itemPack05 = new ItemPack(5,6);
        ItemPack itemPack06 = new ItemPack(5,7);

        ArrayList<ItemPack>itemPackArrayList = new ArrayList<>();
        itemPackArrayList.add(itemPack01);
        itemPackArrayList.add(itemPack02);
        itemPackArrayList.add(itemPack03);
        itemPackArrayList.add(itemPack04);
        itemPackArrayList.add(itemPack05);
        itemPackArrayList.add(itemPack06);

        pack.put(itemPackArrayList);



    }
}

