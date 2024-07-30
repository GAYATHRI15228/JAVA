public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b= 20;
        String name = "weqrgr";
        {
            // int a = 78; // already initialized ouside the block in the same method , hence you cannot initilize
            a= 100;// reassign the origin ref variable to same other value
            System.out.println(a);
            int c=45;
            name = "nyunyr";
            System.out.println(name);
            //value initialised in the block , will remain in block
        }
        System.out.println(a);
        
    }

}
