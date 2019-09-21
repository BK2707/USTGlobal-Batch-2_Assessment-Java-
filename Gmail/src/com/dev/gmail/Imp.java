package com.dev.gmail;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class Imp implements Curd {
	HashMap<String,Account> hs1 = new HashMap<String,Account>();
	HashSet<Inbox> hs2 = new HashSet<Inbox>();
	static Scanner sc = new Scanner(System.in);


	@Override
	public void addAccount(String key,Account ac) {
		hs1.put("1",ac);
		System.out.println(hs1);
				
	}


	@Override
	public void addInbox(Inbox in) {
		hs2.add(in);
		
	}


	@Override
	public void showInbox() //Inbox
	{
		Inbox in = new Inbox();
		System.out.println(in.getMessage_id());
		System.out.println(in.getMessage());
		
		
	}
	
	@Override
	public void compose(int message_id, String message, Inbox in) // compose mail
	{
		Imp im = new Imp();
		im.addInbox(in);
		System.out.println(hs2);
	}
	
	@Override
	public void login() // login
	{
			System.out.println("Press A to compose\r\n" + 
					           "Press B to show inbox");
			String ch =sc.next();

			if(ch=="A") {
				int message_id =101;
				String message = "Hello!!";
				System.out.println("Enter Message Id");
				sc.hasNextInt(message_id);
				System.out.println("Enter Message");
				sc.nextLine();
				Inbox in1 = new Inbox();
				in1.setMessage_id(message_id);
				in1.setMessage(message);
				compose(message_id, message,in1);
			}else if (ch=="B") {
				showInbox();			
			
		}
		
	}


	@Override
	public void register(Account ac) {
		Imp im = new Imp();
		im.addAccount("1",ac);
		
	}

}
