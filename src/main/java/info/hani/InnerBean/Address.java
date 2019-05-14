package info.hani.InnerBean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Address {
	
	Logger logger = LogManager.getRootLogger();
	
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + "]";
	}
	
	
//	public void displayAddressDetails() {
//		logger.debug(getState());
//	}

}
