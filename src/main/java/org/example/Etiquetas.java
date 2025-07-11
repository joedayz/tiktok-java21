package org.example;

public class Etiquetas {


    private static int[] searchForValues(int[][] list, int v) {
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list[i].length; j++){
                if(list[i][j] == v){
                    return new int[]{i, j};
                }
            }

        }
        return null;
    }

    public static void main(String[] args) {
        int[][] list = { {1, 13}, {5, 2}, {2, 2}};
        int searchValue = 9;
        int[] results = searchForValues(list, searchValue);

        if(results == null){
            System.out.println("Value "+ searchValue+
                    " not found");
        }else{
            System.out.println("Value " + searchValue +
                    " found at: " +
                    "(" + results[0] + "," + results[1] + ")");
        }
    }

}
