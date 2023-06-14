package practice.twoDimensionalArray;

public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ SYMBOL по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        char [][] twoDimensional = new char[size][size];
        for (int i = 0; i < twoDimensional.length; i++) {
            for (int j = 0, x = twoDimensional[i].length - 1; j < twoDimensional[i].length; j++, x--) {
                if (i == j || i == x){
                    twoDimensional[i][j] = SYMBOL;
                }
                else{
                    twoDimensional[i][j] = ' ';
                }
            }

        }
        return twoDimensional;
    }
}
