//displaying the use of an array in java 
//array creation in java is a two step process 1.Initialization 2.alloting memory using 'new' keyword
//here is an example to store number of days in 12 diffn months 

public class arr1{
    public static void main(String [] args){
     //initializing and alloting memory in same line of code 
     int [] month_days = new int[12];
     month_days[0] = 31; 
     month_days[1] = 28; 
     month_days[2] = 31; 
     month_days[3] = 30; 
     month_days[4] = 31; 
     month_days[5] = 30; 
     month_days[6] = 31; 
     month_days[7] = 31; 
     month_days[8] = 30; 
     month_days[9] = 31; 
     month_days[10] = 30; 
     month_days[11] = 31;  
     String [] month_name = new String[12];
     month_name[0] = "january";
     month_name[1] = "Februray";
     month_name[2] = "March";
     month_name[3] = "April";
     month_name[4] = "may";
     month_name[5] = "june";
     month_name[6] = "july";
     month_name[7] = "august";
     month_name[8] = "september";
     month_name[9] = "october";
     month_name[10] = "november";
     month_name[11] = "december";
    for(int i = 0 ;i<12;i++){
     System.out.println( month_name[i]+ " has " + month_days[i] +" days");
    }
    }
}