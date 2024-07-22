//Pattern Question
//Approach
//1st step  : run outer for loop equal to the  no of rows (no of lines)
//2nd step : identify for every row :
// a.how many cols are there
//b.types of element in the col
//3rd step : what do you need to print
public class Main {
    public static void main(String[] args) {
       pattern1(4);


    }
    static void pattern1(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1; j<= i;j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        //result :
        // *
        //* *
        //* * *
        //* * * *


    }
}