package coding_challenge.strings_arrays;

/*
created by PopoPenguin on 11/10/17
*/


/*
- write this method "public int[] resverseArray(int[] t)" - this method needs to reverse an array in place -
you should only need to use one extra variable.

- write this method "public void populateAndPrint2DArray()" - it should populate a 2D array in one nested loop -
then in a second nested loop it should print out each number in the 2D array.

- write this method "public int[][] reverse2DArray(int[][] t)" - this method needs to reverse a 2D array in place,
using only one extra variable.

- considering the following sql tables:
items -> id, name, description, price
users -> id, name
purchases -> id, item_id, user_id
write a join query to return the user name and item name of every item with a value of $10 or more that has been purchased

select u.name as "user name", i.name as "item name"
from users u
join purchases p
    on u.id = p.user_id
join items i
    on p.item_id = i.id
where i.price <= 10;

- considering the same tables, write a query to return the name and quantity sold of the top 5 most purchased items
 select i.name, count (p.item_id) as "quantity_sold"
 from items i
 join purchases p
    on i.id=p.item_id
 group by p.item_id
 order by quantity_sold desc
 limit 5


 */
public class ChallengeTest {

    public static void main(String[] args) {
        int [] x = {1,3,4,5,6};
        int[][] y = new int[4][5];
        System.out.println("first challenge");
        System.out.println("before reverse");
        for (int i=0; i<x.length; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
        System.out.println("after reverse");
        reverseArray(x);
        for (int i=0; i<x.length; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println("\n\n");

        System.out.println("second challenge");
        populate2DArray(y);
        printOut2DArray(y);

        System.out.println("\n\n");
        System.out.println("third challenge");
        reverse2DArray(y);
        printOut2DArray(y);





    }

    public static int[] reverseArray(int[]t){
        int temp;
        for (int i = 0; i < t.length/2 ; i++){
            temp= t[i];
            t[i]=t[t.length-1-i];
            t[t.length-1-i]=temp;
        }
        return t;
    }

    public static int[][] populate2DArray(int[][]y){
        int filler=0;

        for (int i=0;i<y.length; i++){
            for (int j=0; j<y[i].length;j++){
                y[i][j]= filler;
                filler++;
            }
        }
        return y;
    }

    public static void printOut2DArray(int[][] t){
        for (int [] i: t){
            for(int j:i){
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }

    public static int[][] reverse2DArray(int[][] t){
        int temp;
        //int [0][0] - int [5][5]
        //int [0][1] - int [5][4]
        //int [0][2] - int [5][3]

        for (int i=0; i<t.length/2;i++){
            for(int j=0; j<t[i].length;j++){
                temp=t[i][j];
                t[i][j]=t[t.length-1-i][t[i].length-1-j];
                t[t.length-1-i][t[i].length-1-j]=temp;
            }
        }
        return t;
    }
}
