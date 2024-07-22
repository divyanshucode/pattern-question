public class pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }
    //result
//            *
//            * *
//            * * *
//            * * * *
//            * * * * *
//            * * *
//            * *
//            *
    static void pattern5(int n){
        for(int row =0 ;row < 2*n-1; row++){
            int colPerRow = row > n ?  2*n-row-1 : row;
            //logic so as we reach n we want to decrease col by 1
            //row 8 there are only 1 star
            //colPerRow = 2*5-8-1 = 10-8-1 = 1
            for (int col = 0; col<colPerRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
