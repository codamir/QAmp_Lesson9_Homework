import javax.naming.NamingEnumeration;
import java.util.Scanner;

public class Second_task {
    public static void main(String[] args) {

        System.out.println("Please enter numbers (integers):");
        Scanner reader = new Scanner(System.in);

        int[] newArray = new int[15];
        int counter = 0;

        for (int i = 0; i<15; i++){
            System.out.println("Enter " + (++counter) + "." + " number:");
            newArray[i] = reader.nextInt();
        }

        String[] newArrayString = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eight", "Ninth", "Tenth", "Eleventh",
                "Twelfth", "Thirteenth", "Fourteenth", "Fifteenth"};

        for(int j=0;j<15;j++){
            System.out.println(newArrayString[j] + " number in array: " + newArray[j]);
        }

    }
}




//    SECOND TASK
//    Napravite program koji moze za niz od 10 brojeva da ispise:
//    First number in array: 123
//    Second number in array: 23
//    Third number in array: 3
//    i da se ovakav ispis moze koristiti do 15 elementa u nizu.