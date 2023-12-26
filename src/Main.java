public  class Main {
   public static void main(String[] args) {
   //wtite your code here
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
       paper = paper +4;
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

       var oneBoxer = 78.2;
       System.out.println(oneBoxer);
       var secondBoxer = 82.7;
       System.out.println(secondBoxer);
       var boxer = oneBoxer + secondBoxer;
       System.out.println("Общая масса " + boxer + " кг!");

       var weight = secondBoxer - oneBoxer;
       System.out.println("Разница веса " + weight + " кг!");
       var remainder = secondBoxer % oneBoxer;
       System.out.println("Остаток " + remainder + " кг!");

       var workingHours = 640;
       var hoursPerWorker = 8;
       var numOfWorkers = workingHours / hoursPerWorker;
       System.out.println("Всего в компании работников - " + numOfWorkers + " человек");

       var newNumOfWorkers = numOfWorkers + 94;
       var newWorkingHours = newNumOfWorkers * 8;
       System.out.println("Если в компании работает " + newNumOfWorkers + " то всего человек " + newWorkingHours + " часов может поделено между сотрудниками");




   }
}