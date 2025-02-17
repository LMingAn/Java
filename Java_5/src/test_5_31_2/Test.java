package test_5_31_2;

class MyException extends Exception
{
    static final long serialVersionUID = 1L;
    private int idnumber;

    public MyException(String message, int id)
    {
        super(message);
        this.idnumber = id;
    }

    public int getId()
    {
        return idnumber;
    }
}
public class Test {
    public void regist(int num) throws MyException
    {
        if (num < 0)
            throw new MyException("人数为负值，不合理", 3);
        else
            System.out.println("登记人数" + num);
    }

    public void manager()
    {
        try
        {
            regist(100);
        }
        catch (MyException e)
        {
            System.out.println("登记失败，出错种类" + e.getId());
        }
        System.out.println("本次登记操作结束");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.manager();
    }
}
