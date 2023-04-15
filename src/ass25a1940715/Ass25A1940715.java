//Date:31/10/2019     Name: Abdulaziz Altamimi  
//ozyaltamimi261@gmail.com
//Assaigment 2
//Section: 5A     iD:1940715

package ass25a1940715;

import java.util.Scanner;


public class Ass25A1940715 {
public static void drawLine(int len){
       
      {
		for(int i=0; i<len; i++) {
			System.out.print("-");
		}
		System.out.println();
	}  
   
        
        
       
    }
    public static void displayWelcomeMessage(){
    System.out.println("“Welcome to the Food ordering system. Please place your order using the menu below\"");
    
}
   public static boolean isPhoneNumberOK(long phone){
       String getphone="" +phone;
       String getphone1= getphone.substring(0,4);
       if(getphone.length()==12 && getphone1=="9665")
           
           
           return true;
                   else
           return false;
           
       
               
       
       
   }
   public static long getPhoneNumber(){
       Scanner input=new Scanner(System.in);
       long Numberofphone=0;
        do{
           
            System.out.println("Please enter your phone number : ");
            Numberofphone=input.nextLong();
            if(isPhoneNumberOK(Numberofphone)==true)
                break;
           
          
        }while(true);
           
           return Numberofphone;
    }
       
        
       
         
  
   public static boolean isZipCodeOK(int len){
        return (len <= 29999 && len> 20001);   
   }    
    public static int getZipCode(){
        Scanner input=new Scanner(System.in);
       int zip;
       do{
           
            System.out.println("“Please enter your zipcode : : ");
            zip=input.nextInt();
            if(isZipCodeOK(zip)==true)
                break;
           
          
        }while(true);
        return zip;
    }
        
    
    public static double displayOrderMenu(){
         Scanner input=new Scanner(System.in);
        while (true){
                
                System.out.println("---------------------------------------------");        
                System.out.println("                Food Menu");
                System.out.println("---------------------------------------------");
                System.out.println("1. Chicken Burger             12 SR ");
                System.out.println("2. Beef Burger                15 SR");
                System.out.println("3.Mac and Cheese              10 SR");
                System.out.println("4.Cesar Salad                 11 SR");
                System.out.println("5. House Salad                10 SR");
                System.out.println("6. Fries                      7  SR");
                System.out.println("7. Soft drink                 3  SR");
                int Choice_or;
                
                do{
                System.out.print("Enter your choice (1 to 7) or -1 to exit: ");
                 Choice_or=input.nextInt(); 
                 if (Choice_or == -1){
                     System.out.println("   ");
                    System.out.println("         Your total order is:  " + (sum));
                    System.out.println("   ");
                    break;}
                }while(Choice_or<1 || Choice_or>7);
                if(Choice_or==-1)
                    break;
                
                do{
                    System.out.print("Enter quntity : ");
                    quintity=input.nextInt();
                }while(quintity<1);
        }
    }
    public static double getCouponDiscount(String coupon){
        if(coupon.length()==6){
            for( int count =4; count < coupon.length(); count++){
                if (Character.isDigit(coupon.charAt(count))){
                    goodzip=true;
                }    
                else{
                    goodzip=false;
                System.out.println("0");
                break;
                    }
                } 
        }
    
    }

static int quintity ;
static double  price;
static String name;
static String phone;
static double dis;
static double sum ;
static boolean goodphone;
static boolean goodzip;
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      //Main menu
        do{
        
        System.out.println("-------------------------------------------------");
        System.out.println("         welcome           ");
        System.out.println("-------------------------------------------------");
        System.out.println("a. Food Ordering");
        System.out.println("b. Delivery");
        System.out.println("c Summary and Exit");
        System.out.print("Please enter you choice:");
        char choice=input.next().charAt(0);
            
        //Food Menu
        switch(choice){
            case 'a':
                while (true){
                
                System.out.println("---------------------------------------------");        
                System.out.println("                Food Menu");
                System.out.println("---------------------------------------------");
                System.out.println("1. Chicken Burger             12 SR ");
                System.out.println("2. Beef Burger                15 SR");
                System.out.println("3.Mac and Cheese              10 SR");
                System.out.println("4.Cesar Salad                 11 SR");
                System.out.println("5. House Salad                10 SR");
                System.out.println("6. Fries                      7  SR");
                System.out.println("7. Soft drink                 3  SR");
                int Choice_or;
                
                do{
                System.out.print("Enter your choice (1 to 7) or -1 to exit: ");
                 Choice_or=input.nextInt(); 
                 if (Choice_or == -1){
                     System.out.println("   ");
                    System.out.println("         Your total order is:  " + (sum));
                    System.out.println("   ");
                    break;}
                }while(Choice_or<1 || Choice_or>7);
                if(Choice_or==-1)
                    break;
                
                do{
                    System.out.print("Enter quntity : ");
                    quintity=input.nextInt();
                }while(quintity<1);
                
                if(Choice_or==1)
                 price=12;
                else if(Choice_or==2)
                    price=15;
                else if(Choice_or==3)
                    price=10;
                else if(Choice_or==4)
                    price=11;
                else if(Choice_or==5)
                    price=10;
                else if(Choice_or==6)
                    price=7;
                else if(Choice_or==7)
                    price=3;
                 else
                    price=0;
                
                 sum = sum + (quintity*price);
               
                }
                break;
                //Personal information
            case 'b':
                if (sum==0){
                    System.out.println("   ");
                    System.out.println("***********You have not ordered yet***********");
                    System.out.println("   ");
                break;}
                
                while(true){
                
                System.out.print("Enter your full name(first and last name) : ");
                 name=input.next();
                name += input.nextLine();
                
          
                System.out.print("Enter you phone number : ");
                 phone=input.next();
                
                
                System.out.println("Fill in your address information : ");
                System.out.print("Enter your building number : ");
                int building=input.nextInt();
                System.out.print("Enter your street name : ");
                input.nextLine();
                String street=input.next();
                System.out.print("Enter City : ");
                input.nextLine();
                String city=input.next();
                System.out.print("Enter zip code: ");
                String zip=input.next();
                
                if(phone.length()==10){
                    for( int count =0; count < phone.length(); count++){
                        if (Character.isDigit(phone.charAt(count)))
                            goodphone=true;
                        else{
                            goodphone=false;
                            break;
                        }
                    } 
                }    
                if(!(goodphone)){
                    System.out.println("  ");
                    System.out.println("Wrong Phone number. Enter again..");
                    System.out.println("  ");
                    continue;
                }
                    
                if(zip.length()==5){
                    for( int count =0; count < zip.length(); count++){
                        if (Character.isDigit(zip.charAt(count)))
                            goodzip=true;
                        else{
                            goodzip=false;
                            break;
                        }
                    } 
                }    
                if(!(goodzip)){
                    System.out.println("  ");
                    System.out.println("Wrong Zip code. Enter again..");
                    System.out.println("  ");
                    continue;
                }
                break;}
                //Coupon
                System.out.print("Enter coupon code (if any) : ");
                String coupon=input.next();
                switch(coupon){
                    case "FXER05":
                     dis= (Double.parseDouble(coupon.substring(4)))/100;
                     break;
                     case "FXER10":
                     dis= (Double.parseDouble(coupon.substring(4)))/100;
                     break;
                     case "FXER15":
                     dis= (Double.parseDouble(coupon.substring(4)))/100;
                     break;
                     case "FXER020":
                     dis= (Double.parseDouble(coupon.substring(4)))/100;
                     break;
                     default:
                         System.out.println("   ");
                         System.out.println("Your coupon code is not accepted");
                         System.out.println("   ");
                }
                System.out.println("   ");
                System.out.println("***********Thank you. We will deliver your order shortly*************");
                System.out.println("   ");
          break;      
              
        
        case 'c':
            if (sum==0 || phone==null){
                System.out.println("   ");
                System.out.println("***********You have not ordered yet***********");
                System.out.println("   ");
                break;}
            //Summary
        System.out.println("-----------------------------------------------------------\n" +
"                         Summary\n" +
"-----------------------------------------------------------");
         System.out.println("Your full name is " + name);
         System.out.println("Your phone number is " + phone);       
         System.out.println(" Your total order is:  " + (sum - ( dis * sum )));           
          System.exit(0);
          break;
        } 
        
    }while (true);
              
        
          
         
 }                     
}                                  
                 
                
                
                  
                
              
            
           


                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
    
    

