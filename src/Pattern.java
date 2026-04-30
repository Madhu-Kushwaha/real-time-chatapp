import java.sql.SQLOutput;

public class Pattern {

    static void main() {

        //pattern 1
//       for(int i=1;i<=4; i++) {
//           for(int j=1; j<=4; j++){
//               System.out.print(" * ");
//           }
//           System.out.println();
//       }
        //pattern 2
//        int n =5;
//
//        for( int row =1; row<=n; row++){
//            for(int col=1; col<=row; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //pattern 3
//        int n =5;
//
//        for( int row =1; row<=n; row++){
//            for(int col=1; col <= n-row; col++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        //pattern 4
//        int n =5;
//
//        for( int row =1; row<=n; row++){
//
//            //spaces
//            for(int col=1; col<=n-row; col++){
//                System.out.print(" ");
//            }
//
//            //stars
//            for(int col=1; col<=n; col++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        //pattern 5
//        int n =5;
//
//        for( int row =1; row<=n; row++){
//
//            //spaces
//            for(int col=1; col<=n-row; col++){
//                System.out.print(" ");
//            }
//
//            //stars
//            for(int col=1; col<=2*row-1; col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //pattern 6

////        int n = 4;
//
//        for(int row =1; row<=n ; row++){
//            //spaces
//            if(row == 1){
//                continue;
//            }
//            for(int col=1;col<=row-1; col++){
//                System.out.print(" ");
//            }
//            for(int col=1;col<=2*n-2*row+1; col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//pattern 9

//        int  n=4;
//        for(int row =1; row<=n ; row++){
//            //spaces
//           for(int col =1;col<=6;col++){
//               if(row==1 || row==n){
//                   System.out.print("* ");
//               }else{
//                   if(col ==1 || col == 4){
//                       System.out.print("*");
//                   }
//                   else {
//                       System.out.print(" ");
//                   }
//               }
//           }
//            System.out.println(" ");
//        }
        //pattern 10
//        int  n=4;
//        for(int row =1; row<=n ; row++){
//            //spaces
//          if(row==1 || row ==2 || row ==n){
//              for(int col=1; col<=row; col++){
//                  System.out.print("*");
//              }
//          }
//          else {
//              System.out.println("*");
//              for(int col=1; col<=(row-2);col++){
//                  System.out.print("");
//              }
//              System.out.print("* ");
//          }
//            System.out.println();
//        }


        //pattern 11
//        int n =4;
//
//   for( int row =1; row<=n; row++){
//
//            //spaces
//            for(int col=1; col<=n-row; col++){
//                System.out.print("  ");
//            }
//
//            //stars
//                if(row==1){
//                    for(int col=1;col<=2*row-1;col++) {
//                        System.out.print("* ");
//                    }
//               }
//                else {
//                    System.out.print("* ");
//                    for(int col=1; col<=2*row-3;col++){
//                        System.out.print("  ");
//                    }
//                    System.out.print("* ");
//                }
//            System.out.println();
//            }
//
//         //part 2
//
//        for(int row=1; row<=(n-1);row++) {
//
//            for (int col = 1; col <=row; col++) {
//                System.out.print("  ");
//            }
//
//            if(row==(n-1)){
//                System.out.print("* ");
//            }
//            else{
//                //1*
//                System.out.print("* ");
//                for(int col=1;col<=2*(n-row)-3;col++){
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//
//        }

        //pattern12
//        int n = 5;
//        for (int row = 1; row <= n; row++) {
//            for(int col = 1; col <= row; col++){
//                System.out.print(col+ " ");
//            }
//            System.out.println();
//        }
///  Not understood pattern
//        int n = 5;
//        for(int row =1; row<=n ; row++){
//           for(int col=1; col<=row;col++){
//               int a = col;
//               int b = ('A' - 1);
//               int ans = a+b;
//               char finalAns = (char)ans;
//               System.out.print(finalAns + " ");
//           }
//            System.out.println();
//        }


// pattern 13
//        int n = 5;
//        for(int row =1; row<=n ; row++){
//           for(int col=1; col<=row;col++){
//               int a = n-col;
//               int b = 'A';
//               int ans = a+b;
//               char finalAns = (char)ans;
//               System.out.print(finalAns + " ");
//           }
//            System.out.println();
//        }

        //pattern14
        int n = 4;
        for (int row = 1; row <= n; row++) {
            //part1

            for (int col =1; col <= n-row; col++) {
                System.out.print(" ");
            }

            //part 2

            for (int col = 1; col <= 2*row - 1; col++) {
                System.out.print(row+ " ");
            }
            System.out.println(" ");
        }
        //pattern 15
    }
}


//Pattern Concept
//Note:
//Outer loop for row
//inner loop for column