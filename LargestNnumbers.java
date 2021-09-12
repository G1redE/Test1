package Test;

public class LargestNnumbers {
	public static void main(String[] args) {
	    int[] arr = {3,20,1,14,5,6,4};
	    int largest = 0;
	    for(int i=0;i<arr.length;i++) {
	    	if(arr[i]>largest) {
		    	largest=arr[i];
		    }
	    }
	    
	    System.out.println("The Largest Integer is: " + largest);
	    
	    

}
}