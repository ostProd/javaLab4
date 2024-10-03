public class task61 {
    public static void main(String[] args){
        int [] arrA = {3, -1,-4};
        int [] arrB = {5,34,-4,-4};
        try {
            createArr(arrA, arrB);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void createArr(int [] arrA, int [] arrB) {
        int n = Math.min(arrA.length, arrB.length);

        int [] arrC = new int[n];

        for (int i = 0; i < n; i++) {
           if (arrA[i] > 0 && arrB[i] > 0) {
                arrC[i] = arrA[i] + arrB[i] ;
           } else if (arrA[i] < 0 && arrB[i] < 0) {
                arrC[i] = arrA[i] * arrB[i];
           } else{
                arrC[i] = 0;
           }
        }
        printArr(arrC);
    }
    public static void printArr(int [] arr) {
        System.out.print("Масив C: ");
        try {
            for (int value : arr) {
                System.out.print(value + " ");
            }
        } catch (IllegalArgumentException er) {
            System.out.println("EXCEPTION! " + er.getMessage());
        }
    }
}



