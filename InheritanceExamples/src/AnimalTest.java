
public class AnimalTest {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
        Animal animal2 = new Animal( 2, 2, "Bird" );
        Cat animal3 = new Cat();
        Cat animal4 = new Cat( false, "Cat" );   // Bobcat
        Animal animal5 = new Cat( true, "Pig" );
        
        System.out.println( "Animal1 " + animal1 );       
        System.out.println( "Animal2 " + animal2 );       
        System.out.println( "Animal3 " + animal3 );
       
 //     System.out.println();
        System.out.print( "Animal1:   ");
        System.out.print( "legs = " + animal1.getLegs() );
        System.out.print( "\tears = " + animal1.getEars() );
        System.out.print( "\thead = " + animal1.getHead() );
        System.out.print( "\ttype = " + animal1.getType() );
 //     System.out.print( "\ttail = " + animal1.getTail() );
        System.out.println();

        System.out.print( "Animal2:   ");
        System.out.print( "legs = " + animal2.getLegs() );
        System.out.print( "\tears = " + animal2.getEars() );
        System.out.print( "\thead = " + animal2.getHead() );
        System.out.print( "\ttype = " + animal2.getType() );
//      System.out.print( "\ttail = " + animal2.getTail() );
        System.out.println();
       
        System.out.print( "Animal3:   ");
        System.out.print( "legs = " + animal3.getLegs() );
        System.out.print( "\tears = " + animal3.getEars() );
        System.out.print( "\thead = " + animal3.getHead() );
        System.out.print( "\ttype = " + animal3.getType() );
        System.out.print( "\t\ttail = " + animal3.getTail() );
        System.out.println();
           
        System.out.print( "Animal4:   ");
        System.out.print( "legs = " + animal4.getLegs() );
        System.out.print( "\tears = " + animal4.getEars() );
        System.out.print( "\thead = " + animal4.getHead() );
        System.out.print( "\ttype = " + animal4.getType() );
        System.out.print( "\t\ttail = " + animal4.getTail() );
        System.out.println();
        
        System.out.print( "Animal5:   ");
        System.out.print( "legs = " + animal5.getLegs() );
        System.out.print( "\tears = " + animal5.getEars() );
        System.out.print( "\thead = " + animal5.getHead() );
        System.out.print( "\ttype = " + animal5.getType() );
//      System.out.print( "\ttail = " + animal5.getTail() );
        System.out.println();

	}

}
