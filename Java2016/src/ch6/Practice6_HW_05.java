package ch6;

public class Practice6_HW_05 {
public static void main(String[] args) {
	int i=0,j=0;
	while(i<5){
		while(j<=i){
			System.out.print("*");
			j++;
		}
		i++;
		j=0;
		System.out.println();
	}
}
}
