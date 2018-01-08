public class Tutorial6 {
    public static void main(String[] args) {

        int myInt = 20;

        if (myInt < 18) {
            System.out.println("yes, it's true!");
        }
        else {
            System.out.printf("no it's false");
        }

        int loop = 0;

        while (loop < 5) {
            System.out.println("looping: " + loop);

            if(loop == 5) {
                break;
            }

            loop++;
        }
    }
}
