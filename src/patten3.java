public class patten3 {
    public static void main(String[] args) {
        pattern3(5);
    }
    //result
//            * * * * *
//            * * * *
//            * * *
//            * *
//            *
    static void pattern3(int n){
        for(int row = 1 ; row <= n ; row++){
            for(int col = 5;col>=row;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
