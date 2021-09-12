package Test;

public class LargestNnumbers {
	public static void main(String[] args) {
	    int[] arr = {-100,-24,1,0,50,6,-4};
	    int largest = arr[0];
	    for(int i=1;i<arr.length;i++) {
	    	if(arr[i]>largest) {
		    	largest=arr[i];
		    }
	    }
	    
	    System.out.println("The Largest Integer is: " + largest);
	    
	    

}
}