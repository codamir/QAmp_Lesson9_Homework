import java.util.Arrays;
import java.util.Scanner;

public class Seventh_task {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("What is the size of the first array: ");
        int[] firstArray = new int[reader.nextInt()];

        System.out.println("What is the size of the second array: ");
        int[] secondArray = new int[reader.nextInt()];

        if (secondArray.length<firstArray.length){
            System.out.println("Second array must be larger than first array. Please try again.");

        }

        System.out.println("Now please type the numbers for the first array: ");

        int counterOne= 0;

        for (int i=0;i<firstArray.length;i++){

            System.out.println("Enter " + (++counterOne) + "."+" number:");
            firstArray[i]= reader.nextInt();
        }

        System.out.println("Now please type the numbers for the second array: ");

        int counterTwo= 0;

        for (int i=0;i<secondArray.length;i++){

            System.out.println("Enter " + (++counterTwo) + "."+" number:");
            secondArray[i]= reader.nextInt();
        }

        int[] newSumArray = new int[secondArray.length-1];

        for (int i=0;i<newSumArray.length;i++){
            newSumArray[i]=firstArray[i]+secondArray[i];

            System.out.print(newSumArray[i]+",");

        }
    }
}


//    NApravite program koji ce sabrati dva niza zajedno, ukoliko je jedan niz veci od drugog
//    taj broj se samo prepise .
//    Npr: {1,3,5,6} , {1,1,1,1,1,1,1}Output: 2,4,6,7,1,1,1/