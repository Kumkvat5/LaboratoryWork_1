import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Methods {

    /*   19) Створіть метод, який перевертає будь яке слово. Наприклад, на вході «травень» на
    виході «ьневарт».*/

    public String reverse(String word) {
        char[] chs = word.toCharArray();

        int i = 0, j = chs.length - 1;
        while (i < j) {
            char t = chs[i];
            chs[i] = chs[j];
            chs[j] = t;
            i++;
            j--;
        }
        return String.valueOf(chs);
    }
    /*   4)  Створіть метод, який дозволяє видаляти будь який елемент по індексу в одновимірному масиві int[].
     Новий масив повинен повертатися з методу.*/
    public int[] remove(int[] array, int index){
        if(index>array.length||index<0){
            return array;
        }
        int[] result = new int[array.length-1];
        for (int i=0; i<index;++i){
            result[i]=array[i];
        }
        for (int i=index+1;i<array.length;++i){
            result[i-1]=array[i];
        }
        return result;
    }
    /*  29) Створіть метод, який приймає будь-яку кількість масивів int[] та повертає найменше
     число яке є у складі цих масивів.*/
    public int arrayMethod(int arr1[]){
        int min=arr1[0];
        for (int i=0;i!=arr1.length;i++){
            if (arr1[i]<min){
                min=arr1[i];
            }
        }
        return min;
    }
    public int arrayMethod1(int[]... arr){
        int min1=arrayMethod(arr[0]);
        for (int i=0;i<arr.length;i++){
            if (min1>arrayMethod(arr[i])){
                min1=arrayMethod1(arr[i]);
            }
        }
        System.out.println(min1);
        return min1;
    }
    /*  9)  Створіть метод, який приймає параметр типу String та шукає у його складі паліндроми (рядки букв, які однаково
    читаються у любому напрямку - приклад  йцууцй). Метод повинен повертати паліндром, який має найбільшу довжину серед
    знайдених, якщо не знайдено жодного, повертає пустий рядок "". Приклад при параметрі "qwertyolo" результат буде "olo".*/


    public void palindrome(String src){
        List<String> palindromeList = new ArrayList<>();

        for (int charIdx = 0; charIdx < src.length(); charIdx++) {

            int start = charIdx - 1;
            int end = charIdx + 1;

            while (end < src.length() && src.charAt(charIdx) == src.charAt(end)) {
                end++;
            }
            charIdx = end - 1;

            while (start >= 0 && end < src.length()) {
                if (src.charAt(start) == src.charAt(end)) {
                    start--;
                    end++;
                } else {
                    break;
                }
            }

            if (end - start >= 4) {
                palindromeList.add(src.substring(start + 1, end));
            }
        }

        String test = " ";
        for (String palindrome : palindromeList) {

            if (palindrome.length() > test.length()) {
                test = palindrome;
            }
        }
        System.out.println(test);
    }

    /*Створіть метод, який приймає параметр String у форматі "11.01.21" та повертає кількість
     діб з початку року до цієї дати. Ви повинні врахувати, що у лютому може бути різна кількість дат.
     */
    public int datesMethod(String str){
        String[]  strArr=str.split("\\.");
        int[][] month={{1,31},{2,28},{3,31},{4,30},{5,31},{6,30},{7,31},{8,31},{9,30},{10,31},{11,30},{12,31}};
        int day=Integer.valueOf(strArr[0]);
        int numMonth=Integer.valueOf(strArr[1]);
        int accam=0;
        for(int[] temp:month){
            if(temp[0]<numMonth){
                accam=accam+temp[1];
            }
        }
        Integer strInt=new Integer(str);
        SimpleDateFormat date=new SimpleDateFormat();


        return strInt;
    }



}