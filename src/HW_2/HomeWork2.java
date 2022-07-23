package HW_2;

public class HomeWork2 {
    public static void main(String[] args) {
        // Задача 1
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "a ");
        }
        System.out.println();
        //Задача 2
        int ageChildren = 9;
        if (ageChildren < 6) {
            System.out.println("пошел в сад");
        }
            else if (ageChildren > 6 && ageChildren < 11) {
            System.out.println("пошел в младшую школу");
        }
                else if (ageChildren >11 && ageChildren <17) {
            System.out.println("пошел в среднюю школу");
        }
            else if (ageChildren >17) {
                System.out.println("пошел в универ");
            }
        // Задача 3
        boolean chicken = false;
        boolean vegetables = false;
        boolean sour = false;
        boolean toast = false;
        boolean sausage = false;
        boolean eggs = false;
        boolean cesar = chicken && vegetables && sour && toast;
        boolean olievie = vegetables && (sausage || chicken) && eggs;
        boolean vegetables_salad = vegetables;
        boolean net = !chicken && !vegetables && !sour && !toast && !sausage && !eggs;
        if (cesar) {
            System.out.println("цезарь");
            }
        else if (olievie) {
            System.out.println("оливье");
        } else if (vegetables_salad) {
            System.out.println("овощной");
        } else if (net) {
            System.out.println("ничего нет");
        }
    }
    }





