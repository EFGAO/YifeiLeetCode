package sort;

/**
 * Created by GaoYifei on 3/5/17.
 */
public class main {
    public static void main(String[] args){
        int[] testNums = {0,1,4,9,20,10000, 12345, 50,24, 3, -30, -1000};
        test1(testNums);
        test2(testNums);
        test3(testNums);


    }
    private static void test1(int[] nums){
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(nums);
        System.out.println("Bubble Sort");
        for(int num: nums){
            System.out.println(num);
        }


    }
    private static void test2(int[] nums){
        InsertSort insertSort = new InsertSort();
        insertSort.sort(nums);
        System.out.println("Insertion Sort");
        for(int num: nums){
            System.out.println(num);
        }


    }
    private static void test3(int[] nums) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(nums, 0, nums.length - 1);
        System.out.print("Merge Sort");
        for (int num: nums) {
            System.out.print(num);
        }
    }

}
