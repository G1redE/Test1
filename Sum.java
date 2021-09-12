package Test;


public class Sum {
	public static void main(String[] args) {
	    int[] arr = {3,2,1,4,5,6,4};
		int sum= 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("The sum is " +sum);

}
}
