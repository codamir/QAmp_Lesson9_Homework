import java.util.Scanner;

public class Third_task {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter the size of an Array: ");
        int[] newArray = new int[reader.nextInt()];

        int counter = 0;

        for (int i=0;i<newArray.length;i++){
            System.out.println("Please type in the " + (++counter)+"." + "number:");
            newArray[i]= reader.nextInt();
        }

        int newArrayLength = (newArray.length);

        System.out.println("Your entered numbers in reversed would look like this: ");
        for (int j=newArrayLength-1;j>=0;j--){
            System.out.print(newArray[j] + " ");
        }

    }
}

//    THIRD TASK
//    Napravite program koji ce obrnuti redosljed niza odnosno:
//    1 2 3 4 5 6 7   postaje 7 6 5 4 3 2 1
//    i da moze primiti bilo koji niz i obrnuti ga.