class Combination{                                          ///nCr=n!/(r!(n-r)!)

  public static void main(String[] args){
  
    int nCr=fact(5)/(fact(3)*fact(5-3));
	System.out.println(nCr);
  }
  public static int fact(int factNumber){
    int f=1;
	for(int i=1;i<=factNumber;i++){
	   f=f*i;
	}
  
  return f;
  }

}