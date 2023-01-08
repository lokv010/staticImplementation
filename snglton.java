public class snglton {
    
    /*main goal of singleton is the 
    reference object can only be able to create on object of the class */
    private static snglton instance;
    private snglton(){

    }

    public static snglton getInstance(){
        if(instance==null){
            instance=new snglton();

        }
        return instance;

    }
}
