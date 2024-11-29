//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public void InputStream() {
//    FileReader fr = null;
//    try {
//        fr = new FileReader("D:\\test.txt");
//        char[] buf = new char[1024];
//        int len = 0;
//        while ((len = fr.read(buf)) != -1)
//        {
//            System.out.println(new String(buf, 0, len));
//        }
//    }
//    catch (IOException e)
//    {
//        System.out.println("read-Exception:" + e.toString());
//    }
//    finally
//    {
//        if (fr != null)
//        {
//            try
//            {
//                fr.close();
//            }
//            catch (IOException e)
//            {
//                System.out.println("close-Exception:" + e.toString());
//            }
//        }
//    }
//}
//
//public void OutputStream()
//{
//    FileWriter fw = null;
//    try
//    {
//        fw = new FileWriter("test.txt");
//        fw.write("test");
//    }
//    catch (IOException e)
//    {
//        System.out.println(e.toString());
//    }
//    finally
//    {
//        if (fw != null)
//            try
//            {
//                fw.close();
//            }
//        catch (IOException e)
//        {
//            System.out.println(e.toString());
//        }
//    }
//}
//
//public void main() {
//}
