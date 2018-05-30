import java.util.ArrayList;
import java.util.List;

public class SparseArray {
	/** The number of rows and columns in the sparse array. */
	  private int numRows;
	  private int numCols;
	  
	  /**
	   * The list of entries representing the non-zero elements of the sparse array. Entries are stored in the
	   * list in no particular order. Each non-zero element is represented by exactly one entry in the list.
	   */
	  private List<SparseArrayEntry> entries;

	  /** Constructs and empty sparse array. */  
	  public SparseArray()
	  {
	    entries = new ArrayList<SparseArrayEntry>();
//		SparseArrayEntry entries = new SparseArrayEntry(2, 0, 1 );
	  }

	  /** adds values for Sparse Array **/
	  public void add( int r, int c, int val ){
		  SparseArrayEntry entry = new SparseArrayEntry(r, c, val );
		  entries.add(entry);
		  
	  }
	  
	  /** Returns the number of rows in the sparse array. */
	  public int getNumRows()
	  { return numRows; }

	  /** Returns the number of columns in the sparse array. */
	  public int getNumCols()
	  { return numCols; }

	  // Part (a)
	  
	  public int getValueAt(int row, int col)
	  {
	    for (SparseArrayEntry e : entries)
	      if (e.getRow() == row && e.getCol() == col)
	        return e.getValue();
	    return 0;
	  }
	  
	  public String toString(){
		  StringBuilder result = new StringBuilder();
		  for (SparseArrayEntry e : entries){
			  result.append(e.toString() + "\n" );
		  }
		  return result.toString();
	  }

	  // Part (b)

	  public void removeColumn(int col)
	  {
	    for (int i = entries.size() - 1; i >= 0; i--)
	    {
	      SparseArrayEntry e = entries.get(i);
	      int c = e.getCol();
	      if (c == col)
	        entries.remove(i);
	      else if (c > col)
	          entries.set(i, new SparseArrayEntry(e.getRow(), c-1, e.getValue()));
	    }
	    numCols--;
	  }   
}
