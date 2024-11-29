
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public void InputStream()
{
    FileInputStream fis = null;
    try
    {
        File file = new File("hello.txt");
        fis = new FileInputStream(file);
        byte[] b = new byte[5];
        int len;
        while ((len = fis.read()) != -1)
        {
            for (int i = 0; i < len; i++)
                System.out.println((char)b[i]);
        }
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
    finally
    {
        if (fis != null)
        {
            try
            {
                fis.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}

public void OutputStream()
{
    File file = new File("hello.txt");
    FileOutputStream fos = null;
    try
    {
        fos = new FileOutputStream(file);
        fos.write(new String("I love China I love the world!").getBytes());
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
    finally
    {
        if (fos != null)
        {
            try
            {
                fos.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}

public void main() {
}