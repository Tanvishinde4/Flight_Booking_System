import java.util.*;
class FlightBooking
{
    public static void main(String args[])
    {
        int i,j,row,col;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-----FLIGHT SEAT BOOKING APP-----");

        char flight[][]={ {' ',' ',' '},{' ',' ',' ',' ',' '},{' ',' ',' ',' '}};

      while(flag)
      {

      
//-----------------------------------PRINT THE STRUCTURE-----------------------------------
         
        for(i=0; i<flight.length; i++)
         {
            System.out.print(i==0?"1.First":(i==1?"2.Business":"3.Economy"));
            System.out.print("(1-"+flight[i].length+"):");

            for(j=0;j<flight[i].length;j++)
            {
                System.out.print("["+flight[i][j]+"]");
            }
            System.out.println();
         } 
         System.out.println("----------------------------------"); 

//----------------------------------INPUT VALUES---------------------------------------
       System.out.println("Enter The class Number:");
       row = sc.nextInt();

       if(row<1||row>3)
       {
        System.out.println("Class Does Not Exist");
        continue;
       }

       System.out.println("Enter The Seat Number");
       col = sc.nextInt();

       if(col<1||col>flight[row-1].length)
       {
        System.out.println("Invalid Seat Number");
        continue;
       }

       if(flight[row-1][col-1]=='x')
       {
           System.out.println("Seat Already Booked");
           continue;
       }
        flight[row-1][col-1]='X';
        System.out.println("Seat Booked Successfully");
             
       } 
    }
}