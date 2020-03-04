
public class App {

	public static void main(String[] args) throws InterruptedException {
		
		Contagem t1 = new Contagem(0, 5);
		Contagem t2 = new Contagem(10, 15);
		t1.start();
		t1.join();
		
		t2.start();
		t2.join();
		
	}

}
