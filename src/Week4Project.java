
public class Week4Project {

	public static void main(String[] args) {
		//1.
		//Create the array
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		//Print the last minus the first. The last is returned by doing the length-1.
		System.out.println(ages[ages.length-1]-ages[0]);
		//the following creates a new  array with 9 objects.
		int[] ages2 = new int[9];
		//add some age values
		ages2[0] = 5;
		ages2[1] = 12;
		ages2[2] = 25;
		ages2[3] = 48;
		ages2[4] = 6;
		ages2[5] = 18;
		ages2[6] = 30;
		ages2[7] = 75;
		ages2[8] = 100;
		//Use the Previous code to show that it can use different array lengths 100 - 5 = 95
		System.out.println(ages2[ages2.length-1]-ages2[0]);
		//No to calculate the average using a for loop
		//create a variable to do the additon to.
		int ages2Sum = 0;
		//loop through the ages2
		for(int i = 0;i<ages2.length;i++) {
			ages2Sum+=ages2[i];
		}
		System.out.println(ages2Sum/ages2.length);
		//2.
		//Create an array of Strings
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//set as a double because i want the fractional ability when i print out the average. other wise i would have don a seperate variable that is an integer.
		double nameLength = 0;
		for(int i = 0; i<names.length;i++) {
			nameLength+=names[i].length();
		}
		//5.
		System.out.println(nameLength);
		//6.
		System.out.println(nameLength/names.length);
		//Create a StringBuilder called allNames
		StringBuilder allNames = new StringBuilder();
		//using the shorter way of doing a for loop
		for (String name : names) {
			// Add the name with a space to allNames
			allNames.append(name + " ");
		}
		System.out.println(allNames.toString().trim());
		//3. return the last object in the array
		System.out.println(names[names.length-1]);
		//4. retrun the first object in the array.
		System.out.println(names[0]);
		
		//7.
		concatinator("Hello",5);
		
		//8. call the method that concatinates the first and last name to make a full name.
		fullName("John","Ragland");
		
		//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		int[] numbers1 = {30,20,60,10};
		boolean results = Greater(numbers1);
		System.out.println(results);
		//10. Write a method that takes an array of double and returns the average of all the elements in the array.
		double[] numbers2 = {30.4,25.6,17.8,44.5};
		System.out.println(average(numbers2));
	//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		double [] numbers3 = {34.6,24.5,10.0};
		double[] numbers4 = {37.2,26.3,11.4};
		boolean results3 = arrayAverage(numbers3,numbers4);
		System.out.println(results3);
	//12.
		 boolean result4 = willBuyDrink(false, 8.00);
	        System.out.println("It's not hot outside, and I have $8.00. Will I buy a drink? " + result4);
	      //13. I like to go biking, but i hate it when it is hot and windy. If the temp is below 80 and the wind is below 10 mph i like to ride.
			boolean myResult = willGoBiking(79,8);
			System.out.println("I want to ride my bike, Can I? " + myResult);
	        
	}
	
	
	
	
	
	
	public static void concatinator(String word,int n) {
		
		StringBuilder wordBuilder = new StringBuilder();
		
		for(int i = 0;i<n;i++) {
			wordBuilder.append(word);
		}
		System.out.println(wordBuilder);
	};
	
	//Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	
	public static void fullName(String first, String second) {
		StringBuilder fullName = new StringBuilder();
		fullName.append(first + " " + second);
		System.out.println(fullName);
	}
	
	//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean Greater (int[] values) {
		int sumOfValues = 0;
		for(int i = 0;i<values.length;i++) {
			sumOfValues+=values[i];
		}
		
			return sumOfValues>100;
		
	}
	//Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double average (double[] myArray) {
		
		double sumOfValues1 = 0;
		for(int i = 0;i<myArray.length;i++) {
			sumOfValues1+=myArray[i];
		}
		return sumOfValues1/myArray.length;
	}
	//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	public static boolean arrayAverage(double[]array1,double[]array2) {
		double sumArray1 = 0;
		double sumArray2 = 0;
		for(double numbers: array1) {
			sumArray1+=numbers;
		}
		for(double numbers2:array2) {
			sumArray2+=numbers2;
		}
		return sumArray1/array1.length>sumArray2/array2.length;
		
	}
	//12.
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }
	//13.
	public static boolean willGoBiking(int tempOutside, int windSpeed) {
		return tempOutside<80 && windSpeed<10;
	}
	

}
