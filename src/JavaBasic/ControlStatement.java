package JavaBasic;

public class ControlStatement {
    public static void main(String[] args) {
        /*
        If Else
         */

//        for( int i=1 ; i<=5 ; i++ ) {
//            if(i == 2) {
//                System.out.println("Under If block" + " " + i);
//            }else {
//                System.out.println("Outside If block" + " " + i);
//            }
//        }


        /*
        Switch
        The Java switch statement is fall-through.
        It means it executes all statements after the first match if a break statement is not present.
         */

//        for( int i=1 ; i<=5 ; i++ ) {
//            switch(i){
//                case 1: System.out.println("10");
//                    break;
//                case 2: System.out.println("20");
//                    break;
//                case 3: System.out.println("30");
//                    break;
//                default:System.out.println("Not in 10, 20 or 30");
//            }
//        }

//        String levelString="Expert";
//        int level=0;
//        switch(levelString){
//            case "Beginner": level=1;
//                break;
//            case "Intermediate": level=2;
//                break;
//            case "Expert": level=3;
//                break;
//            default: level=0;
//                break;
//        }
//        System.out.println("Your Level is: "+level);

        /*
        If else if Statement
        if an if or else if condition is true and its block is executed, the rest of the else if or else blocks are skipped.


         */

//        int marks=65;
//        if(marks<50){
//            System.out.println("fail");
//        }
//        else if(marks>=50 && marks<60){
//            System.out.println("D grade");
//        }
//        else if(marks>=60 && marks<70){
//            System.out.println("C grade");
//        }
//        else if(marks>=70 && marks<80){
//            System.out.println("B grade");
//        }
//        else if(marks>=80 && marks<90){
//            System.out.println("A grade");
//        }else if(marks>=90 && marks<100){
//            System.out.println("A+ grade");
//        }else{
//            System.out.println("Invalid!");
//        }

//        int sum = 4;
//        if(sum%2 == 0) {
//            System.out.println("Sum is even number");
//        }else if(sum + 6 == 10) {
//            System.out.println("Sum == 4");
//        }else {
//            System.out.println("In Else block");
//        }



        /*
        Java Break Statement -
        When a break statement is encountered inside a loop,
        the loop is immediately terminated and the program control resumes at the next statement following the loop.

        */

//        for( int i = 1 ; i <= 4 ; i++ ) {
//            if(i == 2) {
//                System.out.println("Break as i = " + i);
//                break;
//            }
//        }

//        for( int i = 1 ; i <= 4 ; i++ ) {
//            for( int j = 1 ; j <= 4 ; j++) {
//                if(j == i) {
//                    System.out.println("Break because J = " + j + " and i = " + i);
//                    break;
//                }
//                System.out.println(j);
//            }
//        }

        /*
        Java Continue Statement
        The continue statement is used in loop control structure when
        you need to jump to the next iteration of the loop immediately. It can be used with for loop or while loop.

        The Java continue statement is used to continue the loop.
        It continues the current flow of the program and skips the remaining code at the specified condition.
        In case of an inner loop, it continues the inner loop only.
         */

//        for( int i = 1 ; i <= 4 ; i++ ) {
//            if(i == 2) {
//                continue;
//            }
//            System.out.println("Outside Continue statement , i = " + i);
//        }

        for( int i = 1 ; i <= 4 ; i++ ) {
            if(i == 3) {
                continue;
            }

            for( int j = 1 ; j <= 4 ; j++) {
                if(j == 2) {
                    continue;
                }
                System.out.println("Under nested loop with i = " + i + " and j = " + j);
            }
        }



    }
}
