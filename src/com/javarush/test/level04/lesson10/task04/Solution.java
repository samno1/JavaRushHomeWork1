package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        //String S=reader.readLine();
        String s="S";
        int i=0;
        while (i<10){
            int j=1;
            while (j<10){
                System.out.print(s);
                j++;
            }
            System.out.println(s);
            i++;
        }
    }
}
