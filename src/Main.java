public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

        var box1 = 78.2;
        var box2 = 82.7;
        var sunBox = box1 + box2;
        System.out.println("Общий вес" + sunBox + " кг вещей.");

        var rasBox = box2 - box1;
        System.out.println(" Разница весов" + rasBox);
        var rasBox2 = (box2 %  box1);
        System.out.println("Второй боец тяжелее" + rasBox2 + "кг." );

        var time = 640;
        var timeJob = 8;
        var employee = time / timeJob;
        System.out.println("Всего работников в компании работает" + employee + "человек");

        var humen = 94;
        var employee2 = employee + humen;
        System.out.println("Если в компании работает" + employee2 + "человек");
        var time2 = time / employee2;
        System.out.println("то всего" + time2 + "часов работы может быть поделено между сотрудниками");









    }
}