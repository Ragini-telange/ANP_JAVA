 public class ClassObj {

    public void display() {
        System.out.println("Hello, this is a method in ClassObj.");
    }
    public void show() {
        System.out.println("This is show method in ClassObj.");
    }
    public static void main(String[] args) {
        //create an instance of ClassObj
        ClassObj obj = new ClassObj();
        obj.display();
        obj.show();

    }
}