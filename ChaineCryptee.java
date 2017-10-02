
/**
 * Write a description of class ChaineCryptee here.
 * 
 * @author (KETAM) 
 * @version (02-10-2017)
 */
public class ChaineCryptee
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ChaineCryptee
     */
    private int declage;
    private String enClair;
    public ChaineCryptee(String enCLair,int declage)
    {
        // initialise instance variables
        this.enClair=enClair;
        this.declage=declage;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String decrypte(){
       return enClair;
    }
    private static char decaleCarctere(char c, int declage){
       return (c < 'A' || c > 'Z')? c:(char)(((c= 'A'+ decalage)%26)+ 'A');
    }
    
    
       
}

