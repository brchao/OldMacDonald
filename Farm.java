class Farm  {     
   private Animal[] aBunchOfAnimals = new Animal[3];    
   public Farm()     
   {        
      aBunchOfAnimals[0] = new NamedCow("cow","Elsie","moo");
      if(Math.random()<.5)           
      aBunchOfAnimals[1] = new Chick("chick","cluck"); 
      else
      aBunchOfAnimals[1] = new Chick("chick","cheep");      
      aBunchOfAnimals[2] = new Pig("pig","oink");    
   }         
   public void animalSounds()    {       
     for (int nI=0; nI < aBunchOfAnimals.length; nI++)       {          
       System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());       
     }    
   } 
}