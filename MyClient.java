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
public class MyClient {
   public static void main(String[] arr) throws IOException{
       Socket s=new Socket("127.0.0.1",3438);
       Scanner clintInput=new Scanner(System.in);
       System.out.println("Enter A Number:");
       int num=clintInput.nextInt();
       PrintStream p=new PrintStream(s.getOutputStream());
       p.println(num);
       Scanner takeFromServer=new Scanner(s.getInputStream());
       int temp=takeFromServer.nextInt();
       System.out.println("Result :"+temp);
   }
}
