public class Ninth_task {
    public static void main(String[] args) {
        int[] firstArray = {1,2,3};
        int[] secondArray = {1,2,3};
        int[] sumArray = new int[firstArray.length];

        int sumFirst = 0;
        int sumSecond =0;

        for (int i=0;i<firstArray.length;i++) {
            sumArray[i] = firstArray[i] + sumFirst;
            for (int j=0;j < secondArray.length;j++){
                sumArray[j] = secondArray[j] + sumSecond;
                int sum = sumArray[i]+sumArray[j];
                System.out.println(sum);
            }
        }
    }
}

//    NINTH TASK
//    Napravite program koji ce izracunati total kada se svaki element iz jednog niza
//    sabere sa svakim elementom iz drugog niza.npr:[1,2,3]
//    [1,2,3] Total sabiranja: 36