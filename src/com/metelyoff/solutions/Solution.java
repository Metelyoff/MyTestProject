package com.metelyoff.solutions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких:
половину чисел в первый маленький,
вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, 
каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
		int[] bigArray=new int[20];
		int[] littleArray1= new int[10];
		int[] littleArray2= new int[10];
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<bigArray.length;i++)
			bigArray[i]=Integer.parseInt(reader.readLine());
			
		for(int i=0;i<littleArray1.length;i++)
			littleArray1[i]=bigArray[i];
		
		for(int i=9;i<bigArray.length;i++){
			int j=0;
			System.out.println(littleArray2[j]=bigArray[i]);
			j+=1;
		}
    }
}