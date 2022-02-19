import java.util.Scanner;

public class Eighth_task {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String[] words = new String[5];

        System.out.println("Please type some random five words.");
        int counter = 0;

        for (int i=0;i<words.length;i++) {
            System.out.println("Type " + (++counter) + "." + " word:");
            words[i] = reader.nextLine().toLowerCase();
        }

        System.out.print("Words that contained vowels have been deleted. The word(s) without vowel: ");

        for (int i = 0; i < words.length; i++) {
            if (!(words[i].contains("a") || words[i].contains("e") || words[i].contains("i") || words[i].contains("o")
                    || words[i].contains("u"))) {
                System.out.print(words[i]+ ", ");
            }
        }
    }
}



////    EIGHTH TASK
//      Napravite program koji niz stringova filtrira i izbacuje iz niza bilo
////    koji string koji sadrzi neki od samoglasnika: a e i o u
////    (Obratite paznju da radi i za velika i mala slova)