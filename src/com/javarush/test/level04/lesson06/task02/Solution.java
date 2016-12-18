package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String d1=reader.readLine();
        int a=Integer.parseInt(a1);
        int b=Integer.parseInt(b1);
        int c=Integer.parseInt(c1);
        int d= Integer.parseInt(d1);
        int s=max(a,b);
        int r=max(c,d);

        int k=max(s,r);
        System.out.println(k);


    }

    public static int max(int a,int b){
        int max;
        if (a>b) max=a;
        else max=b;
        return max;
    }
}
