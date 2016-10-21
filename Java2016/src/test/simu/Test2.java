package test.simu;

public class Test2 {
	public String get1 = "get1";
	public int get2 = 2;
	public char get3 = 'A';

	public String[] getStr1() {
		String[] strs = new String[2];
		strs[0] = get1;
		strs[1] = String.valueOf(get2);
		// strs = str.split(";");
		return strs;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// return super.toString();
		return "" + get3 + 'A';
	}
}
