package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        String name=reader.readLine();
        String string1= reader.readLine();
        String string2=reader.readLine();
        String string3=reader.readLine();
        int y=Integer.parseInt(string1);
        int m=Integer.parseInt(string2);
        int d=Integer.parseInt(string3);
        System.out.println("Меня зовут "+name);
        System.out.println("Я родился "+d+"."+m+"."+y);
    }
}
