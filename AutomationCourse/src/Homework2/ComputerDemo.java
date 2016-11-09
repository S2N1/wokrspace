package Homework2;

public class ComputerDemo {

	public static void main(String[] args) {

		MyComputer pc = new MyComputer();

		MyComputer laptop = new MyComputer();

		pc.hardDiskMemory = 500;
		pc.freeMemory = 250;
		pc.operationSystem = "Linux";

		laptop.hardDiskMemory = 500;
		laptop.freeMemory = 250;
		laptop.operationSystem = "Linux";
		laptop.isNotebook = true;

		// you can change the memory with this method
		pc.useMemory();
		// you can change the operation system with this method
		laptop.changeOperationSystem();

		// show all the fields of the two objects
		pc.showComputerStatistics();
		laptop.showComputerStatistics();
	}

}
