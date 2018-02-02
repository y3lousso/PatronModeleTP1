package tp1.question2;


public class MainQuestion2 
{
    public static void main( String[] args )
    {
        Bank b1 = new Bank();
        Client c1 = new Client("Jean");
        
        b1.OpenNewAccountForClient(c1);
        
        b1.ChangeInterest(1.5f);
               
    }
}
