/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket.demo;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author The Robust Coder
 */
public class FactorialServer {
    public static void main(String[] arr) throws IOException{
        ServerSocket ss=new ServerSocket(3883);
        Socket s=ss.accept();
        Scanner scan=new Scanner(s.getInputStream());
        int temp=scan.nextInt();
        int fact=1;
        if(temp==0){
            fact=1;
        }else{
            for(int i=1;i<=temp;i++){
                fact=fact*i;
            }
        }
        PrintStream p=new PrintStream(s.getOutputStream());
        p.println(fact);
    }
}
