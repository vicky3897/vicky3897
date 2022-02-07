package com.properties_helper;

public class File_Reader_Manager {

	//private constructor
	private File_Reader_Manager() {
  
		//change to private czu it restrict to create objext in another class
	}
	
	//static method
	public static File_Reader_Manager GetInstanceFRM() {

		File_Reader_Manager frm = new File_Reader_Manager();
		
		return frm;
	}
	
	//non static method
	public Configuration_Reader getInstanceCR() throws Throwable {

		Configuration_Reader cr = new Configuration_Reader();
		return cr;
	}
	
}
