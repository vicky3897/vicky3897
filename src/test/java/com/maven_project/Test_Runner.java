package com.maven_project;

import org.openqa.selenium.WebDriver;
import com.properties_helper.File_Reader_Manager;
import com.sdp.Project_Object_Manager;

public class Test_Runner extends BaseClass {

	public static WebDriver driver = browserLauch("chrome");

	public static Project_Object_Manager pom = new Project_Object_Manager(driver);

	public static void main(String[] args) throws Throwable {

		String url = File_Reader_Manager.GetInstanceFRM().getInstanceCR().getUrl();
		getUrl(url);

		implicitlyWait();

		click(pom.getInstanceHome().getLogin());

		String email = File_Reader_Manager.GetInstanceFRM().getInstanceCR().getEmail();
		sendKeys(pom.getInstanceLogin().getMail(), email );

		String password = File_Reader_Manager.GetInstanceFRM().getInstanceCR().getPassword();
		sendKeys(pom.getInstanceLogin().getPassword(),password );

		click(pom.getInstanceLogin().getSubLogin());

		click(pom.getInstanceWomen().getWomen());

		click(pom.getInstanceDress().getDress());

		frame(pom.instanceCart().getFrame());

		click(pom.instanceCart().getSubmit());

		defaultContent();

		click(pom.InstanceProcced().getProced());

		click(pom.InstanceNextProcced().getNextProcced());

		click(pom.InstanceAddress().getAddress());

		click(pom.InstanceCheckBox().getCheckbox());

		click(pom.InstanceShipping().getShipping());

		click(pom.instancePay().getPay());

		click(pom.InstanceConfirm().getConfirmOrder());

		String screenshot = File_Reader_Manager.GetInstanceFRM().getInstanceCR().getScreenshot();
		screenshot(screenshot);

	}

}
