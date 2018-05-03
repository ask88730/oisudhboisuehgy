import java.util.Scanner;
public class pocker {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int times = Integer.parseInt(sc.nextLine());
        for (int k = 0; k < times; k++) {
            String str = sc.nextLine();
            String Mystr[] = str.split(" ");
            int[] values = new int[Mystr.length];
            for (int i = 0; i < Mystr.length; i++) {
                if (Mystr[i].charAt(0) == 'C') {
                    values[i] = 0;
                } else if (Mystr[i].charAt(0) == 'D') {
                    values[i] = 100;
                } else if (Mystr[i].charAt(0) == 'H') {
                    values[i] = 200;
                } else if (Mystr[i].charAt(0) == 'S') {
                    values[i] = 300;
                }
                values[i] = values[i] + Integer.parseInt(Mystr[i].substring(1));
            }
            {
                int temp;
                for (int i = 0; i < values.length; i++) {
                    for (int j = i + 1; j < values.length; j++) {
                        if (values[i] < values[j]) {
                            temp = values[i];
                            values[i] = values[j];
                            values[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < values.length; i++) {
                    //System.out.print(values[i] + "  ");
                    if (values[i] > 300) {
                        System.out.print("S" + (values[i] - 300) + " ");
                    } else if (values[i] > 200) {
                        System.out.print("H" + (values[i] - 200) + " ");
                    } else if (values[i] > 100) {
                        System.out.print("D" + (values[i] - 100) + " ");
                    } else {
                        System.out.print("C" + (values[i]) + " ");
                    }
                }System.out.println();
            }
        }
    }
}


