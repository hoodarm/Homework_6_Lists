package com.company;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> list = new List<> (new Integer[5]);

        for (int i = 1; !list.isFull () && i < 100; i += 2)
            list.addFirst (i);
        System.out.println (list);

        list.removeLast ();
        list.removeLast ();
        System.out.println (list);

        list.addLast (99);
        System.out.println(list);
        list.add (1, -33);
        System.out.println (list);

        while (!list.isEmpty ())
            System.out.print (list.removeFirst () + " ");


        System.out.println();
        System.out.println();

        alternativeImplementation();
    }

    static void alternativeImplementation()
    {
        List<Integer> list = new List<> (new Integer[5]);

        for (int i = 1; !list.isFull () && i < 100; i += 2)
            list.addFirst (i);
        System.out.println (list);

        list.remove (list.size-1);
        list.remove (list.size-1);
        System.out.println (list);

        list.add (list.size,99);
        System.out.println(list);
        list.add (1, -33);
        System.out.println (list);

        while (!list.isEmpty ())
            System.out.print (list.remove (0) + " ");
    }
}