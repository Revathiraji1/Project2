package org.tcs.login;

public class Desktop implements Hardware, Software {

	private void desktopModel() {
		System.out.println("Apple 11");
	}

	@Override
	public void softwareResources() {
		System.out.println("Software");
	}

	@Override
	public void hardwareResourses() {
		System.out.println("Hardware");
	}

	private void sub() {
		System.out.println("sub");

	}

	private void add() {
		System.out.println("add");
	}

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktopModel();
		d.hardwareResourses();
		d.softwareResources();
		d.sub();
		d.add();
		
	}
}
