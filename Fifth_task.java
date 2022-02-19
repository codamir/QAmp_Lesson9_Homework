import java.util.Scanner;

public class Fifth_task {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter lower number in range: ");
        int lowerNumber = reader.nextInt();

        System.out.println("Please enter larger number in range: ");
        int largerNumber = reader.nextInt();

        int range = largerNumber-lowerNumber;

        int[] numberArray = new int[range];
        int arrayFiller = lowerNumber;

        System.out.println("Even numbers for range: " + lowerNumber + " to " + largerNumber + " are: ");

        for (int i=0;i<numberArray.length;i++){
            numberArray[i]=++arrayFiller;
            if (numberArray[i]%2==0 && numberArray[i]>lowerNumber && numberArray[i]<largerNumber){
                System.out.println(numberArray[i]);
            }
        }
    }
}

//    FIFTH TASK
//    Napravite program  kojem cemo reci opseg za koji ce morat ispisati
//    sve parne brojeve u koje ne ulaze brojevi kojima postavljamo opseg
//    npr
//        Please enter lower number in range:
//        10
//        Please enter larger number in range:
//        16
//        System-Out: Even numbers for range: 10 to 16 are:
//        12,14