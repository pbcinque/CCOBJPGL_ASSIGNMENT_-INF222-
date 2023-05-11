public class App {
    public static void main(String[] args) throws Exception {
        
        Pomsky myPet = new Horgi();

        myPet.bark();
        System.out.println(myPet.eyeColor);
        System.out.println(myPet.height);
    }
}
