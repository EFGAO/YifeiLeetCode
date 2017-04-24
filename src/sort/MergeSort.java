package sort;

/**
 * Created by GaoYifei on 4/17/17.
 */
public class MergeSort {
    public void sort(int[] nums, int start, int end){
        if(start >= end) return;
        int mid = start + (end - start)/2;
        sort(nums, start, mid);
        sort(nums, mid + 1, end);
        merge(nums, start, mid, end);

    }
    private void merge(int a[], int first, int mid, int last){
        int[] temp = new int[last - first + 1];
        int left = first;
        int right = mid + 1;
        int i = 0;
        while(left <= mid && right <= last){
            if(a[left] < a[right]){
                temp[i++] = a[left++];
            }
            else{
                temp[i++] = a[right++];
            }
        }
        while(left <= mid){
            temp[i++] = a[left++];
        }
        while(right <= last){
            temp[i++] = a[right++];
        }
        i = 0;
        while(first <= last){
            a[first++] = temp[i++];
        }
    }
}
