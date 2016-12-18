package com.javarush.test.level04.lesson04.task07;

/* Количество дней в году
Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
"количество дней в году: x", где х - 366 для високосными года, х - 365 для обычного года.
Подсказка: В високосном году - 366 дней, тогда как в обычном  - 365.
Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
Годы 1600 и 2000 — високосные, так как они кратны 100 и кратны 400.
Годы 2100, 2200 и 2300 — невисокосные.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String sYear = buffer.readLine();
        int year = Integer.parseInt(sYear);
        int x=366;
        int y=365;
        if (year%100 == 0)
            {
                if (year%4 == 0 && year%400 ==0 )
                System.out.println("количество дней в году: "+x);
                else
                 System.out.println("количество дней в году: "+y);
            }
        else if (year%4 == 0) System.out.println("количество дней в году: "+x);
        else System.out.println("количество дней в году: "+y);

    }
}