package coding_challenge.strings_arrays;

/*
    reverse an args [] in place using only 1 extra variable
 */

public class ReverseArgs {
    public static void main(String[] args) {

        String temp;
        for (int i = 0; i <args.length/2; i++){
            temp = args[i];
            args[i]=args[args.length-1-i];
            args[args.length-1-i]=temp;
        }

        for (int i = 0; i<args.length; i++){
            System.out.println(args[i]);
        }

    }

}
