package org.example.serialzation;

import java.io.*;

public class ExternalizationDemo implements Externalizable {
    String name = "Ritika Jaiswal";
    int age = 22;
    String gender = "Female";


    public ExternalizationDemo(){
        System.out.println("public No-argu construtor");
    };
    public ExternalizationDemo(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //this two methods is used for externalization
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(name);
            out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String)in.readObject();
        age = in.readInt();
    }

    public static void main(String[] args) throws Exception{
        ExternalizationDemo externalizationDemo = new ExternalizationDemo();
        FileOutputStream fos = new FileOutputStream("FileName.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(externalizationDemo);

        FileInputStream fis = new FileInputStream("FileName.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ExternalizationDemo ed = (ExternalizationDemo)ois.readObject();

        System.out.println(ed.name+ "......" + ed.age + "......." + ed.gender);

    }
}
