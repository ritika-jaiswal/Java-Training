package org.example.practice.program;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizationDemo implements Externalizable {
    String s;
    int i;
    int j;

    public ExternalizationDemo() {
        System.out.println("No-argu construtor");
    }

    public ExternalizationDemo(String s, int i, int j) {
        this.s = s;
        this.i = i;
        this.j = j;
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(s);
        out.writeInt(i);
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        s = (String) in.readObject();
        i = in.readInt();
    }

    public static void main(String[] args) throws Exception {

        ExternalizationDemo etnrlDemo = new ExternalizationDemo("Ritika", 10, 20);
        FileOutputStream fos = new FileOutputStream("FileName.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(etnrlDemo);

        FileInputStream fis = new FileInputStream("FileName.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ExternalizationDemo extrnl1 = (ExternalizationDemo) ois.readObject();

        System.out.println(extrnl1.s + "......" + extrnl1.i + ".........." + extrnl1.j);
    }
}
