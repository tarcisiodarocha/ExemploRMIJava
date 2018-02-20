package br.ufs.dcomp.ExemploRMIJava;

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
/**
 * Hello world!
 *
 */
public class CalcClient {
    public static void main(String args[]) throws RemoteException, NotBoundException{
        Registry registry = LocateRegistry.getRegistry(30000);
        ICalc calc = (ICalc) registry.lookup("calculadora");
        System.out.println(calc.add(2,3));
    }
    
}
