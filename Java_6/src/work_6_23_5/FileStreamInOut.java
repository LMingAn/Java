package work_6_23_5;


import java.io.*;

public class FileStreamInOut {
    public static void main(String[] args) {
        try
        {
            File inFile = new File("D:\\basic software\\IDEA Project\\Java_6\\src\\work_6_23_5\\file1.dat");
            File outFile = new File("D:\\basic software\\IDEA Project\\Java_6\\src\\work_6_23_5\\file2.dat");
            FileInputStream fis = new FileInputStream(inFile);
            FileOutputStream fos = new FileOutputStream(outFile);
            int c;
            while ((c = fis.read()) != -1)
            {
                fos.write(c);
            }
            fis.close();
            fos.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("FileStreamsTest:" + e);
        }
        catch (IOException e)
        {
            System.out.println("FileStreamTest:" + e);
        }
    }
}
