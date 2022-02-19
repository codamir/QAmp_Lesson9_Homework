import java.util.Scanner;

public class Sixth_task {
    public static void main(String[] args) {

        System.out.println("Please type the size of the first array:");

        Scanner reader = new Scanner(System.in);
        int[] firstArray = new int[reader.nextInt()];

        int counter = 0;

        System.out.println("Now, please type the numbers.");

        for (int i=0;i< firstArray.length;i++){
            System.out.println("Type your "+(++counter)+"."+"number:");
            firstArray[i]= reader.nextInt();
        }

        System.out.println("Please type the size of the second array:");
        int[] secondArray = new int[reader.nextInt()];

        int counterTwo = 0;

        System.out.println("Now, please type the numbers for the second array.");

        for (int i=0;i< secondArray.length;i++){
            System.out.println("Type your "+(++counterTwo)+"."+"number:");
            secondArray[i]= reader.nextInt();
        }

        int[] newMergedArray = new int[firstArray.length + secondArray.length];
        int position = 0;

        for( int i = 0; i < firstArray.length; i++) {
            newMergedArray[position] = firstArray[i];
            position++;
        }

        for( int j = 0; j < secondArray.length; j++) {
            newMergedArray[position] = secondArray[j];
            position++;
        }

        System.out.println("When put together your two arrays formed a new array that look like this: ");

        for (int i:newMergedArray){
            System.out.print(" "+i+" ");

        }

    }
}


//    SIXTH TASK
//    Napravite program koji ce objediniti dva niza u jedan veliki niz.