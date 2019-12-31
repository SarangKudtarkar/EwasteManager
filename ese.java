import java.util.*;
class customer
{
protected String name;
Scanner q=new Scanner(System.in);
}
class contact extends customer
{
contact()
{
System.out.println("");
System.out.println("Ecoreco - E-Waste Recycling, Electronic Waste Recyclers");
System.out.println("422, The Summit Business Bay, Opp Cinemax Theatre, Near WEH Metro Station,      Andheri Kurla Road, Andheri East, Mumbai, Maharashtra 400093");
System.out.println("phone:022 4005 2951");
System.out.println("");

}
}
class quiz extends customer
{
quiz(String name)
{
this.name=name;
    int score=0;int ans=-1;int check=0;


System.out.println("Q1. What is E-Waste?");
System.out.println("1. Edible Waste");
System.out.println("2. Easter Waste");
System.out.println("3. Electronic Waste");
System.out.println("4. Eternal Waste");
System.out.println("Enter 1/2/3/4 for answering");




try
{
    ans=q.nextInt();
    if(ans==3)
{
  System.out.println("Correct!");score=score+1;
}
else
{
  System.out.println("Incorrect");
}

}
catch(InputMismatchException e)
{
    System.out.println("");
    System.out.println("enter valid input");check=1;
}


System.out.println("Q2.How is e-waste dangerous?");

System.out.println("1. They degrade over time, releasing cancer-causing chemicals into the air.");

System.out.println("2. Lead and mercury in components can cause metabolic changes in users.");

System.out.println("3. They leach toxic metals in landfills and into ground water.");

System.out.println("4. They create electromagnetic fields that interfere with animal reproduction.");
System.out.println("Enter 1/2/3/4 for answering");
try
{
    ans=q.nextInt();
    if(ans==3)
{
  System.out.println("Correct!");score=score+1;
}
else
{
  System.out.println("Incorrect");
}

}
catch(InputMismatchException e)
{
    System.out.println("");
    System.out.println("enter valid input");check=1;
}

System.out.println("Q3.What country produces the most e-waste?");
System.out.println("1. United States");
System.out.println("2. Canada");
System.out.println("3. India");
System.out.println("4. China");
System.out.println("Enter 1/2/3/4 for answering");
try
{
    ans=q.nextInt();
    if(ans==4)
{
  System.out.println("Correct!");score=score+1;
}
else
{
  System.out.println("Incorrect");
}

}
catch(InputMismatchException e)
{
    System.out.println("");
    System.out.println("enter valid input");check=1;
}
System.out.println("Q4.There is more copper in a tonne of mobile phones than a tonne of copper ore. True or False?");
System.out.println("1. true");
System.out.println("2. false");
System.out.println("Enter 1/2 for answering");
try
{
    ans=q.nextInt();
    if(ans==1)
{
  System.out.println("Correct!");score=score+1;
}
else
{
  System.out.println("Incorrect");
}

}
catch(InputMismatchException e)
{
    System.out.println("");
    System.out.println("Enter valid input");check=1;
}

if(check==0)
{
    System.out.println("");
System.out.println(name+" you have answered "+score+" questions correctly.");
System.out.println("");
}

}
}
class info extends customer
{
info(String name)
{
this.name=name;
System.out.println("");
System.out.println("-The amount of E-waste produced each year in the world is about 50 million tons, and it keeps growing by 4% each year.");
System.out.println("-The amount of e-waste being produced could rise by as much as 500% in developing countries like India, within the next ten years.");
System.out.println("-Recycling e-waste will help in home space management, prevent pollution, and   conserve natural resources, since materials required for manufacture can be     directly obtained from recycling.");
System.out.println("Hurry up!Get rid of old e-devices and earn money and discounts on new products.");
System.out.println("");
}
}
class estimate extends customer
{
estimate(String name)
{
this.name=name;
int Comp,Mob,Other,w,sum;int check=0;
Comp=50;sum=0;
Mob=40;
Other=45;
System.out.println("Enter amount of computer in kg");
try
{
w=q.nextInt();
sum=sum+(Comp*w);
}
catch(InputMismatchException e)
{
    System.out.println("");
    System.out.println("Enter valid input");check=1;
}
System.out.println("Enter amount of Mobile Devices in kg");
try
{
    w=q.nextInt();
sum=sum+(Mob*w);
}
catch(InputMismatchException e)
{
    System.out.println("");
    System.out.println("Enter valid input");check=1;
}
System.out.println("Enter amount of other e-devices in kg");
try
{
    w=q.nextInt();
sum=sum+(Other*w);
}
catch(InputMismatchException e)
{
    System.out.println("");
    System.out.println("Enter valid input");check=1;
}

if(check==0)
{
    System.out.println("");
System.out.println("Estimated amount is Rs."+sum);
System.out.println("");
}

}
}

class schedule extends customer
{
   schedule(String name)
   {
       this.name=name;String address,mark,phone;
       System.out.println("Enter address");
address=q.nextLine();
System.out.println("Enter landmark");
mark=q.nextLine();
System.out.println("Enter phone number");
phone=q.next();

System.out.println("");
System.out.println("Address:"+address);
System.out.println("Landmark:"+mark);
System.out.println("Phone number:"+phone);

System.out.println("Thanks for your response!");
System.out.println("");
   }
}



public class ese{
	public static void main(String args[]){
	int n=0;String name;char check;

	Scanner s=new Scanner(System.in);
	    System.out.println("***************************** E-waste manager ********************************");
	System.out.println("Welcome!Please enter your name");
	name=s.nextLine();
	System.out.println("");
	System.out.println("Hi "+name+"!");
	System.out.println("");



do
{
System.out.println("");
	System.out.println("Enter 1 for estimating cost");
	    System.out.println("Enter 2 for contact information");
	    System.out.println("Enter 3 to play e-waste quiz");
	    System.out.println("Enter 4 to know more about e-waste");
	    System.out.println("Enter 5 to schedule pick-up");
System.out.println("Enter 6 to exit");


try
{
    n=s.nextInt();
}
catch(InputMismatchException e)
{
    System.out.println("");
    System.out.println("Enter valid input");break;
}
	switch(n)
	{
	case 1:estimate a=new estimate(name);break;
	case 2:contact b=new contact();break;
	case 3:quiz c=new quiz(name);break;
	case 4:info d=new info(name);break;
	case 5:schedule e=new schedule(name);break;
	case 6:break;
	default:System.out.println("Enter valid input.");


}






}

	while(n!=6);



System.out.println("Thanks for visiting!Have a nice day.");
}




}





