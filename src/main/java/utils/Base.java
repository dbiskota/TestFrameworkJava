package utils;

import org.aeonbits.owner.ConfigFactory;
import org.testng.IConfigurable;
import org.testng.IConfigureCallBack;
import org.testng.ITestResult;
import properties.TestInitValues;
import properties.TestProperties;

import static utils.ApiServices.setHttpRequestConfiguration;

public class Base implements IConfigurable {

    public static TestProperties testProp = ConfigFactory.create(TestProperties.class);
    public static TestInitValues testCred = ConfigFactory.create(TestInitValues.class);


    static {
        setHttpRequestConfiguration(testCred.BASE_URL(), testProp.consoleLog());
    }

    @Override
    public void run(IConfigureCallBack iConfigureCallBack, ITestResult iTestResult) {
    }
}
