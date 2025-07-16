class fruit{
    String name;
    String teste;
    void eat(){
        System.out.println(name + " teste " + teste);
    }
}
class Apple extends fruit{
    Apple(){
        name = "Apple";
        teste = "Sweet";
    }
    @Override
    void eat(){
        System.out.println(name + " tastes sweet and crunchy");
    }
}
class Orange extends fruit{
    Orange(){
        name = "Orange";
        teste = "Sweet";
    }
    @Override
    void eat(){
        System.out.println(name + " tastes tangy and juicy ");
    }
}
public class Overriding {
    public static void main(String [] args){
       Apple a = new Apple();
       a.eat();
       Orange o = new Orange();
       o.eat();
    }
}
