package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_Example {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        ArrayList<Integer> obj=new ArrayList<>();
//        obj.add(1);
//        obj.add(2);
//        obj.add(3);
//        obj.add(4);
//        System.out.println(obj);
//        System.out.println(obj.size());
//        obj.set(1,334);
//        System.out.println(obj);
//        obj.remove(2);
//        System.out.println(obj);
//        obj.add(1,22);
//        System.out.println(obj);
//        //Input the Arraylist
//        System.out.println("Enter the Element:");
//        for (int i = 0; i < 5; i++) {
//            obj.add(sc.nextInt());
//        }
//        System.out.println(obj);

//    ---------------Practice work------------------
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> list=new ArrayList<>();
    list.add(11);
    list.add(22);
    list.add(33);
    list.add(44);
    System.out.println(list);
    System.out.println(list.size());
    System.out.println("enter the element:");
    for (int i = 0; i < 4; i++) {
        list.add(sc.nextInt());
    }
    System.out.println(list);
    System.out.println(list.remove(2));
    System.out.println(list);
    }
}

