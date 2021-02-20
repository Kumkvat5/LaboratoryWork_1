import java.util.Arrays;

class Realization {

    public static void main(String[] args) {
        //1
        System.out.println("_______1_______");
        Methods met=new Methods();
        System.out.println(met.reverse("Hell"));
        //2
        System.out.println("_______2_______");
        System.out.println();
        int[] array = { 1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        met.remove(array,2);
        System.out.println("____");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //3
        System.out.println("_______3_______");
        int arr1[]={8,2,3,4,5};
        int arr2[]={22,0,44,55};
        met.arrayMethod1(arr1,arr2);
        //4
        System.out.println("_______4_______");
        met.palindrome("popularity");

        String str1="01.12.2002";
        String[] arrstr=str1.split("\\.");
        System.out.println(Arrays.toString(arrstr));
    }
}