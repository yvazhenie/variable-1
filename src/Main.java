public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println (dog);
        var cat = 3.6;
        System.out.println (cat);
        var paper = 763789;
        System.out.println (paper);
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
        frog = frog + 4;
        System.out.println(frog);
        var firstBoxer = 78.2;
        System.out.println(firstBoxer);
        var secondBoxer = 82.7;
        System.out.println(secondBoxer);
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес " + totalWeight + " кг");
        var differenceFirstWeight = secondBoxer - firstBoxer;
        System.out.println("Разница в весе двух бойцов " + differenceFirstWeight + " кг");
        var differnceSecondWeight = secondBoxer % firstBoxer;
        System.out.println("Остаток от деления " + differnceSecondWeight + " кг");
        var timeFistCase = 640;
        System.out.println(timeFistCase);
        var profOnePeople = 8;
        System.out.println(profOnePeople);
        var employees = timeFistCase / profOnePeople;
        System.out.println("Всего работников в компании " + employees + " человек");
        var newEmployees = 94;
        var totalEmployees = employees + newEmployees;
        var timeSecondCase = totalEmployees * profOnePeople;
        System.out.println("Если в компании " + totalEmployees + " человек, то всего " + timeSecondCase + " часов работы может быть поделено между сотрудниками");

    }
}