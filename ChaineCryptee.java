
/**
 * Write a description of class ChaineCryptee here.
 * 
 * @author (KETAM) 
 * @version (02-10-2017)
 */
public class ChaineCryptee
{
    
    /**
     * Constructor for objects of class ChaineCryptee
     */
    private int decalage;
    private String enClair;
    public ChaineCryptee(String enCLair,int declage)
    {
        // initialise instance variables
        this.enClair=enClair;
        this.decalage=decalage;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   

   
    public String Decrypte()
    {
        return enClair;
    }
    
    public static char decaleCaractere ( char c , int decalage ) {
     return (c < 'A' || c > 'Z' ) ? c : (char) ((( c - 'A' + decalage)%26 ) + 'A');
    }

    public String Crypte()
    {
        String ch = "";
        int i;
        char c;
        for(i=0;i<enClair.length();i++)
           { c=decaleCaractere(enClair.charAt(i),this.decalage); 
             ch += c;}
        return ch;
    }
}
       


