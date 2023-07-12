package org.example.serialzation;

import java.io.*;

class Account1 implements Serializable{
    String email = "Rjaiswal@123Gmail.com";
    transient String password = "Rjaiswal";

    private void writeObject(ObjectOutputStream os) throws Exception{
        os.defaultWriteObject();
        String enpsw = "123" + password;
        os.writeObject(enpsw);
    }

    private void readObject(ObjectInputStream is) throws Exception{
        is.defaultReadObject();
        String enpswd = (String)is.readObject();
        password = enpswd.substring(3);

    }
}
public class CustSerializableEx2 {
    public static void main(String[] args) throws  Exception {
        Account1 account = new Account1();

        System.out.println("Before Serialization: " + "Email: " + account.email + "Password: " + account.password);
        FileOutputStream fos = new FileOutputStream("FileName.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(account);

        FileInputStream fis = new FileInputStream("FileName.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account1 acnt = (Account1) ois.readObject();

        System.out.println("After Serialization: " + "Email: " + acnt.email + "Password: " + acnt.password);
    }
}
