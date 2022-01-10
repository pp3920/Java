package com.Priyanka;

import java.io.File;
import java.util.Scanner;

///try to remove scanner

public class Project 
{
	
	public static void main(String[]args)
	{  
	
		File folder= new File("C:\\Users\\priya\\Desktop\\main");
		folder.mkdirs();
		System.out.println("Welcome to LockerMe.com");
		System.out.println(" ");
		System.out.println("My name is Priyanka Pandey and We have following funcionality available");
		System.out.println("************************************************************");
		Scanner scan = new Scanner(System.in);
		{
			//DISPLAYING INITIAL MENU
		while(true)
		{
		
	    System.out.println("");
		System.out.println("");
		System.out.println("1. Reterive all files inside main folder in ascending order");
		System.out.println("2. Display menu for performing secondary operation	");
		System.out.println("3. Display program terminated successfully");
		System.out.println("");
		System.out.println("************************************************************");
		
		System.out.println("Selected option: " );
		int choice = scan.nextInt();
		
		
		switch(choice)
		{
	
		case 1:
		{ 
			System.out.println("Reteriving all the files in ascending order");
			System.out.println("");
			File ob = new File("C:\\Users\\priya\\Desktop\\main");
			File array[] = ob.listFiles();
              
			for(int i=0;i<array.length;i++)
			{
			   System.out.println(array[i]);
			}
		}
		break;
		

		case 2:
		{
			while(true)
			
			{
			System.out.println("Display menu for performing secondary operations");
			System.out.println("");
			System.out.println("1. Option to add a user specified file to the application");
			System.out.println("2. Option to delete a user specified file from the application");
			System.out.println("3. Option to search a user specified file from the application");
			System.out.println("4. option to close the current execution and return to the main ");
			System.out.println("5. option to close execution");
			System.out.println("");
			
			
			System.out.println("Selected option: " );
		    int choice2 = scan.nextInt();
			
			switch(choice2)
			{
			  case 1:	 
				Scanner scan2 = new Scanner(System.in);
				String name = scan2.nextLine();
				
			    String path = folder + "\\" + name;
				folder = new File(path);
				folder.mkdirs();
				break;
				
			  case 2: 
				  
				  Scanner scan3 = new Scanner(System.in);
				  String name2 = scan3.nextLine();
				  String path2 = folder + "\\" + name2;
				  folder = new File(path2);
				  if(folder.exists())
				    {
				       folder.delete();
				    }
				  else
				    {
					  System.out.println("file not found");
				    }
				  break;
			
			  case 3: 
				  Scanner scan4 = new Scanner(System.in);
				  String name3 = scan4.nextLine();
				  
				  
				  File array[] = folder.listFiles();
				  
					for(int i=0;i<array.length;i++)
				        {
						    
						    if (array[i].getName().startsWith(name3))
						     {
					               System.out.println(array[i]); 
					               
						      }
						    else
						      {
						    	   System.out.println("file not found!");
						    	   break;
						       }
					         } 
			             
					break;
				
			  case 4: 
				 System.out.println("return to previous menu");
				 System.out.println(" ");
				 break;
				 
			  case 5:
				  System.out.println("program terminate successfully");
				  System.exit(0);
			default:
				    System.out.println("Option is not correct try again!!");
			}
			}
		}
		case 3:
			System.out.println("program terminate successfully");
			 System.exit(0);
			break;
	
			
		default:
			System.out.println("Options are not correct!! Please try again");
			break;
			
		}
		
		}
		}
	}
}
				

				  
				  
				  
				  
				  
				  
			 
				  
				  
				
			
			
			
			
			
			




		
				
			
				
            

				
				
				

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		

	
	
	
		


