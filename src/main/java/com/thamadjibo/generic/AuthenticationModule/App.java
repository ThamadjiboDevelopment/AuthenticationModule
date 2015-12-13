package com.thamadjibo.generic.AuthenticationModule;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thamadjibo.generic.AuthenticationModule.obj.User;
import com.thamadjibo.generic.AuthenticationModule.service.AuthenticationService;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	AuthenticationService authService = (AuthenticationService) context.getBean("authenticationService");
    	authService.signUp(new User());
    }
}
