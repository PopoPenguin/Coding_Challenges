package coding_challenge.strings_arrays;


import com.sun.deploy.util.ArrayUtil;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Object;
import java.util.List;

/*
    An array contains 10 numbers. There is exactly one number that is repeated in this array.
    Write a program to find the duplicate number. For example, if an array with length 4 contains numbers
    {0, 3, 2, 3}, then the duplicate number is 3. For this example just change the "3" to "-1". Print out the
    original array, then the duplicate number, then the array after the duplicate is removed.

    Hint: Arrays.sort()

 */
public class RemoveDuplicates {
    public static void main(String [] args){

        Integer [] array = new Integer[] {0,1,2,3,4,5,6,1};

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.addAll(Arrays.asList(array));
        System.out.println("replaceDup method\n");
        replaceDup(array);
        System.out.println("\nremoveDup method\n");
        removeDup(arrayList);

    }

    public static void replaceDup( Integer [] array ){

        //sout original array
        System.out.println("original array");
        for(int x =0; x<array.length; x++){
            System.out.print(array[x] + " ");
        }
        //sout duplicate number
        Arrays.sort(array);
        Integer temp = array[0];
        for (int x = 1; x < array.length; x++) {
            if (temp == array[x]) {
                System.out.println("\n\nduplicate " + array[x]+"\n");
                array[x] = array[0]-1;

            } else {
                temp = array[x];
            }
        }
        //sout array with duplicate replaced
        System.out.println("duplicate replaced");
        Arrays.sort(array);
        for(int x =0; x<array.length; x++){
            System.out.print(array[x] + " ");
        }
        System.out.println("\n.....end of method......");
    }

    public static void removeDup(ArrayList<Integer> array){
        System.out.println("original array");
        for(int x: array){
            System.out.print(x + " ");
        }
        System.out.println("\n\nDuplicate check");
        for (Integer y: array){
            Integer temp = array.get(y);
                if (temp != y) {
                    System.out.println("\nduplicate " + y +"\n");
                } else {
                    temp = array.get(y);
                }
        }
        System.out.println("\narray list without duplicate");
        for (Integer x: array){
            System.out.print(x + " ");
        }
    }
}
