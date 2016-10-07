package ch11.hw;

public class HW02 {
	public static void main(String[] args) {
		Timer.startTimer(1000, new WatchUser());
	}
}

interface TimeUp {
	void noftifyMe();
}

class Timer {
	static void startTimer(int seconds, TimeUp obj) {
		for (int i = 0; i < seconds; i++) {
			System.out.println(seconds - i);
		}
		obj.noftifyMe();
	}
}

class WatchUser implements TimeUp {

	@Override
	public void noftifyMe() {
		// TODO Auto-generated method stub
		System.out.println("Time up.");
	}

}
