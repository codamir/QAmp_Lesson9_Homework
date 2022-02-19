public class Ninth_task {
    public static void main(String[] args) {
        int[] firstArray = {1,2,3};
        int[] secondArray = {1,2,3};

        int sum=0;

        for(int i=0;i<firstArray.length;i++){
            for(int j=0;j<secondArray.length;j++){
                sum = firstArray[i] + secondArray[j]+sum;
            }
        }
        System.out.println("Total sum of two arrays: "+sum);
    }
}

//    NINTH TASK
//    Napravite program koji ce izracunati total kada se svaki element iz jednog niza
//    sabere sa svakim elementom iz drugog niza.npr:[1,2,3]
//    [1,2,3] Total sabiranja: 36

