package ch07;

public class App7_02 {
public static void main(String[] args) {
	int i;
	i = star(3);
	System.out.println("�L�X"+i+"�ӬP�P");
}

public static int star(int n){
	
	int i;
	for(i=1;i<=2*n;i++){
	System.out.print("*");
	}
	System.out.println();
	
	return 2*n;
}
}
