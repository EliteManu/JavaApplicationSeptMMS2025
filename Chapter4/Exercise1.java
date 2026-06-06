public class Exercise1 {
    public static void main(String[] args) {
        
        int i = 1;
        while (i <= 10) {
            ++i;
        }
        System.out.println("a) i = " + i);

        double k;
        for (k = 0.1; k <= 1.0; k += 0.1)
            System.out.println("b) k = " + k);

        int n = 1; 
        switch (n) {
            case 1:
                System.out.println("c) The number is 1");
                break;
            case 2:
                System.out.println("c) The number is 2");
                break;
            default:
                System.out.println("c) The number is not 1 or 2");
                break;
        }

        n = 1;
        while (n <= 10)
            System.out.println("d) n = " + n++);
    }
}