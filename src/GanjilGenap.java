public class GanjilGenap {
    public static void main(String[] args) {
        int[] angka = {1,2,3,4,5,6};

        System.out.println("Bilangan Ganjil: ");
        for(int i = 0; i < angka.length; i++) {
            if (angka[i] % 2 != 0) {
                System.out.println(angka[i]);
            }
        }

        System.out.println("Bilangan Genap: ");
        for(int i = 0; i < angka.length; i++) {
            if (angka[i] % 2 == 0) {
                System.out.println(angka[i]);
            }
        }
    }
}
