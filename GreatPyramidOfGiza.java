//Great Pyramid Of Giza
import java.util.Scanner;
public class GreatPyramidOfGiza{
	public static void main(String[] args){

	double stonenumbers = 2300000.0;
	double noofyears = 23.0;
        double stonesize = 2.5; //size in tonnes
 
	double totalstonesize = stonenumbers * stonesize;

        double oneyearweight = totalstonesize/noofyears; //weight of pyramid per year
	double onehourweight = oneyearweight/(365 * 24); //weight of pyramid  per hour
	double oneminuteweight = onehourweight/60; //weight of pyramid  per minute

	System.out.printf("Estimated weight of the pyramid based on the number of stones used per year is %f%s%n ",oneyearweight,"tonnes");
	System.out.printf("Estimated weight of the pyramid based on the number of stones used per hour is %f%s%n ",onehourweight,"tonnes");	
	System.out.printf("Estimated weight of the pyramid based on the number of stones used per minute is %f%s%n ",oneminuteweight,"tonnes");
}
}

	
	

	
	