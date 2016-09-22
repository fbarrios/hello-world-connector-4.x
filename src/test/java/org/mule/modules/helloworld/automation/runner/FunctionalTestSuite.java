package org.mule.modules.helloworld.automation.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.helloworld.automation.functional.GreetTestCases;

@RunWith(Suite.class)
@SuiteClasses({ GreetTestCases.class })
public class FunctionalTestSuite {


}