package org.example.serialzation.serialversionuid;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Sender {
    public static void main(String[] args) throws Exception{
        UidDemo uidDemo = new UidDemo();

        FileOutputStream fos = new FileOutputStream("FileName.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(uidDemo);
    }
}
