import java.util.Scanner;

public class Seventh_task {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("What is the size of the first array: ");
        int[] shorterArray = new int[reader.nextInt()];

        System.out.println("What is the size of the second array: ");
        int[] longerArray = new int[reader.nextInt()];

        if (longerArray.length<shorterArray.length){
            System.out.println("Second array must be larger than first array. Please try again.");
        }

        System.out.println("Now please type the numbers for the shorter array: ");

        int counterOne= 0;

        for (int i=0;i<shorterArray.length;i++){
            System.out.println("Enter " + (++counterOne) + "."+" number:");
            shorterArray[i]= reader.nextInt();
        }

        System.out.println("Now please type the numbers for the longer array: ");

        int counterTwo= 0;

        for (int i=0;i<longerArray.length;i++){
            System.out.println("Enter " + (++counterTwo) + "."+" number:");
            longerArray[i]= reader.nextInt();
        }

        for (int i=0;i<shorterArray.length;i++){
            longerArray[i]=shorterArray[i]+ longerArray[i];
        }

        for (int i=0;i<longerArray.length;i++){
            System.out.print(longerArray[i] + " ");
        }
    }
}


//    Napravite program koji ce sabrati dva niza zajedno, ukoliko je jedan niz veci od drugog
//    taj broj se samo prepise .
//    Npr: {1,3,5,6} , {1,1,1,1,1,1,1}Output: 2,4,6,7,1,1,1/