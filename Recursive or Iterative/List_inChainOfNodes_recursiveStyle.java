/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes_recursiveStyle{
    private Node headReference;

    /**
      Construct an empty list
     */
	
     

    /**
      @return the number of elements in this list
     */
    public int size() {
		Node currentNode = headReference;
		if (currentNode == null){
			return 0;
		}
		else {
			return 1 + currentNode.getReferenceToNextNode().size();
		}
    }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
		String result = "[";
		Node currentNode = headReference;
		if (currentNode == null){
			return "]";
		}
		else{
			
		}
		// while (currentNode != null){
			// result += currentNode.getCargoReference() + ",";
			// currentNode = currentNode.getReferenceToNextNode();
		// }
		// return result + "]";
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