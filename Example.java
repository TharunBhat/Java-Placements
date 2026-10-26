abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("barking");
    }
}
class Example{
    public static void main(String[] args){
        Dog d=new Dog();
        d.eat();
        d.sound();
    }
}