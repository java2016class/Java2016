package a803;

public class Q27 {
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder(128);
		int arr[] = {1,2,3,4,5};
		System.arraycopy(arr, 2, arr, 1, 2);
		System.out.print(arr[1]);// 3
		System.out.print(arr[4]);// 5
	}
}
