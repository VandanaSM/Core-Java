class Permutation{                                          ///permutation nPr=n!/(n-r)!

  public static void main(String[] args){
  
    int nPr=fact(5)/fact(5-2);
	System.out.println(nPr);
  
  }
  
  public static int fact(int factNumber){
    int f=1; 	
	for(int i=1;i<=factNumber;i++){
		f = f*i;
	}
  return f;
  }

}