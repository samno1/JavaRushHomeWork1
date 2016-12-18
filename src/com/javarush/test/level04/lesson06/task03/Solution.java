package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1=reader.readLine();
        String b1=reader.readLine();
        String c1=reader.readLine();

        int a=Integer.parseInt(a1);
        int b=Integer.parseInt(b1);
        int c=Integer.parseInt(c1);

        int o=max(a,b);
        int p=max(o,c);

        int g=min(a,b);
        int f=min(g,c);

        int middle =0;

        if(a != f && a != p) middle = a;
        if(b != f && b != p) middle = b;
        if(c != f && c != p) middle = c;

        System.out.println(p+ " " + middle + " " + f);
    }

    public static int max(int a,int b){
        int max;
        if (a<b)
          max=b;
        else  max=a;
        return max;
    }
    public static int min(int a,int b){
        int min;
        if (a<b) min=a;
        else min=b;
        return min;
    }
}
