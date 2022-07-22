class Functions1{
	boolean Myequals(String b,String a){
		for(int i=0;i<b.length();i++){
			if(b.charAt(i)!=a.charAt(i))
				return false;
		}
		return true;
	}
	boolean isPalindrome(String str){
        	int i=0,j=str.length()-1;
        	while(i<j){
            	        if (str.charAt(i)!=str.charAt(j))
                		return false;
	    		i++;
            		j--;
        	}
        	return true;
	}
	void printVowel(String a){
		String b[]=a.split(" ");
		int c=0;
		for(int i=0;i<b.length;i++){
			if("AEIOUaeiou".indexOf(b[i].charAt(0))!=-1){
				System.out.println(b[i]);
				c=1;
			}
		}
		if(c==0)
			System.out.println("Not present");
	}
	public static void main(String args[]){
		Functions1 ob=new Functions1();
		System.out.println(ob.Myequals("Ahan","Mondal"));
		System.out.println(ob.Myequals("Salt","Salt"));
		System.out.println(ob.isPalindrome("abba"));
	        System.out.println(ob.isPalindrome("Ahan"));
		ob.printVowel("Love For All, Hatred For None");
		ob.printVowel("Tough times never last but tough people do");
	}
}
