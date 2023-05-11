package com.zhuravel;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        //GCDTest();
        linkedListTest();
    }

    private static void GCDTest() {
        System.out.println("GCD test");
        System.out.println("GCD of 60 and 96 is " + GCDFinder.findGCD(60, 96) + ", should be 12");
        System.out.println("GCD of 20 and 8 is " + GCDFinder.findGCD(20, 8) + ", should be 4");
    }

    private static void linkedListTest() {
        LinkedList list = new LinkedList();
        list.insert(38);
        list.insert(49);
        list.insert(13);
        list.insert(15);
        list.dump_list();

        System.out.println("Item count: " + list.getCount());
        System.out.println("Find item 13: " + list.find(13));
        System.out.println("Find item 78: " + list.find(78));

        list.deleteAt(2);
        System.out.println("Item count: " + list.getCount());
        System.out.println("Find item 49: " + list.find(49));

        list.dump_list();
    }
}
