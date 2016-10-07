package test;

public class TestInterface {
	public static void main(String[] args) {
		Rect rect = new Rect() {//未使用class時要即時實作;
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				
			}
		};

		rect = new RectImpl(); //使用class後不用實作，因為在該class已經實作
		rect.show();
	}

}
class RectImpl implements Rect{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}

class MultiImpl implements Rect,Cir{
	//多重繼承(實作)interface，但interface內有同種方法時? show()則被覆蓋其一
	//解決方法有二，一在設計時明確定義不同方法、二使用不同class個別implements interface

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}

class TriImpl implements Rect,Cir,Squ{
	//多個interface實作，複數以上方法會一同被導入

	@Override
	public void showAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}

interface Rect{
	void show();
}

interface Cir{
	void show();
}

interface Squ{
	void showAll();
}


class MultiExtendsImpl implements iThird{
	
}

interface iFast{
}
interface iSecond extends iFast{
	
}
interface iThird extends iSecond{
	
}
