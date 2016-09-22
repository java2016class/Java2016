package ch7;

public class Pra7_2_All {
	public static void main(String[] args) {
		//7.2.11
		int arr1[] = { 8, 6, 9, 12, 47, 55, 10 };
		System.out.println(countArrOdd(arr1));
		//7.2.12
		int arr2[] = { 75, 29, 38, 45, 16 };
		System.out.println(getArrMin(arr2));
		//7.2.13
		System.out.println(getArrMinIndex(arr2));
		//7.2.14
		int arr3[][] = { { 75, 29, 10 }, { 38, 45, 16 } };
		System.out.println(getArrMax(arr3));
		//7.2.15
		int arr4[] = { 75, 29, 10, 38, 45, 16 };
		System.out.println(getArrMaxCrossMin(arr4));
		//7.2.16
		int arr5[][] = { { 2, 4, 6 }, { 1, 3, 5 }, { 8, 9 } };
		System.out.println(getArrAvg(arr5));
		//7.2.17
		int arr6[][] = { { 1, 4, 8 }, { 2, 9, 5 }, { 6, 3 } };
		System.out.println("before:");
		for (int[] is : arr6) {
			for (int i : is) {
				System.out.printf("%2d\t", i);
			}
			System.out.println();
		}
		System.out.println("after:");
		arr6 = getArrSqt(arr6);
		for (int[] is : arr6) {
			for (int i : is) {
				System.out.printf("%2d\t", i);
			}
			System.out.println();
		}
		//7.2.18
		int arr7[] = { 75, 29, 10, 38, 45, 17 };
		System.out.println("avg = " + avg(arr7));

	}

	public static int countArrOdd(int arr[]) {
		int j = 0;
		for (int i : arr) {
			if (i % 2 != 0)
				j++;
		}
		return j;
	}

	public static int getArrMin(int a[]) {
		int min = 0, temp;
		for (int i : a) {
			temp = i;
			if (min > temp || min == 0) {
				min = temp;
			}
		}
		return min;
	}

	public static int getArrMinIndex(int a[]) {
		int min = 0, temp, index = 0;
		for (int i = 0; i < a.length; i++) {
			temp = a[i];
			if (min > temp || min == 0) {
				min = temp;
				index = i;
			}
		}
		return index;
	}

	public static int getArrMax(int arr[][]) {
		int max = 0, temp;
		for (int i[] : arr) {
			for (int j : i) {
				temp = j;
				if (max < temp) {
					max = temp;
				}
			}

		}
		return max;
	}

	public static int getArrMaxCrossMin(int a[]) {
		int min = 0, max = 0, temp;
		for (int i : a) {
			temp = i;
			if (min > temp || min == 0) {
				min = temp;
			}
			if (max < temp) {
				max = temp;
			}
		}
		return max * min;
	}

	public static float getArrAvg(int arr[][]) {
		int sum = 0, count = 0;
		for (int i[] : arr) {
			for (int j : i) {
				sum += j;
				count++;
			}

		}
		return sum / (float) count;
	}

	public static int[][] getArrSqt(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] *= arr[i][j];
			}
		}

		return arr;
	}

	public static double avg(int arr[]) {
		show(arr);
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum / (double) arr.length;
	}

	public static void show(int arr[]) {
		System.out.print("arr={");
		for (int i : arr) {
			System.out.print(i);
		}
		System.out.println("}");
	}

}
