/**
  Represent a node that holds...
  o  cargo of interest to the user
  o  reference to the next node in the list
 */

public class Node {
    private Object cargoReference;
    private Node   referenceToNextNode;


    /**
      Construct an instance
     */
    public Node( Object cargoReference) {
		this.cargoReference = cargoReference;
    }
    public Node( Object cargoReference, Node referenceToNextNode) {
		this(cargoReference);
		this.referenceToNextNode = referenceToNextNode;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
		String result = cargoReference + " id " + super.toString();
		for (Node nextNode = referenceToNextNode ; nextNode != null ; nextNode = nextNode.getReferenceToNextNode()){
				 result += " --> " + nextNode.cargoReference + " id " + super.toString();
			 }
		result += " [no next]";
        return result;
    }

    // classic accessor and mutator
    public Node getReferenceToNextNode() {
		return referenceToNextNode;
    }

    public void setReferenceToNextNode( Node referenceToNextNode) {
		this.referenceToNextNode = referenceToNextNode;
    }
	
	public Object getCargoReference() {
		return cargoReference;
    }
}