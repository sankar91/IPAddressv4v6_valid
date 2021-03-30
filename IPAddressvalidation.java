package main.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sample {
    public static void main(String args[]) throws IOException {
        String IP = "null";
        boolean length_flag = true, start_end_flag = true, dot_flag = true, alphaFlag = false;
        int dot_counter = 0;
        System.out.println("Enter the IP Address");
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        IP = br.readLine();
        char[] ch = new char[IP.length()];
        // Copy character by character into array
        for (int i = 0; i < IP.length(); i++) {
            ch[i] = IP.charAt(i);
        }
        //Check the number of characters is more than 15 digits
        if(IP.length()>15){
            length_flag = false;
        }
        //Check with the number of dot present in the IP address
        if(IP.startsWith(".")||IP.endsWith("."))
        {
            start_end_flag = false;
        }
        //Count the number of dot values present in the Input address
        for(int i=0; i< IP.length();i++){
            if(ch[i]=='.'){
                dot_counter++;
            }
        }
        //Check the number of dot present in the ip addres
        if(dot_counter != 3)
        {
            dot_flag = false;
        }
        //Check any alphabets present in the ip address
        for(int i=0;i<IP.length();i++) {
            if ((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z')) {
                alphaFlag = true;
            }
        }
        //If any of the flag is set then make the address as valid IP otherwise mark as Invalid IP
        if(length_flag&&start_end_flag&&dot_flag&&(!alphaFlag))
            {
                System.out.println("Valid IP");
            }
        else
        {
            System.out.println("Invalid IP");
        }
        }
        }

