package fileHandling;

import java.io.*;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
        File file = new File("myDemoFile.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeUTF("My name is Ankan Mukherjee. Today I am learning File Handeling");

        FileInputStream fileInputStream = new FileInputStream(file);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        System.out.println(dataInputStream.readUTF());
    }
}
