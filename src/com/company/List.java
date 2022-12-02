package com.company;

public class List <T>
{
    public List (T[] array)
    {
        elements = array;
        maxSize = array.length;
        size = 0;
    }

    public boolean isFull ()
    {
        return size >= maxSize;
    }

    public boolean isEmpty ()
    {
        return size <= 0;
    }

    public void addFirst (T element)
    {
        for (int i = size - 1; i >= 0; i--)
            elements [i + 1] = elements [i];
        elements [0] = element;
        size++;
    }

    public void addLast (T element)
    {
        elements [size] = element;
        size++;
    }

    public void add (int index, T element)
    {
        for (int i = size - 1; i >= index; i--)
            elements [i + 1] = elements [i];
        elements [index] = element;
        size++;
    }

    public T removeLast ()
    {
        size--;
        return elements [size];
    }


    public T removeFirst ()
    {
        T returner = elements[0];
        for (int i = 0; i < size-1; i++)
        {
            elements [i] = elements[i+1];
        }
        size--;
        return returner;
    }

    public T remove(int index)
    {
        T returner = elements[index];
        for (int i = index; i < size-1; i++)
        {
            elements [i] = elements[i+1];
        }
        size--;
        return returner;
    }

    public String toString ()
    {
        StringBuffer strBuf = new StringBuffer ();
        for (int i = 0; i < size; i++)
        {
            strBuf.append (elements [i]);
            if (i < size - 1)
                strBuf.append (", ");
        }
        return strBuf.toString ();
    }

    private int maxSize;
    public int size;
    private T[] elements;
}