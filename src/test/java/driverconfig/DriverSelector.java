package driverconfig;

import driverconfig.DriverConfiguration.DriverConfiguation;

public class DriverSelector {
	// when we convert the method to return from void to DriverConfig ...why it is
	// asking for return type
	public DriverConfiguation getDriver(String driverconfig) {
		if (driverconfig == null) {
			return null;
		}

		if (driverconfig.equalsIgnoreCase("IOSLocal")) {
			return new IOSLocal();
		}
		if (driverconfig.equalsIgnoreCase("IOSRemote")) {
			return new IOSRemote();
		}
		return null;

	}

}
