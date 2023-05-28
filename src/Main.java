import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Declarations
        Scanner input= new Scanner(System.in);
        float sec, hours2,hours3, min1,min,min2,min3, sec2,sec3;
        int hours,seconds,minutes, seconds2;

//Inputs

        System.out.println("Enter an amount of seconds:");
        sec= input.nextFloat();

//Process

        seconds= (int) sec;
        min1= sec/60; //total amount of minutes
        hours2= min1/60;// total amount of hours
        hours= (int)(hours2); //  actual amount of hours
        hours3= (float)hours2-hours; // remaining hours
        min3= hours3*60;//converts number of partial remaining hours to whole minutes
        min= (int)min3; // gives the actual remaining minutes
        min2= min3 - min; //  gives remaining seconds in minutes format
        sec3=min2*60; //  gives actual remaining seconds in seconds format
        sec2=(int)(sec3); //remaining seconds without decimals
        minutes= (int)min;
        seconds2=(int)sec2;

//Outputs

        System.out.println("You entered "+seconds+" seconds.");// amount of seconds that was entered
        System.out.println(+seconds+" would be "+hours+" hours, "+minutes+" minutes and "+seconds2+" seconds.");

    }
}