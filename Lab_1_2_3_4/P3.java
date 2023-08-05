package DS_practice;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            char cc = sc.next().charAt(0);
            if(checker(cc)){
                System.out.println("vowel");
            }else{
                System.out.println("consonant");
            }
        }

    }   
    
    public static boolean checker(char c){
        
        char converted = Character.toLowerCase(c);
        return converted == 'a' || converted == 'e' || converted == 'i' || converted == 'o' || converted == 'u' ;
    }

}

// import java.util.Scanner;

// public class P3 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a character: ");
//         char character = scanner.next().charAt(0);

//         if (isVowel(character)) {
//             System.out.printf("The character '%c' is a vowel.%n", character);
//         } else {
//             System.out.printf("The character '%c' is not a vowel.%n", character);
//         }
//     }

//     public static boolean isVowel(char character) {
//         char lowercaseChar = Character.toLowerCase(character);
//         return lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 'i' || lowercaseChar == 'o' || lowercaseChar == 'u';
//     }
// }
