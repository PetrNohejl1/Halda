package iHeaap;

import java.util.Random;

import PetrNohejl.MinHeap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
 MinHeap neco = new MinHeap(100);
 for(int i = 0; i < neco.getSize(); i++) {
	int c = r.nextInt(200);
	neco.Insert(c);
			}
	for(int i =0; i<neco.getSize(); i++) {
		System.out.println(neco.ExtractMin());
	}
}
}
