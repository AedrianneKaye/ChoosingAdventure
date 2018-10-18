/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package choosingyourownadventure;
import java.util.Scanner;

/**
 *
 * @author aemal4075
 */
public class ChoosingYourOwnAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in); 
        
        String answer1, answer2, answer3, answer4; 
        
        System.out.println("Lets factor out quadratic expressions!");
        System.out.println("Just enter your answers to the questions!");
        System.out.println("Your answers must be Yes,yes,No and no");
        System.out.println("So lets start!");
        System.out.println(" x² + 8x + 9 = -7 "); 
        
        System.out.println("Can the -7 be moved to the left?");
        answer1 = keyedInput.nextLine(); 
        switch (answer1){
            case"Yes": case "yes": 
            System.out.println("So if you -7 moved the left you got x² + 8x + 9 + 7 = 0 ");
            answer1 = keyedInput.nextLine();
            System.out.println("You need to add the same variables.");
            answer1 = keyedInput.nextLine();
            System.out.println("Now you've got x² + 8x + 16 = 0 "); 
            answer1 = keyedInput.nextLine();
            break;
            case "No": case "no":
            System.out.println("You need to move -7 to the let so that we can continue");
            break;
        }
        
        System.out.println("Is it a factor of (x + 4)² = 0 ? ");
        answer2 = keyedInput.nextLine();
        switch (answer2){
            case "Yes": case"yes": 
            System.out.println("Now you've got (x + 4)(x + 4) = 0 ");
            answer2 = keyedInput.nextLine();
            break; 
            case "No": case"no":
            System.out.println("Oops! think again dear (x + 4)² = 0 is the factor. ");
            break; 
        }
        
        System.out.println("Now that you've got its factor you need to find it's zero.");
        answer3 = keyedInput.nextLine();
        System.out.println("Do you need to move 4 to right to find its zero?");
        answer3 = keyedInput.nextLine();
        switch (answer3){
            case "Yes": case"yes":
            System.out.println("Yup you need to move it to the right and you are right!");
            answer3 = keyedInput.nextLine();
            break; 
            case "No": case"no":
            System.out.println("Ehh! Dear come to think it again because you're wrong.");
            break; 
        }
        
        System.out.println("Did you get x= -4 and x = -4 ?");
        answer4 = keyedInput.nextLine();
        switch (answer4){
           case "Yes": case"yes":
           System.out.println("Great!Now you know how to factor!");
           case "No": case"no":
           System.out.println("Try it again to see on what step did you do wrong.");
           break; 
        }
        // TODO code application logic here
    }
    
}
