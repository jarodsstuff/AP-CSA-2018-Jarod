
public class Cat extends Animal {
	private boolean tail;
    private static String type;
    
    public Cat(){
        this( true, "Cat"); 
    }
    
    public Cat( boolean t, String s ){
        setTail( t );
        setType( s );
    }
    
    public void setTail( boolean t ){
        tail = t;
    }
    
    public void setType( String s ){
        type = "Cat";
    }
    
    public String getTail(){
        return ( tail == true ) ? "Yes": "No";
    }
    
    public static String getType(){
        return "sub " + type;
    }
}
