public class bubblesort{

    public static void bubble_sort(int[] a){
        int n = a.length;

        for(int i = 0; i < n - 1; i++){

            boolean flag = false;

            for(int j = 0; j < n - i - 1 ; j++) {    
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            if(flag == false){ 
                return;
            }
        }

    }
    public static void main(String[] args) {

        int[] arr = { 5, 6, 8, 1 , 9};
        bubble_sort(arr);

        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i] + " ");
        }

    }
}