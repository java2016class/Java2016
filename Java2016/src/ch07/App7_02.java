package ch07;

public class App7_02 {
public static void main(String[] args) {
	int i;
	i = star(3);
	System.out.println("印出"+i+"個星星");
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
