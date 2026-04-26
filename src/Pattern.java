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

        int n = 4;

        for(int row =1; row<=n ; row++){
            //spaces
            for(int col=1;col<=row-1; col++){
                System.out.print(" ");
            }
            for(int col=1;col<=2*n-2*row+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
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

    }
}


//Pattern Concept
//Note:
//Outer loop for row
//inner loop for column