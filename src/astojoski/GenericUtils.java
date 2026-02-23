package astojoski;

/**
 * Offers generic methods to work with Arrays
 * @author Aleksa Stojoski
 * @version 2026-02-23
 */

public class GenericUtils {

    /**
     * Reverses the Array that was given to it in the parameter
     * @param array The to be reversed array
     * @param <T>   Type of data that is stored in the array
     */
    public static <T> void reverse(T[] array){
        for(int i = 0; i < array.length/2; i++){
            T temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    /**
     * Returns the sum of all numeric values inside a Numbers array
     * @param array The array from which you want to calculate the sum
     * @return  Returns the sum of all Numbers inside the array as a double
     * @param <T>   The type of object that the array is made up of, has to be from a class that inherits from Number
     */
    public static <T extends Number> double sum(T[] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != null){
                sum += array[i].doubleValue();
            }
        }
        return sum;
    }

    /**
     * Returns all the contents of the given array in String notation
     * @param array The array from which the contents are to be read out of
     * @return      The contents of the given array as a String
     * @param <T>   Type of data that is stored in the array
     */
    public static <T> String arrayToString(T[] array){
        String str = "";
        for(int i = 0; i < array.length; i++){
            str += array[i] + "; ";
        }
        str = str.substring(0, (str.length() - 2));
        return str;
    }
}