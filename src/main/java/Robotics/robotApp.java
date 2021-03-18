/**
 *This is a Robot created for Automating the Passport Services 
 * Git Lab
 */
package Robotics;

/**
 * @author Vinu
 *
 */
public class robotApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		robotChar rc = new robotChar("Passport Agent", "Submit Passport Application", "Fill Validate and Submit Application");
		System.out.println("Hello I am a " + rc.getRobotName()+ " Robot");
		System.out.println( "I can help you " + rc.getPurpose());
		System.out.println("I will " + rc.getAbility());

	}

}
