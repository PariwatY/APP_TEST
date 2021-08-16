package com.example.appmantest;

import java.util.Scanner;

public class String2int {
    public static void main(String[] args) {

        int sum = 0;
        String Text="";
        Scanner String2int = new Scanner(System.in);  // Create a Scanner String2int
        System.out.print("Input: ");
        String userName = String2int.nextLine();
        for (int i = 0; i < userName.length();i++) {
            if(userName.charAt(i) >= 48 && userName.charAt(i) <= 57){
                Text = Text + userName.charAt(i);
            }
        }
        // Read user input
        System.out.println("Output: " + Text);  // Output Strin2Int input
    }

}
