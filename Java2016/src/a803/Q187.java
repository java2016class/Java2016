package a803;

public class Q187 {
	public static void main(String[] args) {
		String[] name = new String[3];
		name[0] = "Mary Brown";
		name[1] = "Nancy Red";
		name[2] = "Jessy Orange";
		
		try{
		for (String n : name) {
			try{
				String pwd = n.substring(0, 3)+n.substring(6,10);
				System.out.println(pwd);
			}catch(StringIndexOutOfBoundsException e){
				System.out.println("String out of limits");
			}
			
		}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array out of limits");
		}
	}
}
