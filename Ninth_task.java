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





//        for (int i=0;i<firstArray.length;i++) {
//            int sumFirst = firstArray[i];
//            for (int j=0;j<secondArray.length;j++){
//                int sumSecond = secondArray[j];
//                sumArray[i]=sumFirst+sumSecond;
//                System.out.println(i);


//                System.out.println((sumFirst+sumSecond));


//    int[] a = {0, 1, 2};
//    int[] b = {3, 4, 5};
//    int[] c = new int[a.length];
//for (int i = 0; i < a.length; ++i) {
//        c[i] = a[i] + b[i];
//        }

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