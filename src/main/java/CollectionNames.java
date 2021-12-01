// ენუმერაცია 3 წევრით
public enum CollectionNames {
    LIST("ArrayList"),
    MAP("HashMap"),
    SET("HashSet");

    private String collectionNames;

    CollectionNames(String collectionNames){
        this.collectionNames = collectionNames;
    }

    @Override
    public String toString(){
        return this.collectionNames;
    }

    public static void Letsgo(){
        for (CollectionNames i : CollectionNames.values()){
            System.out.println(i);
        }
    }
}