import java.util.Scanner;

public class Fourth_task_part_two {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a word to check if it's a palindrome");

        String word = reader.nextLine();
        String wordLowerCase = word.toLowerCase();
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--)
            reversedWord = reversedWord + wordLowerCase.charAt(i);

        if (wordLowerCase.equals(reversedWord))
            System.out.println("The word you have entered is a palindrome :)");
        else
            System.out.println("The word you have entered isn't a palindrome :(");

    }
}



//    FOURTH TASK
//    Napravite program koji provjerava da li je rijec palindrom
