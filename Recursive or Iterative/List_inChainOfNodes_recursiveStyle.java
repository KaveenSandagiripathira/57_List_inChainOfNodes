/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */
	
     

    /**
      @return the number of elements in this list
     */
    public int size() {
		if (headReference == null){
			return 0;
		}
		else {
			List_inChainOfNodes smallerList = new List_inChainOfNodes();
			smallerList.headReference = headReference.getReferenceToNextNode();
			return 1 + smallerList.size();
		}
    }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {

		return "[" + toString_recur();
    }
    
	public String toString_recur(){
		String output = "";
		if (headReference == null){
			return output += "]";
		}
		else{
			List_inChainOfNodes smallerList = new List_inChainOfNodes();
			smallerList.headReference = headReference.getReferenceToNextNode();
			return output += headReference.getCargoReference() + "," + smallerList.toString_recur(); 
		}
	}
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
		Node temp = headReference;
		headReference = new Node(val, temp);
        return true;
     }
}