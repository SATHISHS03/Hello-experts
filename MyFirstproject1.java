import java.util.Scanner;
public class MyFirstproject1 {

    public static void main(String args[])  {
    Scanner in = new Scanner(System.in);
    
    String yn,search,again,choice;
	int to=0,y=1,z=0,end=0,r=1;
    int available[] = new int[6];
    int ticketI[][] = new int [100][3];
    String ticketS[][] = new String[100][3];
    double ticketD[][] = new double [100][3];
   
    
    
    
    
    
												//"available[]" is the SEAT AVAILABLE
												//store 20 seats every destination [1-5]
    	for(int o=1; o<=5; o++)
		 {                // assigning value to the seat avaiable array 
    		available[o]=20;
  		 }
    
    	
    	
    		for(int x=1; x==1;){
    			//the MAIN MENU//
    			System.out.println("********************************************************");
				System.out.println("** WELOCME TO THE PONDICHERRY BUS RESERVATION SYSTEM  **");
				System.out.println("********************************************************");
				System.out.println("** [1] Destination                   **");
    			System.out.println("** [2] Passengers                    **");
    			System.out.println("** [3] View                          **");
    			System.out.println("** [4] Exit                          **");
				System.out.println("********************************************************");
				System.out.println("********************************************************\n");
    	
    			for(x=1; x==1;){
					System.out.print("ENTER CHOICE: ");
					choice=in.nextLine();
					
					//if CHOICE is "1" display the DESTINATION//
					if (choice.equals("1")){
						//the DESTINATION DETAILS//
						//display the "Destination", every destination "Fare", and the "Seat" available//
    					System.out.println("******************************************************************");
						System.out.println("**  FROM            |    TO      | FARE    |    Available SEAT  **");
						System.out.println("******************************************************************");
						System.out.println("** 1.)PONDICHERRY  | KARIKAL     | RS.90  |   "+available[1]+"      **");
						System.out.println("** 2.)PONDICHERRY  | CHENNAI     | RS.170 |   "+available[2]+"      **");
						System.out.println("** 3.)PONDICHERRY  | MADURAI     | RS.250 |   "+available[3]+"      **");
						System.out.println("** 4.)PONDICHERRY  | CHIDAMBARAM | RS.60  |   "+available[4]+"      **");
						System.out.println("** 5.)PONDICHERRY  | MAHE        | RS.350 |   "+available[5]+"      **");
						System.out.println("******************************************************************");	
    					x=0;//
					}
					
					//if CHOICE is "2" proceed to Ticket Booking//
					else if (choice.equals("2")){
						int print=1;      //h
						
						
						//display first the Destination Details//
						System.out.println("******************************************************************");
						System.out.println("**  FROM            |    TO      | FARE    |    Available SEAT  **");
						System.out.println("******************************************************************");
						System.out.println("** 1.)PONDICHERRY  | KARIKAL     | RS.90  |   "+available[1]+"      **");
						System.out.println("** 2.)PONDICHERRY  | CHENNAI     | RS.170 |   "+available[2]+"      **");
						System.out.println("** 3.)PONDICHERRY  | MADURAI     | RS.250 |   "+available[3]+"      **");
						System.out.println("** 4.)PONDICHERRY  | CHIDAMBARAM | RS.60  |   "+available[4]+"      **");
						System.out.println("** 5.)PONDICHERRY  | MAHE        | RS.350 |   "+available[5]+"      **");
						System.out.println("******************************************************************");
    					
    					if((available[1]==0)&&(available[2]==0)&&(available[3]==0)&&(available[4]==0)&&(available[5]==0)){
    						System.out.println("Sorry, We don't  have available seats for all Destination!");
    						x=0;
    						
    					}
    					
    					
    					
    					//inputing of Passenger's Name//
    					else{
    					for(x=1; x==1;){
    						System.out.print("\nENTER PASSENGER'S NAME: ");
    						ticketS[z][0] = in.nextLine();
							
							x=0;//
							
							//if Passenger's Name already used, display error and go back to Inputing//
    						for(int l=0; l<z; l++){
    							if(ticketS[1][0].equalsIgnoreCase(ticketS[0][1])){
    								System.out.println("Sorry, Passenger's name have already used!");
    								x=1;
    							}
    						}
    					}
    					
    					//inputing of Destination//
    					//integers Only [1-5]//
    					for(x=1; x==1;){
    						System.out.print("ENTER DESTINATION [number]: ");
    						to = in.nextInt();
    						
    						//if Inputed integers are "<1" or ">5", display error and go back to Inputing//
    						if(to<1 || to>5){
    							System.out.println("Invalid Input!");
    							x=1;
    						}
    						//if available seat is eqaul to "Zero", display error and go back to Inputing//
    						for(int d=1; d<=5; d++){
    							if(to==d){
    								if(available[to]==0){
    									System.out.println("Sorry, We don't have available seat!");
    									x=1;
    								}
									x=0;
    								
    							}
    						}
    					}
    					
    					//convert the integer to string//
    					 String dest[] = { " ", "KARIKAL", "CHENNAI", "MADURAI", "CHIDAMBARAM", "MAHE"};
						int fare[] = { 0,90,170,250,60,350};
    		
    					//converted integer to string, transfer to storage array//
						ticketS[z][1] = dest[to];
    					ticketD[z][0] = fare[to];
    					
    					//inputing for Number of Passenger's//
    					for(x=1; x==1;){
    					System.out.print("HOW MANY PASSENGERS ARE YOU?: ");
    					ticketI[z][0] = in.nextInt();
    		
    						//subtract the available seat by the the number inputed//
    						for(int p=1; p<=5; p++){
    							if(to==p){
    								print=1;
    								available[to] = available[to]+ticketI[z][0];
    								
    								//if the subtracted available seat is "<0", display error//
    								//add the inputed number to the subtracted seat, to back the original seat//
    								//display the available seat and back to the inputing//
    								if(available[to]<0){
    									System.out.print("Sorry, We don't have seat available for " +ticketI[z][0] +" person\n");
										available[to] = available[to]+ticketI[z][0];    								
										System.out.print("We only have " +available[to] +" seat available\n");
    									x=1;
    									print=0;
    								}
    								else{
    									x=0;
    								}
    							}
    						}
    		
    					}
    					
    					
    					
    					
    		
    		
    					//print out of passengers details....
    					if(print==1){
    						System.out.println("\n***************************************");
    						System.out.println("**        PASSENGER'S DETAILS        **");
    						System.out.println("***************************************");
    						System.out.println("PASSENGER'S NAME: " + ticketS[z][0]);
    						System.out.println("PASSENGER'S DESTINATION : " + ticketS[z][1]);
    						System.out.println("FARE PRICE: RS "+ticketD[z][0]) ;//// problem
    						System.out.println("NO. OF PASSENGERS: " + ticketI[z][0]);
    						
    						System.out.println("***************************************");
    						System.out.println("***************************************\n");

    						
    					}
    					
    					}
					}
					
					
					
					else if (choice.equals("3")){
						
						
						for(int sx=1; sx<=3;){
 						System.out.print("SEARCH PASSENGER'S NAME: ");
    					search = in.nextLine();
    		    
    		 		   	int s=1;
							for(x=0; x<=z; x++){
								if(search.equalsIgnoreCase(ticketS[x][0])){
									ticketD[x][2]=ticketI[z][0]*ticketD[z][0];
							System.out.println("\n***************************************");
    						System.out.println("**        PASSENGER'S DETAILS          **");
    						System.out.println("*****************************************");
    						System.out.println("PASSENGER'S NAME: " + ticketS[z][0]);
    						System.out.println("PASSENGER'S DESTINATION : " + ticketS[z][1]);
    						System.out.println("FARE PRICE: RS "+ticketD[z][0]) ;//// problem
    						System.out.println("NO. OF PASSENGERS: " + ticketI[z][0]);
    						System.out.println("TOTAL FARE PRICE: RS " + ticketD[x][2]);
							System.out.println("***************************************");
							System.out.println("***************************************");
    								s=0;
								    sx=4;
								}
							}	
						
							
							if (s==1){
								System.out.println("Passenger's Name not found!");
								sx++;
							}
							
				    	}
					}		
					
					else if(choice.equals("4")){
						end=1;
						x=0;
						System.out.println("Thank You!");
					}
				
					else{
						System.out.println("Invalid Input!");        // for the first for loop  
						x=1;                                         // if it has invaild input
					}
    			}
    	
    			for(y=1; y==1;){
    				if(end==1){
    					break;
    				}
    				System.out.print("Do you want another transaction? [Y/N]: ");
   				 	yn = in.nextLine();
    	
    				if (yn.equalsIgnoreCase("y")){
    					x=1;
    					y=0;
    				}
    				else if (yn.equalsIgnoreCase("n")){
    					System.out.println("\nThank You!!!");
    					break;
    				}
    				else{
    					System.out.println("Invalid Input!!!");
    					y=1;
    				}
    			}
    		}
    		
		
    	
	
    }
    
    
    
    
}