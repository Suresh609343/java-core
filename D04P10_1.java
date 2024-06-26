package com.learning.core.day4session2;

class D04P10_1 {
	
    public void quickSort(int[] arr, int low, int high) {
        
    	if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) 
    {
        int pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) 
        {
            if (arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) 
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void printArray(int[] arr)
    {
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        D04P10_1 sorter = new D04P10_1();
        int[] arr = {10,7,8,6,9,1,5};
        System.out.println("Input:");
        sorter.printArray(arr);
        sorter.quickSort(arr, 0, arr.length - 1);
        System.out.println("Output:");
        sorter.printArray(arr);
    }
}
