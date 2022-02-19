import java.util.Scanner;

public class First_task {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the size of an array:");
        int[] newArray = new int[reader.nextInt()];

        int counter = 0;

        for (int i=0;i<newArray.length;i++){
            System.out.println("Please insert " + (++counter)+"." + " number:");
            newArray[i]=reader.nextInt();
            }

        int counterTwo = 0;

        for (int j=0;j<newArray.length;j++){
            System.out.println("Entered " + (++counterTwo) + "." + " number is: " + newArray[j]);
            if ((newArray[j]>10) && (newArray[j]%2==0)){
                System.out.println("The entered number is greater than 10, and even number.");
            }else if (newArray[j]==10){
                System.out.println("The entered number is number 10, and it is even number.");
            }else if ((newArray[j]<10) && (newArray[j]%2==0)){
                System.out.println("The entered number is lower than 10, and even number.");
            }else if ((newArray[j]>10) && (newArray[j]%2!=0)){
                System.out.println("The entered number is greater than 10, and odd number.");
            }else System.out.println("The entered number is lower than 10, and odd number.");

            System.out.println("------------------------------------");
        }

    }

}


//    FIRST TASK
//    Napravite program kojem mozete pri pokretanju reci koliki niz zelite
//    zatim da popunite niz sa int brojevima
//    Na ispisu svih brojeva kod mora ispisati redosljed(ne index) u nizu,
//    da li je paran ili ne kao i da li je veci od 10.