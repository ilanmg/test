package selenium.driver;

import selenium.configurations.TypedProperties;

import static java.lang.Boolean.parseBoolean;

public class WebDriverConfig {
	private final TypedProperties typedProperties = new TypedProperties("/driver_config.properties");

	String getBrowserName() {
        return typedProperties.getValue("browser.name");
	}

	int getImplicitlyWait() {
        return typedProperties.getInt("implicitly_wait");
	}

	int getDomMaxScriptRunTime() {
        return typedProperties.getInt("dom.max_script_run_time");
	}

	String getSeleniumHbUrl() {
		Boolean isLocal  = parseBoolean(System.getProperty("local"));
		if(isLocal){
			return typedProperties.getValue("selenium.hub.url_local");
		}
		return typedProperties.getValue("selenium.hub.url");
	}
}
