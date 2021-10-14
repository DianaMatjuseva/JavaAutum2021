package sef.module10.activity;
//Needs to be completed
//Code that generates output synchronized from 2 threads
//First thread prints a number from 1-26 and the other prints alphabets
//against those numbers 

//public class AlphabetNumberTest {
//	public static void main(String[] args) {
//		Generator obj = new Generator();
//
//		//1 - Create objects of both the thread classes and pass obj as a parameter to them
//		NumGenerator numGen = new NumGenerator(obj);
//		AlphaGenerator alphaGen = new AlphaGenerator(obj);
//
//		//2 - Start both the threads
//		alphaGen.start();
//		numGen.start();
//		}
//	}
//
//class NumGenerator extends Thread {
//	public Generator obj;
//	public NumGenerator(Generator obj)
//	{
//		this.obj = obj;
//	}
//	public void run()
//	{
//		//3 - Run a loop from 1-26 (say i is the variable) and
//		//call printNumber passing i as its parameter
//		int i = 1;
//		while (i <= 26)
//		{
//			try {
//				obj.printNumber(i);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			i = i + 1;
//		}
//	}
//}
//
//class AlphaGenerator extends Thread {
//	public Generator obj;
//	public AlphaGenerator(Generator obj)
//	{
//		this.obj = obj;
//	}
//	public void run()
//	{
//
//		//4 - Run a loop from A-Z (say c is the variable) and
//		//call printAlphabet passing c as its parameter
//		char c = 'A';
//		while (c <= 'Z')
//		{
//			try {
//				obj.printAlphabet(c);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			c++;
//			}
//	}
//}
//
//class Generator {
//	boolean numPrinted = false;
//
//	public synchronized void printNumber(int number) throws InterruptedException {
//		{
//			//5 - Check if numPrinted is true, then call wait()
//			if (numPrinted) {
//				wait(2000);
//			}
//
//			//6 - print the number here
//			System.out.print(number + ": ");
//
//			//7 - numPrinted should be assigned true here
//			numPrinted = true;
//
//			//8 - Notify the waiting thread
//			notify();
//		}
//		public synchronized void printAlphabet(char alphabet) throws InterruptedException {
//			//9 - Check if numPrinted is false, then call wait()
//			if (!numPrinted) {
//				wait(2000);
//			}
//
//			//10 - print the alphabet here
//			System.out.println(alphabet);
//
//			//11 - numPrinted should be assigned true here
//			numPrinted = false;
//
//			//12 - Notify the waiting thread
//			notify();
//		}
//	}
//}