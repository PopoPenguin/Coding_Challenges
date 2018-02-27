package coding_challenge.strings_arrays;

public class PopQuiz1 {

    public static void main(String[] args) {

        int[] array = new int[10];
        int temp = 0;
        System.out.println("Trying to take in arguments into int[]array");
        // take in arguments and convert to integer array
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
            System.out.print(array[i] + " ");
        }

        if (args.length == 0) {
            System.out.println("No Array given");

            System.out.println("Populating array if non given");
            //populate array with whatever; printing out array to confirm
            for (int i = 0; i < array.length; i++) {
                array[i] = i;
                System.out.print(array[i] + " " );
            }

            //reverse order
            for (int i = 0; i < array.length / 2; i++) {
                temp = array[array.length - 1 - i];
                array[array.length - 1 - i] = array[i];
                array[i] = temp;

            }
            System.out.println();

            //printing out array to confirm
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " " );

            }
        } else {
            //reverse order
            for (int i = 0; i < array.length / 2; i++) {
                temp = array[array.length - 1 - i];
                array[array.length - 1 - i] = array[i];
                array[i] = temp;

            }
            System.out.println();

            //printing out array to confirm
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " " );

            }

            System.out.println();

//        This block of code is used for Strings instead of integers

//        for(int i=0;i<args.length/2;i++){
//            String temp="";
//            temp =args[args.length-1-i];
//            args[args.length-1-i]=args[i];
//            args[i]=temp;
//
//        }


        }


    }
}