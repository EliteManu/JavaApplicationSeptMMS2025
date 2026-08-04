
package abstraction;


public class TestMe {
    public static void main(String[] args){ 
        Student student1 = new  Student("Lamine", "Yamal",
                "34251609", "Barcelona Catanolia", 101 );
        
        
        student1.read();
        System.out.println("==============\n");
        student1.study();
        
    }
}
