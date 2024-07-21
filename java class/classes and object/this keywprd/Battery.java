class Battery{
  String id;
  String weigth;
  String name;
  
  public void charge(){
  System.out.println("It is used to charge the battery");
  
  }
  
  public boolean createDetails(String id,String weigth,String name){
  boolean isDataCreated = false;
  if(id!=null && weigth!=null && name!=null){
	this.id =id;
    this.weigth  =weigth;
    this.name  =name;
	isDataCreated = true;
  }
  return isDataCreated;
  }
  
  public void getDetails(){
	  System.out.println("The Battery id is "+this.id);
	  System.out.println("The Battery weigth is "+this.weigth);
	  System.out.println("The Battery name is "+this.name);
	  


}
}