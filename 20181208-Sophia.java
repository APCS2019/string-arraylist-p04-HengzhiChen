/** @param parts an ArrayList of string parts that are valid in the master string * Precondition: parts.size() > 0	
	* @return the string obtained by concatenating the parts of the master string
	*/
	    public String decodeString(ArrayList<StringPart> parts){
	        String dcd = "";
	        for(int i = 0;i<parts.size();i++){
	             int strt = getStart(parts.get(i));
	             int lgth = getLength(parts.get(i));
	             dcd += masterString.indexOf(strt, strt+lgth);
	            }
	         return dcd;
	         }
	
	
	/** @param word the string to be encoded
	* Precondition: all of the characters in word appear in the master string;
	* word.length() > 0
	* @return an ArrayList of string parts of the master string that can be combined * to create word
	*/
	       public ArrayList<StringPart> encodeString(String word)
	           ArrayList all = new ArrayList<StringPart>();
	           int i = 1;
	           while( i < word.length){
	                i = getLength(findPart(word));
                	all.add(findPart(word));
	                word = word.substring(i-1);
	           }
	          return all;
