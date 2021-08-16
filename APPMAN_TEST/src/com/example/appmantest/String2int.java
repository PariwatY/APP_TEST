package com.example.appmantest;

import java.util.Scanner;

public class String2int {
    public static void main(String[] args) {

        int sum = 0;
        String Text="";
        Scanner String2int = new Scanner(System.in);  // Create a Scanner String2int
        System.out.print("Input: "); // Input Text Ex: abc573
        String String2int2 = String2int.nextLine();  //Keep input Value in String2int2
        for (int i = 0; i < String2int2.length();i++) {  //Loop Check Value in String2int2
            if(String2int2.charAt(i) >= 48 && String2int2.charAt(i) <= 57){  //If String2int2 is integer then add String2int2 to Text
                Text = Text + String2int2.charAt(i);
            }
        }
        // Read user input
        System.out.println("Output: " + Text);  // Output Strin2Int input
    }

}
