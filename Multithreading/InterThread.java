package Multithreading;

import java.util.ArrayList;
import java.util.List;

class Producer_Consumer {
	InterThread it = new InterThread();
	synchronized void producer(int a) throws InterruptedException {
		while(it.list.size()==it.CAPACITY) {
			System.out.println("The list is full");
			wait();
		}
		
		it.list.add(a);
		System.out.println("Produced item: "+a);
		notify();
	}
	synchronized void consumer() throws InterruptedException {
		while(it.list.isEmpty()) {
			System.out.println("The list is empty");
			wait();
		}
		int r = it.list.remove(0);
		System.out.println("Consumed item: "+r);
		notify();
	}
}
public class InterThread {
	static final int CAPACITY = 5;
	final List<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		InterThread inth = new InterThread();
		Producer_Consumer pc = new Producer_Consumer();
		Runnable r1=()-> {
			for(int i=1;i<=10;i++) {
				try {
					pc.producer(i);
				}
				catch(InterruptedException e) {
					Thread.currentThread().interrupt();
					System.out.println("Thread Interrupted");
					
				}				
				
			}
			
		};
		Runnable r2=()-> {
			for(int i=1;i<=10;i++) {
				try {
					pc.consumer();
				}
				catch(InterruptedException e) {
					Thread.currentThread().interrupt();
					System.out.println("Thread Interrupted");
					
				}				
				
			}
			
		};
		Thread prodthread = new Thread(r1);
		Thread consthread = new Thread(r2);
		
		prodthread.start();
		consthread.start();
		
	}

}
