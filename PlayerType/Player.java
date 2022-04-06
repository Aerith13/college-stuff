class player
{
String name;
int level;
player(String n,int l){
     name=n; level=l; 
    }

    void show(){
    System.out.println("\n");
    System.out.println("Player name : "+name);
    System.out.println("Max level : "+level);
}
}

    class one extends player
{
    String type;
    one(String n,String num,int l)
{
    super(n,l);
    type=num;
}
    public void show()
{
    super.show();
    System.out.println("Player number : "+type);
}
}
    class two extends player
{
    String type;
    two(String n,String num,int l)
{
    super(n,l);
    type=num;
}
    public void show()
{
    super.show();
    System.out.println("Player number : "+type);
}
}
    class three extends player
{
    String type;
    three(String n,String num,int l)
{
    super(n,l);
    type=num;
}
    public void show()
{
    super.show();
    System.out.println("Player number : "+type);

}
}