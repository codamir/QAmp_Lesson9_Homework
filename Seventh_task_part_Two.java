import java.util.Scanner;

public class Seventh_task_part_Two {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("What is the size of the first array: ");
        int[] shorterArray = new int[reader.nextInt()];

        System.out.println("What is the size of the second array: ");
        int[] longerArray = new int[reader.nextInt()];

        System.out.println("Now please type the numbers for the first array: ");

        int counterOne= 0;

        for (int i=0;i<shorterArray.length;i++){
            System.out.println("Enter " + (++counterOne) + "."+" number:");
            shorterArray[i]= reader.nextInt();
        }

        System.out.println("Now please type the numbers for the second array: ");

        int counterTwo= 0;

        for (int i=0;i<longerArray.length;i++){
            System.out.println("Enter " + (++counterTwo) + "."+" number:");
            longerArray[i]= reader.nextInt();
        }

        shorterArray=shorterArray;
        longerArray=longerArray;

        if ((shorterArray.length>longerArray.length)){
            int[] temp = new int[longerArray.length];
            temp = longerArray;

            longerArray=shorterArray;
            shorterArray=temp;
        }

        for (int i=0;i<shorterArray.length;i++){
            longerArray[i]=shorterArray[i]+ longerArray[i];
        }

        for (int i=0;i<longerArray.length;i++){
            System.out.print(longerArray[i] + " ");
        }
    }
}

