package practice.reverseArray;

import java.util.Arrays;
import java.util.Collection;

public class ReverseArray {

    public static String[] reverse(String[] strings) {
        for (int i = 0; i < strings.length / 2 ; i++){
            String two = strings[i];
            strings[i] = strings[strings.length - i - 1];
            strings[strings.length - i - 1 ] = two;
        }
        //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
        return strings;
    }

}