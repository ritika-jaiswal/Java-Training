package org.example.practice.program;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable {
    String name = "RitikaJaiswal";
    transient String pass = "Mummy";
    transient int pinNo = 1234;

    private void writeObject(ObjectOutputStream os) throws Exception {
        os.defaultWriteObject();
        String enpas = "123" + pass;
        int enPinNo = 4444 + pinNo;
        os.writeObject(enpas);
        os.writeInt(enPinNo);

    }

    private void readObject(ObjectInputStream is) throws Exception {
        is.defaultReadObject();
        String enpas = (String) is.readObject();
        pass = enpas.substring(3);
        int enPinNo = is.readInt();
        pinNo = enPinNo - 4444;
    }

}

public class CustSerializable {
    public static void main(String[] args) throws Exception {
        Account account = new Account();
        System.out.println(account.name + "............" + account.pass + ".................." + account.pinNo);
        FileOutputStream fos = new FileOutputStream("FileName.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(account);

        FileInputStream fis = new FileInputStream("FileName.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account acnt = (Account) ois.readObject();
        System.out.println(acnt.name + ".................." + acnt.pass + "....................." + acnt.pinNo);
    }

}
