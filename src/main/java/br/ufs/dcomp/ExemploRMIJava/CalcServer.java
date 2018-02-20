package br.ufs.dcomp.ExemploRMIJava;

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
/**
 * Hello world!
 *
 */
public class CalcServer {
    public static void main(String args[]) throws RemoteException, NotBoundException{
        Calc calc = new Calc();
        ICalc stub = (ICalc) UnicastRemoteObject.exportObject(calc, 6677);
        Registry registry = LocateRegistry.createRegistry(30000);
        registry.rebind("calculadora", stub);
    }
    
}
