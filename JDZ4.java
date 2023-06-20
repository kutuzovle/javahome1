public class JDZ4 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int N = -1;
        moveElement(array, N);
    }


    public static void moveElement(int[] array, int n){
        if(n > array.length){
            n = n % array.length;
        }
        if(n>0){
            for (int i = 0; i < n; i++) {
                int temp = array[array.length-1];
                for (int j = array.length-1; j > 0; j--) {
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
                
    }
} 

