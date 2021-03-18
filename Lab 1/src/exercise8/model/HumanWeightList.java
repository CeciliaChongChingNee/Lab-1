/**
 * Create a package for Exercise 8 named exercise8.model
 */
package exercise8.model;

import java.util.ArrayList;

/**
 * Create a class named HumanWeightList
 * @author ching
 *
 */
public class HumanWeightList {
	
	//attribute of this class
	private ArrayList<Double> weightsOnEarth;
	private ArrayList<Double> weightsOnMars;
	
	/**
	 * Initialize arrayList
	 */
	public HumanWeightList() {
		
		weightsOnEarth = new ArrayList<>();
		weightsOnMars = new ArrayList<>();
		
	}
	
	/**
	 * @return the weightsOnEarth
	 */
	public ArrayList<Double> getWeightsOnEarth() {
		return weightsOnEarth;
	}
	
	/**
	 * @param weightsOnEarth the weightsOnEarth to set
	 */
	public void setWeightsOnEarth(ArrayList<Double> weightsOnEarth) {
		this.weightsOnEarth = weightsOnEarth;
	}

	/**
	 * @return the weightsOnMars
	 */
	public ArrayList<Double> getWeightsOnMars() {
		return weightsOnMars;
	}

	/**
	 * @param weightsOnMars the weightsOnMars to set
	 */
	public void setWeightsOnMars(ArrayList<Double> weightsOnMars) {
		this.weightsOnMars = weightsOnMars;
	}
	
}
