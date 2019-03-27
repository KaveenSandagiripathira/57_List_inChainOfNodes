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
		int size = 0;
		Node currentNode = headReference;
		while (currentNode != null){ 
			size++;
			currentNode = currentNode.getReferenceToNextNode();
		}
		return size;
    }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
		String result = "[";
		Node currentNode = headReference;
		while (currentNode != null){
			result += currentNode.getCargoReference() + ",";
			currentNode = currentNode.getReferenceToNextNode();
		}
		return result + "]";
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
	 
	 public Object set(int index, Object value){
		 int counter;
		 Node currentNode;
		 for (counter = 0, currentNode = headReference; 
		 counter != index; 
		 counter++, currentNode = currentNode.getReferenceToNextNode()){ 
		 }
		 currentNode.setCargoReference(value);
		 return value;
	 }
	 
	 
	 public Object get(int index){
		Node currentNode;
		int counter;
		for (counter = 0, currentNode = headReference;
		counter != index;
		counter++, currentNode = currentNode.getReferenceToNextNode()){
		}		
		 return currentNode.getCargoReference();
		 
	 }
	 
	 
	 public boolean add(int index, Object value){
		 if (index == 0){
			 addAsHead(value);
		 }
		 else{
			 Node currentNode;
			 int counter;
			 Node newNode = new Node(value);
			 for (counter = 0,currentNode = headReference;
			 counter != index - 1 ;
			 counter ++,currentNode = currentNode.getReferenceToNextNode()){
			 }
			 Node tempNextNode = currentNode.getReferenceToNextNode();
			 currentNode.setReferenceToNextNode(newNode);					 
			 newNode.setReferenceToNextNode(tempNextNode);
		 }
		 return true;
		 
	 }
	 
	 public boolean remove(int index){
		 if (index == 0){
			 headReference = headReference.getReferenceToNextNode();
		 }
		 else{
			Node currentNode;
			int counter;
			for (counter = 0, currentNode = headReference;
			counter != index - 1;
			counter ++, currentNode = currentNode.getReferenceToNextNode()){
				
			}
			Node nextNode = currentNode.getReferenceToNextNode();
			currentNode.setReferenceToNextNode(nextNode.getReferenceToNextNode());
		 }
		 return true;                                                                                                                              
	 }
}