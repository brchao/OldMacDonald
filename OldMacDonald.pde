
public void setup()
{
	Cow c = new Cow("cow", "moo");   
    System.out.println(c.getType() + " goes " + c.getSound());
    Pig d = new Pig("pig", "oink");   
    System.out.println(d.getType() + " goes " + d.getSound());   
    Chick e = new Chick("chicken", "back home for thanksgiving");   
    System.out.println(e.getType() + " goes " + e.getSound());       
}

