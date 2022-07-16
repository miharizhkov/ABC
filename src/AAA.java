public class AAA {
    public static void main(String[] args) {
        // Уровень 1
        // Задача 1
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        String helloWorld = hi + world + newLine;
        String o = (hi.trim()+world.toLowerCase());
        System.out.println(o+newLine+o+newLine+o);
        // Задача 2
        double rost = 1.85;
        double ves = 85.3;
        double imt = ves / (rost * rost);
        System.out.println(imt);
        // Задача 3
        char[] p = {'a','b', 'c','d', 'e'};
        System.out.println(p);
        p[3] = 'h';
        System.out.println(p);
        // Уровень 2
        // Задача 1
        String i = "234";
        int v = Integer.parseInt(i.trim());
        System.out.println(v+"some_text".length());
        // Задача 2
        double a = 3;
        double b = 5;
        double c = Math.pow((a+b), 2);
        System.out.println(c);
    }
}
