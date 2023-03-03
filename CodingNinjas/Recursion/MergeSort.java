package CodingNinjas.Recursion;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={3,6,8,2,5,45,75,12,43,85,36,46};
        mergeSort(arr);
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }

    public static void mergeSort(int[] input){
        // Write your code here
        if(input.length<=1){
            return;
        }
        int[] arr1=new int[input.length/2];
        int[] arr2= new int[input.length-arr1.length];

        for(int i=0;i<input.length/2;i++){
            arr1[i]=input[i];
        }

        for(int i=input.length/2;i<input.length;i++){
            arr2[i-input.length/2]=input[i];
        }
        mergeSort(arr1);
        mergeSort(arr2);
        mergeSortedArray(arr1,arr2,input);

    }

    private static void mergeSortedArray(int[] arr1, int[] arr2,int[] result){
        int firstArrayIndex=0;
        int secondArrayIndex=0;
        int resultArrayIndex=0;

        while(firstArrayIndex<arr1.length && secondArrayIndex<arr2.length){
            if(arr1[firstArrayIndex] < arr2[secondArrayIndex]){
                result[resultArrayIndex]=arr1[firstArrayIndex];
                firstArrayIndex++;
                resultArrayIndex++;
            }
            else{
                result[resultArrayIndex]=arr2[secondArrayIndex];
                secondArrayIndex++;
                resultArrayIndex++;
            }
        }

        if(firstArrayIndex<arr1.length){
            while(firstArrayIndex<arr1.length){
                result[resultArrayIndex]=arr1[firstArrayIndex];
                firstArrayIndex++;
                resultArrayIndex++;
            }
        }
        if(secondArrayIndex<arr2.length){
            while(secondArrayIndex<arr2.length){
                result[resultArrayIndex]=arr2[secondArrayIndex];
                secondArrayIndex++;
                resultArrayIndex++;
            }
        }
    }
}
