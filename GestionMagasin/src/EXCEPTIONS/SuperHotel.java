package EXCEPTIONS;



public class SuperHotel {
    static int x[];


    public void reserver(){
    
              x[0] = 1;     
    }
    
    public static void main(String args[]) {
        
        SuperHotel s = new SuperHotel();
        try
        {
        s.reserver();
        }
        catch (NullPointerException e)
        {
            System.out.println("Nous avons trouver les exceptions NullPointerException");
        }
        finally
        {
            System.out.println("Travail Parfait");
        }
        }
}

