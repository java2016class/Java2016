package a803;

public class Test {
	public static void main(String[] args) {
		// StringBuilder sb = new StringBuilder(128);
	}

	abstract class Test2 {
		protected abstract void share();
	}

	// NO.49 Which two demonstrate the valid usage of the keyword synchronized?
	// A.interface ThreadSafe { synchronized void doIt(); }
	// B.abstract class ThreadSafe { synchronized abstract void doIt(); }
	// C.class ThreadSafe { synchronized static void soIt () {} }
	// D.enum ThreadSafe { ONE, TWO, Three; synchronized final void doIt () {} }
}

//interface ThreadSafe { synchronized void doIt(); } 不能直接使用sync
//abstract class ThreadSafes { synchronized abstract void doIt(); } 不能直接使用sync
class ThreadSafess { synchronized static void soIt () {} }
enum ThreadSafesss { ONE, TWO, Three; synchronized final void doIt () {} }