public class task38 {
    public static void main(String[] args){
    int [] arr1 = {3, 1, 17, -4, 12};
    int [] arr2 = {5, -12, 5, -9, 15};
    int [] arr3 = {1, 2};
    try {
        elements(arr1);
        elements(arr2);
        elements(arr3);
    }
    catch(Exception e){
        System.out.println(e);
    }

    }
    public static void elements(int [] arr) {
        if (arr.length < 3) {
            throw new ArrayIndexOutOfBoundsException("Масив має складатись хоча б з 3 елементів");
        }

        int thirdEl = arr[2];
        int maxEl = arr[arr.length - 1];

        int sum = maxEl + thirdEl;
        System.out.println(sum);
    }

}


