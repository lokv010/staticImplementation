

public class Main{
    /*why static is defined before void main(String[] args)?
     we declared it as static before main because it doesn't need an object to intantiate.  
     * 
     */
    public static void main(String[] args){
        human h1= new human("ramu",21);
        human h2= new human("somu",21);
    //intantiating singleton objetct
        snglton obj= snglton.getInstance();
        System.out.println(obj.toString());
        snglton obj1= snglton.getInstance();
        System.out.println(obj1.toString());

      
        System.out.println(h2.population);
        System.out.println(h2.h);
        
        /*static methods are not dependant
         on objects where as non static methods are dependant on objects
         to use or intantiate the static methods in non static  scope 
         they should be intantiated only through objects */
       Main m=new Main();
        m.greeting();

        /* the nonDependant method is a static method and hence it is not dependant on any object
         * to intantiate the static method we dont need any object as the static 
         * variable/methods are not dependant on objects by default
         */
        nonDependant();
        

        /*to use the innerExmpl class the object 
        has to be define as it is dependant on the human class */

    }
    //this is a non static method
    void greeting(){
        System.out.println("practising non-static");
        /* we can see here the static method is able to use in non-static methods
         * because it is not dependant or bindable to any class
        */
        nonDependant();
    }
    
    static void nonDependant(){
        /*when we try to use non-static method they haave to be initiated through the object as we
         * see  in the main method
         */
        // greeting();
        System.out.println("implementing static method");

    }
}
