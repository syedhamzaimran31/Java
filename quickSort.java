public class quickSort {
    //In quickSort Worst Case occurs when pivot is taken as smallest or larget element
    public static int partition(int arr[], int low, int high){

        int pivot = arr[high];
        int i=low-1;

        for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
                //swapping for smaller values from pivot
                int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
            }
        }
        //swapping for greater values from pivot
        i++;
            int temp=arr[i];                    
            arr[i]=arr[high];
            arr[high]=temp;
            return i;           //pivot index
    }

    public static void quickSorting(int arr[], int low, int high){
        if(low < high){

            int pivotIndex=partition(arr, low, high);
            quickSorting(arr, low, pivotIndex-1);
            quickSorting(arr, pivotIndex+1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr={6,3,5,9,2,8};
        int n=arr.length;
        quickSorting(arr, 0, n-1);

        //printing Array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
