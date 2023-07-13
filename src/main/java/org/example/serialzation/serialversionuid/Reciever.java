package org.example.serialzation.serialversionuid;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Reciever {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("FileNAme.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        UidDemo ud = (UidDemo)ois.readObject();

        System.out.println(ud.i+ "......" + ud.j);
    }
}
