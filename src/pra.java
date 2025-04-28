public class pra {
    public static void main(String[] args) throws Exception {
        System.out.println("啥都沒有~?");
        int sum = 0;
        int[] bingo={10, 24, 38, 41, 57, 68, 87, 94, 97};
        for (int i = 0; i < bingo.length; i++) {
            sum = sum + bingo[i];
        }
        System.out.println(sum);


    }
}