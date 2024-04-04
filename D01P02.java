package com.learning.core.day1session1;

public class D01P02 {
	 public static void main(String[] args) {
	     // Declare instances of Medicine
	     Medicinelnfo medicine1 = new Tablet();
	     Medicinelnfo medicine2 = new Syrup();
	     Medicinelnfo medicine3 = new Ointment();

	     // Check polymorphic behavior of displayLabel() method
	     medicine1.displayLabel();
	     medicine2.displayLabel();
	     medicine3.displayLabel();
	 }
	}

	//Interface Medicinelnfo
	interface Medicinelnfo {
		void displayLabel();
	}

	//Tablet class implementing Medicinelnfo interface
	class Tablet implements Medicinelnfo {
 
		public void displayLabel() {
			System.out.println("Store Tablets in a cool dry place.");
		}
	}

	//Syrup class implementing Medicinelnfo interface
	class Syrup implements Medicinelnfo {
 
		public void displayLabel() {
			System.out.println("Syrup is consumable only on prescription.");
		}
	}

	//Ointment class implementing Medicinelnfo interface
	class Ointment implements Medicinelnfo {
		public void displayLabel() {
			System.out.println("Ointment is for external use only.");
		}
	}

