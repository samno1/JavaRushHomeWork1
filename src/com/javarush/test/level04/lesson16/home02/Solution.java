package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String string1= reader.readLine();
        String string2=reader.readLine();
        String string3=reader.readLine();
        int m=Integer.parseInt(string1);
        int n=Integer.parseInt(string2);
        int o=Integer.parseInt(string3);

        int a=Math.max(m,n);
        int max=Math.max(a,o);

        int b=Math.min(m,n);
        int min=Math.min(b,o);
        int middle=0;
        if (m!=max && m !=min)middle=m;
        else if (n!=max && n !=min)middle=n;
        else if (o!=max && o !=min)middle=o;

        System.out.println(middle);



    }
}
