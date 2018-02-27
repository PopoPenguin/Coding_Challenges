package coding_challenge.strings_arrays;

/*
created by PopoPenguin on 10/18/17
*/


//given this method signature:
//public boolean compareArrays(int[] a, int[] b){...}

// complete the method so that it will return true if both a[] and b[]
// share the same first element and last element in common

public class CompareArray {

    static int [] a = {1,2,3,4,5,6,7,8,9};
    static int [] b = {2,3,4,5,6,7,8,9};
    static int [] c = {1,9};

    public boolean compareArrays(int[] a, int [] b){

        //if this
        //compare first element of a and b
                if (a[0]==b[0]){
                    //continue with next test
                    //compare last element of a and b
                    if(a[a.length-1]==b[b.length-1]) {
                        //return true
                        return true;
                    }
                }

        //otherwise return false


        return false;
    }

    public static void main(String[] args) {
        CompareArray test = new CompareArray();


        boolean isTrue = test.compareArrays(a,c);
        System.out.println(isTrue);
    }
}
