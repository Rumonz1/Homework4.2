public class Main {
    public static void main(String[] args) {
        int age =42;
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
        } else if (kinderGarden) {
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в детский сад!");
        }
    }
}