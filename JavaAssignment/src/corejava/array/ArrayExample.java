package corejava.array;

public class ArrayExample {

    public static void main(String[] args) {

        int tomAge = 33;
        int samAge =23;
        int lomAge = 43;

        int ages[] = new int[3];
        //or this way ....int ages2[] = {tomAge,samAge,lomAge}; or
       // int ages2[] = {33,23,43};
        ages[0] = tomAge;
        ages[1] = samAge;
        ages[2] = lomAge;


       // System.out.println("The Age is ************" + tomAge +"***************");
        //System.out.println("The Age is ************" + samAge +"***************");
        //System.out.println("The Age is ************" + lomAge +"***************");

       ArrayExample lome = new ArrayExample();
      // lome.printAge(lomAge);
       // lome.printAge(samAge);
       // lome.printAge(tomAge);
        lome.printAllAges(ages);

    }

    public void printAge(int age){
        System.out.println("Hello world ********** ");
        System.out.println("The Age is ************" + age +"***************");
        }

        public void printAllAges(int ages1[]){
            System.out.println("Hello world ********** ");
            for (int i=0; i< ages1.length; i++)
                System.out.println("The Age is ************" + ages1[i] + "***************");

        }

}
