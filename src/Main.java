public class Main {

    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] fr = new int[list.length];

        int counter, visited = -1;

        for (int i = 0; i < list.length; i++) {

            counter = 1;

            for (int j = i + 1; j < list.length; j++) {

                if (list[i] == list[j]) {

                    counter++;
                    fr[j] = visited;

                }
            }
            if (fr[i] != visited) {
                fr[i] = counter;
            }
        }
        System.out.println("Tekrar Sayıları");
        for (int j = 0; j < fr.length; j++) {
            if (fr[j] != -1){
                System.out.println(list[j] + " sayısı " + fr[j] + " kere tekrar edildi.");
            }
        }
    }
}