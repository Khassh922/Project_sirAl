import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n---    Population in 2024  ---");
        System.out.print("Baragay San nicolas how many people?: ");
        int san_nicolas = scanner.nextInt();
        System.out.print("Baragay Magdalo how many people? : ");
        int magdalo = scanner.nextInt();
        System.out.print("Baragay Gustillo how many people?: ");
        int gustillo = scanner.nextInt();
        System.out.print("Baragay Mabini how many people?: ");
        int mabini = scanner.nextInt();
        System.out.print("Baragay Baldoza how many people?: ");
        int baldoza = scanner.nextInt();

        System.out.println("\n---2025 in Lapaz Population ---");

        int barangay_magdalo = 560;
        int barangay_san_nicolas = 1200;
        int barangay_baldoza = 1600;S
        int barangay_gustillo = 2300;
        int barangay_mabini = 240;

        System.out.println("Baragay Magdalo: " + barangay_magdalo);
        System.out.println("Baragay San nicolas: " + barangay_san_nicolas);
        System.out.println("Baragay Mabini: " + barangay_baldoza);
        System.out.println("Baragay Baldoza: " + barangay_magdalo);
        System.out.println("Baragay Gustillo: " + barangay_gustillo);

        int kill = barangay_magdalo + barangay_san_nicolas + barangay_baldoza + barangay_gustillo + barangay_mabini;
        System.out.println("2024 total: " + kill);
        int fell = san_nicolas + magdalo + gustillo + mabini + baldoza;
        System.out.println("2025 total: " + fell);
        int lol = kill - fell;
        System.out.println("total sum population: " + lol);

        scanner.close();


        {

        }
    }
}