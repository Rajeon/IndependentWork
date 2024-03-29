package chapter4;

import java.util.Scanner;

/*
LOOP BREAK
Search a String to determine if it can contain the Letter 'A'
 */
public class LetterSearch {
    public static void main(String[] args) {

//        Get Text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

//        Search text for letter A
        for(int i=0; !letterFound && i<text.length(); i++){
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }

        if (letterFound){
            System.out.println("This text contain the letter 'A'");
        }
        else{
            System.out.println("This text does not contain the letter 'A'");
        }
    }
}
