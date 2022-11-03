import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
 class Source {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    // Declare the variable
    int a;

    // Read the variable from STDIN

    a = in.nextInt();
    int arr[]=new int[a];
    for(int i=0;i<arr.length;i++){
      arr[i]=in.nextInt();
    }

    for (int i = 0; i < arr.length; i++)
    {      //Loop over java Array  outer Loop use
      for (int j = i + 1; j < arr.length; j++)
      {  // Loop over java array
        int tmp = 0;                            //tempraory variable in order to compare.
        if (arr[i] < arr[j])
        {          //compare outer loop object with inner loop
          tmp = arr[i];               // if greater than swapping.
          arr[i] = arr[j];            // Swaping code here.
          arr[j] = tmp;
        }
      }
    }
    // After Sorting Printing The Value.............

    for (int i = 0; i < arr.length; i++)
    {
      System.out.println(arr[i]);
    }
  }
}