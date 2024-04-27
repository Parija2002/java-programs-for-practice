public class quicksort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[high]; //here take arr[high] not pivot as it gives wrong output
        arr[high] = temp;

        return i; // pivot index
    }

    public static void quick(int arr[], int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);

            quick(arr, low, pidx - 1);
            quick(arr, pidx + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 4, 3, 7, 2, 9};
        int n = arr.length;

        System.err.println("Given Array Is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Print new line after printing the given array

        quick(arr, 0, n - 1);

        System.out.println("Sorted Array Is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Print new line after printing the sorted array
    }
}
