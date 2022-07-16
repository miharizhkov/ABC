public class AAA {
    public static void main(String[] args) {
        // Уровень 1
        // Задача 1
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        String helloWorld = hi + world + newLine;
        String o = (hi.trim() + world.toLowerCase());
        System.out.println(o + newLine + o + newLine + o);
        // Задача 2
        double rost = 1.85;
        int ves = 80;
        double imt = ves / (rost * rost);
        System.out.println(imt);
        // Задача 3
        char[] p = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(p);
        p[3] = 'h';
        System.out.println(p);
        // Уровень 2
        // Задача 1
        String i = "234";
        int v = Integer.parseInt(i.trim());
        System.out.println(v + "some_text".length());
        // Задача 2
        double a = 3;
        double b = 5;
        double c = Math.pow((a + b), 2);
        System.out.println(c);
        // Задача 3
        //int[] z = {1, 2, 5, 7, 10};
        //int[] g = {2, 3, 2, 17, 15};
        //int[] zg = {z[0], z[1], z[2], z[3], z[4], g[0], g[1], g[2], g[3], g[4], z[0] * g[0], z[1] * g[1], z[2] * g[2], z[3] * g[3], z[4] * g[4]};
        //for (int u : zg) {;
        // Задача 4
        String h = "Hello world";
        String hh = (h.replace('l', 'r'));
        String hhh = hh.toUpperCase();
        System.out.println(hhh.substring(0, 8));

        }
    }

