import java.util.Arrays;

public class Ninth_task {
    public static void main(String[] args) {
        int[] firstArray = {1,2,3};
        int[] secondArray = {1,2,3};

        for (int i=0;i<firstArray.length;i++) {
            int sumFirst = firstArray[i];
            for (int j=0;j<secondArray.length;j++){
                int sumSecond = secondArray[j];
                System.out.println((sumFirst+sumSecond));
            }
        }
    }
}

//    int sumFirst = firstArray[i];
//            for (int j=0;j<secondArray.length;j++){
//        int sumSecond = secondArray[j];
//
//        System.out.println((sumFirst+sumSecond));


//
//        for (int i:thirdArray){
//            System.out.println(Arrays.stream(secondArray[i]).sum(secondArray[j]));











//    NINTH TASK
//    Napravite program koji ce izracunati total kada se svaki element iz jednog niza
//    sabere sa svakim elementom iz drugog niza.npr:[1,2,3]
//    [1,2,3] Total sabiranja: 36