import java.util.Scanner;

public class bonusTask {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the first number of your array:");
        int firstNumber = reader.nextInt();

        System.out.println("Enter the last number of your array:");
        int lastNumber = reader.nextInt();

        int[] arrayNumbers = new int[lastNumber];

        for (int i=firstNumber;i< arrayNumbers.length;i++){
            if ((i%3==0) && (i%5==0)){
                System.out.println("FizzBuzz");
            }else if (i%5==0){
                System.out.println("Buzz");
            }else if (i%3==0){
                System.out.println("Fizz");
            }else System.out.println(i);
        }

        System.out.println("Numbers which are not listed above are: ");

        for (int i=firstNumber;i<arrayNumbers.length;i++){
            if ((i%5==0) && (i%3==0)){
                System.out.println("Number " + i + " - FizzBuzzed");
            }else if (i%5==0){
                System.out.println("Number " + i+ " - Buzzed");
            }else if (i%3==0){
                System.out.println("Number " +i+ " - Fizzed");
            }
        }
    }
}


//    Napravite program koji ce svaki   iterirati brojeve jedan po jedan i zatim
//    provjeriti da li je broj djeljiv sa 3 ako da umjesto tog broja ce ispisati
//        fizz, ako je broj djeljiv sa 5 ispisat ce buzz, ako je broj djeljiv sa
//        3 i 5 ispisat ce fizzbuzz, a ako nije nista od navedenog samo ce biti ispisan.
//        Takodje treba napraviti niz koji sadrzi sve brojeve koji nisu prikazani vec su  fizz, buzz ili fizzbuzzirani :smile:
//        Dakle ispis treba izgledati ovako:
//        1
//        2
//        Fizz
//        4
//        Buzz
//        Fizz
//        7
//        8
//        Fizz
//        Buzz
//        11
//        Fizz
//        13
//        14
//        FizzBuzz
//        16
//        17
//        Fizz
//        19
//        Buzz
//        sve do nekog broja X koji smo mi predefinirali.