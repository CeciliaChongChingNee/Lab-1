/**
 * Create a package for Exercise 8 named exercise8.view
 */
package exercise8.view;

import java.util.ArrayList;
import exercise8.model.Human;
import exercise8.controller.HumanWeightListController;
import exercise8.model.HumanWeightList;

/**
 * Create a class named HumanWeightListDemo
 * 
 * @author ching
 *
 */
public class HumanWeightListDemo {

	/**
	 * Main entry point of program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Create human object
		Human human1 = new Human();
		Human human2 = new Human();
		Human human3 = new Human();

		// Set human weight
		human1.setWeight(67.1);
		human2.setWeight(49.5);
		human3.setWeight(77.3);

		// Create list of human
		ArrayList<Human> humans = new ArrayList<>();

		// Add human into list
		humans.add(human1);
		humans.add(human2);
		humans.add(human3);

		// Create humanWeightList object
		HumanWeightList humanWeightList = new HumanWeightList();

		// Create humanWeightListController object
		HumanWeightListController humanWeightListController = new HumanWeightListController();

		// Store weight into humanWeightList
		humanWeightListController.storeWeights(humanWeightList, humans);

		// Display human weight on Earth
		int counter = 1;
		for (Double weight : humanWeightList.getWeightsOnEarth()) {

			System.out.print("Weight on Earth for human ");
			System.out.print(counter++ + " :");
			System.out.format("%.2f", weight);
			System.out.println(" kg");

		}
		
		System.out.print("\n");

		// Display human weight on Mars
		counter = 1;
		for (Double weight : humanWeightList.getWeightsOnMars()) {

			System.out.print("Weight on Mars for human ");
			System.out.print(counter++ + " :");
			System.out.format("%.2f", weight);
			System.out.println(" kg");

		}

	}

}
