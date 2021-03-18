/**
* This is a Robot created for Automating Services
 * 
 */
package Robotics;

/**
 * @version 1.0
 * @author Vinu
 *
 */
public class robotChar {
		
		private String robotName;
		private String purpose;
		private String ability;
		/**
		 * @return the robotName
		 */
		public String getRobotName() {
			return robotName;
		}
		/**
		 * @param robotName the robotName to set
		 */
		public void setRobotName(String robotName) {
			this.robotName = robotName;
		}
		/**
		 * @return the purpose
		 */
		public String getPurpose() {
			return purpose;
		}
		/**
		 * @param purpose the purpose to set
		 */
		public void setPurpose(String purpose) {
			this.purpose = purpose;
		}
		/**
		 * @return the ability
		 */
		public String getAbility() {
			return ability;
		}
		/**
		 * @param ability the ability to set
		 */
		public void setAbility(String ability) {
			this.ability = ability;
		}
		/**
		 * @param robotName is the name of the Robot 
		 * @param purpose is the purpose of the Robot
		 * @param ability is the ability of the Robot
		 */
		public robotChar(String robotName, String purpose, String ability) {
			super();
			this.robotName = robotName;
			this.purpose = purpose;
			this.ability = ability;
		}
		
		
	

}
