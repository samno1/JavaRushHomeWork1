package com.javarush.test.level04.lesson04.task08;

/* Треугольник
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String a1=reader.readLine();
        String b1=reader.readLine();
        String c1=reader.readLine();

        int a=Integer.parseInt(a1);
        int b=Integer.parseInt(b1);
        int c=Integer.parseInt(c1);

        int t1=a+b;
        int t2=b+c;
        int t3=a+c;
        if ((t1>c)&&(t2>a)&&(t3>b))
            System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");

    }
}