package com.soham.coreJava.Inheritance;

public class profileServiceAbstarct implements profileService {

    @Override
    public void createProfile(String UserID) {
	System.out.println("Creating Profile Of User Name "+ UserID);
	
    }

    @Override
    public void deleteProfile( String u) {
	
	System.out.println("Deleting the profile for UserID" + u);
    }
    
    

}
