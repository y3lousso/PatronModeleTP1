package tp1.question2;

public class MainQuestion2 
{
    public static void main( String[] args )
    {
        Bank b1 = new Bank();
        
        Client c1 = new Client("Jean-Marie");
        Client c2 = new Client("Elise");
        
        b1.SetInterest(1f); // None has subscribe to this bank so it does no effect
        
        c1.Subscribe(b1);
        c2.Subscribe(b1);
        
        b1.SetInterest(1.5f); // c1 and c2 are notified
        
        c1.Unsubscribe();
        
        b1.SetInterest(2f); // only c2 is notified
               
    }
}
