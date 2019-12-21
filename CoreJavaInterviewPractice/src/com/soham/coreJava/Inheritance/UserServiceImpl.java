package com.soham.coreJava.Inheritance;

public class UserServiceImpl extends UserCreationService_CR1255  implements UserService{

    @Override
    public void findUser(String userID) {

          System.out.println("Finding User with name "+ userID);
	
    }

    @Override
    public boolean ifExist(String userID) {
	System.out.println("Cheking if User of name "+userID + " exist Or not  ." );
	return true;
    }
    
    
    

}
