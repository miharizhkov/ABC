package HW_3;

import java.io.*;

public class Home_work_3 {
    public static void main(String[] args) throws IOException {
        Lada priora = new Lada();
        Toyota corolla = new Toyota();
        corolla.sound();
        corolla.drive();
        corolla.stop();
        priora.lumus();
        priora.breaking();


        FileReader fileReader  = new FileReader("C:\\Java\\ABC\\my_first_file.txt");
        String fileName2 = "C:\\Java\\ABC\\report.txt";

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()){
            String line = bufferedReader.readLine();
            System.out.print(line+" ");
        }
        fileReader.close();
        bufferedReader.close();
        Financial_record otchet = new Financial_record();
        System.out.println();
        System.out.println("доходы = " + otchet.incomes + ", " + "расходы = " + otchet.outcomes);
        //FileWriter fileWriter = new FileWriter();
        FileWriter fileWriter = new FileWriter(fileName2);
        fileWriter.write("доходы = " + otchet.incomes + ", " + "расходы = " + otchet.outcomes);
        fileWriter.flush();
        fileWriter.close();








    }

}
