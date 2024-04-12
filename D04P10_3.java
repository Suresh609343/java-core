package com.learning.core.day4session2;

class D04P10_3 {
	
    public boolean linearSearch(int[] arr, int target) {
        
    	for (int num : arr) 
        {
            if (num == target) 
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        D04P10_3 searcher = new D04P10_3();
        int[] array = {5, 2, 3, 4, 10, 40};
        int target = 10;
        boolean present = false;
        
        System.out.println("Output:");
        present = searcher.linearSearch(array, target);
        if (present)
        {
            System.out.println("Element is Present");
        } 
        else 
        {
            System.out.println("Element is Not Present");
        }
    }
}