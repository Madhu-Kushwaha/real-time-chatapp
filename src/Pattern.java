public class Pattern {

    static void main() {


//       for(int i=1;i<=4; i++) {
//           for(int j=1; j<=4; j++){
//               System.out.print(" * ");
//           }
//           System.out.println();
//       }

        int n =5;

        for( int row =1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}


//Pattern Concept
//Note:
//Outer loop for row
//inner loop for column