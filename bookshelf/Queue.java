package bookshelf;

public interface Queue {
	void enQueue(String title);
	String deQueue();
	int getsize();
}
