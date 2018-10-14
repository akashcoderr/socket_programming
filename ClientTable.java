/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket.demo;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author The Robust Coder
 */
public class ClientTable {
    public static void main(String[] arr) throws IOException{
        Socket s=new Socket("127.0.0.1",8352);
        Scanner scan1=new Scanner(System.in);
        System.out.println("Enter A Number For Table:");
        int number=scan1.nextInt();
        PrintStream p=new PrintStream(s.getOutputStream());
        p.println(number);
        Scanner scan2=new Scanner(s.getInputStream());
        System.out.println("Table Is :");
        for(int i=0;i<10;i++){
             int table=scan2.nextInt();
            System.out.println(table);
        }
       
    }
}
