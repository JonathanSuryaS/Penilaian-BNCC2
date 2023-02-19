public class AplikasiKaryawan {

    private static ArrayList<Karyawan> daftarKaryawan = new ArrayList<Karyawan>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Silahkan pilih menu:");
            System.out.println("1. Insert data karyawan");
            System.out.println("2. View data karyawan");
            System.out.println("3. Update data karyawan");
            System.out.println("4. Delete data karyawan");
            System.out.println("5. Exit");
            System.out.print("Masukkan pilihan Anda (1-5): ");
            int pilihan = input.nextInt();
            input.nextLine(); // consume new line character

            switch (pilihan) {
                case 1:
                    insertKaryawan();
                    break;
                case 2:
                    viewKaryawan();
                    break;
                case 3:
                    updateKaryawan();
                    break;
                case 4:
                    deleteKaryawan();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid, silahkan masukkan pilihan 1-5.");
            }
        }
    }