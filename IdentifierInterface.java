package assignment1;

public interface IdentifierInterface {
    /*
    Elements: characters of type char
    Structure: Linear
    Domain: Only alphanumeric characters, identifier begins with a letter,
            identifier has length of at least 1 character
     constructors
        * Identifier(); *
    *   PRE  -
    *   POST -A new Identifier has been made and contains an undefined value
    *
    *  Identifier
    *   PRE  -  *
    *       POST - A new Identifier-object has been made and contains a copy of src
    *
    */

	
    void init(char c);
    /* PRE  - char c is an alphanumeric character
       POST - Identifier has one char, char c
     */

    void add(char c);
    /* PRE  - char c is an alphanumeric character
       POST - the char falls inside the domain and is added to set with length+1       		  
     */

    int size();
    /* PRE  -
       POST - the number of chars in the identifier has been returned.
     */

    boolean equals(Identifier comparand);
    /* PRE  -
       POST - succes: The value of this identifier is equal to the value of the argument identifier.
       		  failure: The value of this identifier is not equal to the value of the argument identifier.
     */
    
 
    String get();
    
    /* PRE  - 
       POST - identifier as string has been returned
     */
}