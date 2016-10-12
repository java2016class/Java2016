package a803;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Q50 implements Q50_Inter{

//	@Override
//	public void close() throws IOException { //A選項
//		// TODO Auto-generated method stub
//		
//	}
	
//	public void close() throws Exception{//B選項  型態不合，無法使用父類別
//		
//	}
	
//	public void close() throws FileNotFoundException{ //C選項，可以使用子類別
//		
//	}
	
	// D選項的class直接使用extends 不符合interface的使用規則
	
	public void close(){//E選項 不使用throws IOException也可以
		
	}

}
