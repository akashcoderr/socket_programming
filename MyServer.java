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
public class MyServer {
    public static void main(String[] arr) throws IOException{
        ServerSocket ss=new ServerSocket(3438);
        Socket s=ss.accept();
        Scanner scan=new Scanner(s.getInputStream());
        int number=scan.nextInt();
        int result=number*number*number;
        PrintStream p=new PrintStream(s.getOutputStream());
        p.println(result);
    }
}
