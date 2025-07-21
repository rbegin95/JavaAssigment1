public class CheckerPattern {
    public static void main(String[] args) {
        // loop controller how many line
        for (int row = 0; row < 8; row++){
            if (row % 2 == 0){
                // Even Rows
                System.out.println("* * * * * * * *"); 
            } else {
                // Odd Rows
                System.out.println(" * * * * * * * *");
                }
            }

        }
    }
