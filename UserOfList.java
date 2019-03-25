/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println( "number of elements: " + list.size() );
        
        // the spec requests that toString include the size
        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        /* Populate the list with elements.
           Create the test data in an array, for the programming
           convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
               for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println( "populated list: " + list
                          + System.lineSeparator());
						  
		//Test the set method
		list.set(3,"t");
		System.out.println("set method, Stuy to Stut: " + list);
		System.out.println("get method, t expected: " + list.get(3));
		list.add(0, "b");
		System.out.println("add method, at start (bStut): " + list);
		list.add(5, "s");
		System.out.println("add method, at end (bStuts): " + list);
		list.add(4, "m");
		System.out.println("add method, at middle (bStumts): " + list);
		list.remove(0);
		System.out.println("remove method, at start (Stumts): " + list);
		list.remove(3);
		System.out.println("remove method, at middle (Stuts): " + list);
		list.remove(4);
		System.out.println("remove method, at end (Stut): " + list);
		list.set(3, "y");
		System.out.println("set method, at start (Stuy): " + list);
		
    }
}
