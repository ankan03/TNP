package fileHandling;

import java.io.*;

public class ObjectSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SaveObject saveObject = new SaveObject();
        saveObject.i = 10;

        File file = new File("myObjectStore.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(saveObject);

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        SaveObject saveObject1 = (SaveObject)objectInputStream.readObject();
        System.out.println("saveObject1: "+saveObject1.i);
    }
}

class SaveObject implements Serializable {
    int i;
}
