package org.example.serialzation;

import java.io.*;

class UserData implements Serializable {
    String email = "Rjaiswal@123Gmail.com";
    transient String password = "Rjaiswal";

}
public class TransiantEx {
    public static void main(String[] args) throws Exception {
        UserData userData = new UserData();

        FileOutputStream fos = new FileOutputStream("FileName.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(userData);

        FileInputStream fis = new FileInputStream("FileName.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        UserData ud = (UserData)ois.readObject();

        System.out.println("Before Serialization: " + "Email: " + userData.email + "Password: " + userData.password);

//        Becuz of the transiant keyword there may be aLoss information, At the time of Serialization JVM ignores Original Value
//        of transiant Variables and save Default value to the file
        System.out.println("After Serialization: " + "Email: " + ud.email + "Password: " + ud.password);
    }


}
