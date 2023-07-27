public class MergeSort {
    public static void divide(int si, int li, int arr[]) {
        if (si >= li) {
            return;
        }
        int mid = si + (li - si) / 2;
        divide(si, mid, arr);
        divide(mid + 1, li, arr);
        conquer(si, li, arr, mid);
    }

    public static void conquer(int si, int li, int arr[], int mid) {

        int merge[] = new int[li - si + 1];
        int idx = si;
        int idx2 = mid + 1;
        int x = 0;
        
        while (idx <= mid && idx2 <= li) {
            if (arr[idx] <= arr[idx2]) {
                merge[x++] = arr[idx++];
            } else {
                merge[x++] = arr[idx2++];
            }
        }

        while (idx <= mid) {
            merge[x++] = arr[idx++];
        }

        while (idx2 <= li) {
            merge[x++] = arr[idx2++];

        }
        // for (int i = 0, j=si; i < merge.length; i++,j++) {
        //     arr[j]=merge[i];
        // }
        
        System.arraycopy(merge, 0, arr, si, merge.length);

      
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n=arr.length;
        divide(0, n-1, arr);
        for (int i = 0; i < n; i++) {
           System.out.print(arr[i] + " "); 
        }
        }
    }

