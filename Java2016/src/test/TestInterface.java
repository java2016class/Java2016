package test;

public class TestInterface {
	public static void main(String[] args) {
		Rect rect = new Rect() {//���ϥ�class�ɭn�Y�ɹ�@;
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				
			}
		};

		rect = new RectImpl(); //�ϥ�class�ᤣ�ι�@�A�]���b��class�w�g��@
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
	//�h���~��(��@)interface�A��interface�����P�ؤ�k��? show()�h�Q�л\��@

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}

class TriImpl implements Rect,Cir,Squ{
	//�h��interface��@�A�ƼƥH�W��k�|�@�P�Q�ɤJ

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
