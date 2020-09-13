package assignment1;

public interface SetInterface {
    /*
    * Elements: Object of the type Identifier
    * Structure: None
    * Domain: All elements must be unique, contains [0-MAX_NUMBER_OF_ELEMENTS] identifiers
    *
    * constructors
    *
    * Set();
    *   PRE  -
    *   POST - A new Set-object has been made and contains the empty set
    *
    * Set (Set src);
    *   PRE  -
    *   POST - A new Set-object has been made and contains a copy of src
    */

    int MAX_NUMBER_OF_ELEMENTS = 20;


    void init();
    /*  PRE -
        POST - The set is empty
     */

    
     void add(Identifier e) throws Exception;
    /*  PRE -
        POST - 
               Returns success if the element is in the set.
               Returns failure if the element was already present in set-PRE or set size exceeded 19.
     */

     String makeString();
     /*  PRE - set is not empty
         POST - set as string has been returned 
    */            
                
                
    Identifier get();
    /*  PRE -  set is not empty
        POST - An element from the set has been returned.
               
     */

    boolean contains(Identifier e);
    /*  PRE -
        POST -  success: The set contains the identifier passed as argument.
                failure: The set does not contain identifier passed as argument.
     */

    int size();
    /*  PRE -
        POST - The amount of elements in the set has been returned.
     */

    boolean equals(Set s);
    /*  PRE -
        POST -  success: Argument set and this set are the same size and contain the same elements.
                failure: Argument set and this set are not the same size or do not contain the same elements.
     */

    
    boolean isEmpty();
    	/*  PRE - 
    		POST - success: set was empty
    			   failure: set was not empty
    	 */	
    
    
    
    Set union(Set s) ;
    /*  PRE -
        POST - A set containing the union of the argument set and this has been returned.
        	   success: union of two set is returned
        	   failure: amount of elements exceeds maximum number of elements
     */

    Set difference(Set s);
    /*  PRE -
        POST - A set containing the difference of the argument and this has been returned.
     */

    Set intersection(Set s);
    /*  PRE -
        POST - A set containing the intersection of the argument set and this has been returned.
     */

    Set symDifference(Set s);
    /*  PRE -
        POST - A set containing the symmetric difference between the argument set and this has been returned.
        	   success: symmetric difference of two set is returned
        	   failure: amount of elements exceeds maximum number of elements
     */
}