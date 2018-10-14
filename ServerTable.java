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
public class ServerTable {
    public static void main(String[] arr) throws IOException{
        ServerSocket ss=new ServerSocket(8352);
        Socket s=ss.accept();
        Scanner scan=new Scanner(s.getInputStream());
        int num=scan.nextInt();
        int table=1;
        PrintStream p=new PrintStream(s.getOutputStream());
        for(int i=1;i<=10;i++){
            table = i*num;
            p.println(table);
        }
    }
}
