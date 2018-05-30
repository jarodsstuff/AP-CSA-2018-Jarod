
public class Animal {
	private int legs;
    private static final int HEAD = 1;
    private int ears;
    private static String type;
    
    public Animal(){
        this( 4, 2, "Animal");
    }
    
    public Animal( int l, int e, String t  ){
        setLegs( l );
        setEars( e );
        type = t;
    }
    
    public void setLegs( int l ){
        if( ( l == 2) || ( l == 4) )   // used if-else
            legs = l;
        else
            legs = 0;
    }
    
    public void setEars( int e ){
        ears = ( e == 2 ) ? e : 0 ;  // used ternary operator  
    }
    
    public void setType( String t ){
        type = "Dog";
    }
    
    
    public int getLegs(){
        return legs;
    }
    
    public int getEars(){
        return ears;
    }
    
    public int getHead(){
        return HEAD;
    }
   
    public static String getType(){
        return "super " + type;
    }
}
