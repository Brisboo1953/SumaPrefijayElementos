public class Elementos {
    public static void main(String[] args) {
        int[] a2 = new int[args.length - 1];
        int x = Integer.parseInt(args[1]);
        System.out.println("Suma: " + x);
        for (int i = 1; i < args.length; i++) {
            a2[i - 1] = Integer.parseInt(args[i]);
        }boolean res = false;
        for (int i = 0; i < a2.length - 1; i++) {
            for (int j = i + 1; j < a2.length; j++) {
                if (a2[i] + a2[j] == x) {
                    res = true;
                    break;
                }
            }if (res) {
                break;
            }
        }if (res) {
            System.out.println("Si es ");
        } else {
            System.out.println("No es ");
        }
    }
}
