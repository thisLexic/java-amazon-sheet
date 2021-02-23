System.out.println('printme')

Integer.parseInt()
Double.parseDouble()

long - integers
double - floats

Math.round()
Math.ceil()
Math.floor()
Math.max()

import java.util.Scanner
Scanner scanner = new Scanner(system.in)
String string = scanner.nextLine - read a line



import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    HashMap<String, Integer> capitalCities = new HashMap<String, Integer>();
    capitalCities.put("England", 231);
    capitalCities.put("Germany", 456);
    capitalCities.put("Norway", 54);
    capitalCities.put("USA", 43);
    System.out.println(capitalCities); 
    System.out.println(capitalCities.size()); 
    System.out.println(capitalCities.get("England")); 
    
    // Print keys
    for (String i : capitalCities.keySet()) {
      System.out.println(i);
    }


    // Print values
    for (Integer i : capitalCities.values()) {
      System.out.println(i);
    }

  }
}



import java.util.ArrayList;
import java.util.Collections;

public class Main { 
  public static void main(String[] args) { 
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    cars.set(0, "Opel");
    System.out.println(cars.get(0));
    System.out.println(cars.size());
    
    
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }
    
    Collections.sort(cars);
    System.out.println("");
    
    for (String i : cars) {
      System.out.println(i);
    }
  } 
}


=== watermelon, input, string to double convertion

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double in = Double.parseDouble(scanner.nextLine());

    if (in == 2.0) {
        System.out.println("NO");
    } else {
        double out = in / 2.0;
        if (Math.floor(out) == out){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
    
    
  }
}

===

=== long words, string indexing, string length, for loop

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int inputCount = Integer.parseInt(scanner.nextLine());
    
    for (int i = 0; i < inputCount; i++) {
        String string = scanner.nextLine();
        int stringLength = string.length();
        if (stringLength > 10){
            String middle = (stringLength - 2) + "";
            System.out.println(string.charAt(0) + middle + string.charAt(string.length() - 1));
        } else {
            System.out.println(string);
        }
    }
  }
}

===


=== coding team, arraylist, split, convert array to arraylist, counting occurances of values in arraylist


import java.util.Scanner;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int inputCount = Integer.parseInt(scanner.nextLine());
      
      int totalCorrectCount = 0;
      for (int i = 0; i < inputCount; i++){
          String string = scanner.nextLine();
          String[] arrStr = string.split(" ");
          List<String> arrayList = new ArrayList<String>();
          Collections.addAll(arrayList, arrStr);
          int correctCount = Collections.frequency(arrayList, "1");
          if (correctCount >= 2){
              ++totalCorrectCount;
          }
      }
      System.out.println(totalCorrectCount);
  }
}


===

=== array, string to int converstion, for loop

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String string1 = scanner.nextLine();
      String string2 = scanner.nextLine();
      String[] arrStr1 = string1.split(" ");
      String[] arrStr2 = string2.split(" ");
      
      int place = Integer.parseInt(arrStr1[1]);
      int score = Integer.parseInt(arrStr2[place - 1]);
      
      int output = 0;
      for (String i : arrStr2) {
          int iInt = Integer.parseInt(i);
          if (iInt >= score && iInt > 0){
              ++output;
          }
      }
      
      System.out.println(output);
  }
}

=== string manipulation, lower case, remove character, basic array

import java.util.Scanner;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String string = scanner.nextLine();
      String lower = string.toLowerCase();
      
      String[] vowels =  {"a", "e", "i", "o", "u", "y"};
      String remove = lower;
      for (String s : vowels){
        remove = remove.replaceAll(s, "");
      }
      
      String[] removeList = remove.split("");
      String period = "";
      for (String s : removeList){
          period = period + "." + s;
      }
      System.out.println(period);
  }
}

===

=== array sort, string substring

import java.util.Scanner;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] array = string.split("\\+");
        Arrays.sort(array);
        String output = "";
        for (String s : array) {
            output = output + s + "+";
        }
        output = output.substring(0, output.length() - 1);
        System.out.println(output);
    }
}

// capitalize, substring
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		String capitalize = "";
		if (string.length() > 1){
		    capitalize = string.substring(0, 1).toUpperCase() + string.substring(1);
		} else if (string.length() == 1){
		    capitalize = string.substring(0, 1).toUpperCase();
		}
		
		System.out.println(capitalize);
	}
}

// string equals
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = Integer.parseInt(scanner.nextLine());
		String[] arrStr = scanner.nextLine().split("");
		
		int removeCount = 0;
		String current = "";
		for (String s : arrStr){
		    if (current.equals(s)){
		        ++removeCount;
		    } else {
		        current = s;
		    }
		}
		
		System.out.println(removeCount);
	}
}

// set size, modulo, odd/even
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] strArr = scanner.nextLine().split("");
		Set<String> strSet = new HashSet<>(Arrays.asList(strArr));
		int size = strSet.size();
		if (size%2 == 0){
		    System.out.println("CHAT WITH HER!");
		} else{
		    System.out.println("IGNORE HIM!");
		}
	}
}



// array indexing

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valCount = Integer.parseInt(scanner.nextLine());
		
		int x = 0;
		int y = 0;
		int z = 0;
		for (int i = 0; i < valCount; i++){
		    String[] strArr = scanner.nextLine().split(" ");
		    x = x + Integer.parseInt(strArr[0]);
		    y = y + Integer.parseInt(strArr[1]);
		    z = z + Integer.parseInt(strArr[2]);
		}
		
		if (x == 0 && y == 0 && z == 0){
		    System.out.println("YES");
		} else {
		    System.out.println("NO");
		}
    }
}


// character
import java.util.*;
  
public class Main
{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    String correct = "hello";
    int loc = 0;
    boolean isSuccess = false;
    Character c = new Character('a');
    Character cor = new Character('a');
    
    for (int i = 0; i < s.length(); i++){
        c = s.charAt(i);
        cor = correct.charAt(loc);
        if (c.equals(cor)){
            ++loc;
        }
        
        if (loc == 5){
            isSuccess = true;
            break;
        }
    }
    
    if (isSuccess){
        System.out.println("YES");
    } else {
        System.out.println("NO");
    }
    }
}

// comparing chars

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int length = Integer.parseInt(scanner.nextLine());
	    String s = scanner.nextLine();
	    
	    char c = 'a';
	    boolean b = true;
	    int aCount = 0;
	    int dCount = 0;
	    for (int i = 0; i < length; i++){
	        c = s.charAt(i);
	        b = c == 'A';
	        if (b){
	            ++aCount;
	        }else{
	            ++dCount;
	        }
	    }
	    
	    if (aCount == dCount){
	        System.out.println("Friendship");
	    } else if (aCount > dCount){
	        System.out.println("Anton");
	    }else{
	        System.out.println("Danik");
	    }
	    
	    
	}
}

// while loop



hashmap?
add to arraylist?

Set<String> set = new HashSet<>(Arrays.asList(array));
