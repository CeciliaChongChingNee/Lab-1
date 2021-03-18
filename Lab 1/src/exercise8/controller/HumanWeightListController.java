/**
 * Create a package for Exercise 8 named exercise8.controller
 */
package exercise8.controller;

import java.util.ArrayList;
import exercise8.model.Human;
import exercise8.model.HumanWeightList;

/**
 * Create a class named HumanWeightListController
 * 
 * @author ching
 *
 */
public class HumanWeightListController {

	/**
	 * Function to store human weight on Earth and Mars
	 */
	public void storeWeights(HumanWeightList humanWeightList, 
			ArrayList<Human> humans) {
		
		//loop for every human in HumanList
		for(Human human:humans) {
			
			//set human weight into humanWeightList
			humanWeightList.getWeightsOnEarth().add(new HumanController().getHumanWeightOnEarth(human));
			
			//set human weight into humanWeightList
			humanWeightList.getWeightsOnMars().add(new HumanController().getHumanWeightOnMars(human));
			
		}

	}

}
