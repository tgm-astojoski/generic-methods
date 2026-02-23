package astojoski;

/**
 * Tests the GenericUtils class
 * @author Aleksa Stojoski
 * @version 2026-02-23
 */
public class Test {
    public static void main(String[] args) {
        //creates an Integer array with some numbers and 2 null objects
        Integer[] arrayInt = new Integer[] {1, 2, 3, 4, 5, null, null};
        //Prints the contents of the array
        System.out.println(GenericUtils.arrayToString(arrayInt)) ;
        //Reverses the contents of the array
        GenericUtils.reverse(arrayInt);
        //Prints the contents of the array which are now reversed
        System.out.println(GenericUtils.arrayToString(arrayInt)) ;
        //Prints the sum of the array
        System.out.println(GenericUtils.sum(arrayInt));
    }
}