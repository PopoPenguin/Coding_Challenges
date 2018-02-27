package coding_challenge.strings_arrays;

/*
created by PopoPenguin on 10/18/17

Given an array of ints, return true if the array contains two 7's next to each other,
or there are two 7's separated by one element, such as with {7, 1, 7}.

has77([1, 7, 7]) → true
has77([1, 7, 1, 7]) → true
has77([1, 7, 1, 1, 7]) → false
*/


public class Has77 {

    public static void main(String[] args) {
        int [] has77 = {1,1,1,7,7,1};

        Has77 one = new Has77();

        boolean isNext = one.isNextTo(has77);

        System.out.println(isNext);

    }


    public boolean isNextTo(int[] a) {
        //iterate through array a
        for (int i = 0; i < a.length -1; i++) {
                //check to see if a[i] equals 7
                //if it does equal 7 check to see if i+1 is 7 or if i+2 is 7
                //returns true if either condition is true
                if ((a[i] == 7 && a[i + 1] == 7) || (a[i] == 7 && a[i + 2] == 7)) {
                    return true;
                }
        }
        //return false by default
        return false;

    }


}
