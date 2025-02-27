public class ProblemC {
    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        else{
            int[] leftHalf = new int[arr.length / 2];
            for(int n = 0; n < leftHalf.length; n++){
                leftHalf[n] = arr[n];
            }

            int[] rightHalf = new int[arr.length - arr.length / 2];
            for(int n = 0; n < rightHalf.length; n++){
                rightHalf[n] = arr[n];
            }
            mergeSort(leftHalf);
            mergeSort(rightHalf);
            return merge(leftHalf, rightHalf);
        }
    }

    private static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length){
            if (left[i] <= right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }
        while(i < left.length){
            merged[k++] = left[i++];
        }
        while(j < right.length){
            merged[k++] = right[j++];
        }
        return merged;
    }
}
