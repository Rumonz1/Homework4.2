public class Main {
    public static void main(String[] args) {
        //Задание 1
        int age =3;
        boolean kinderGarden = age>=2 && age <=6;
        boolean school = age >=7&&age<=18;
        boolean university = age>18&age<24;
        boolean work = age >=24;
        if(work){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить на работу!");
        } else if (university) {
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в университет!");
        } else if (school) {
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в школу!");
        } else{
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в детский сад!");
        }
        //Задание 2
        int humanAge = 12;
        boolean canNotUseAttraction = humanAge < 5 && humanAge>=0;
        boolean canUseAttractionButWithAdult = humanAge >=5 && humanAge<14;
        boolean canUseAttraction = humanAge >= 14;
        if (canUseAttraction){
            System.out.println("Ребёнок может кататься на аттракционе без сопровождения взрослого.");
        } else if (canUseAttractionButWithAdult) {
            System.out.println("Ребёнок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else{
            System.out.println("Ребёнок не может кататься на аттракционе!");
        }
        //Задание 3
        int one=1;
        int two=2;
        int three=3;
        boolean oneBigger = three < one && two < one;
        boolean twoBigger = three <two && three < two;
        boolean threeBigger = two<three&&one<three;
        if (threeBigger) {
            System.out.println("Число " + three + ", бОльшее!");
        } else if (twoBigger) {
            System.out.println("Число "+two+", бОльшее");
        }else{
            System.out.println("Число "+one+", бОльшее!");
        }
    }
}