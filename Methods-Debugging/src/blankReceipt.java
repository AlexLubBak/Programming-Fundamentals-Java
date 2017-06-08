/**
 * Created by Compworld on 6/8/2017.
 */
public class blankReceipt {

    public static void main(String[] args) {

        PrintReceiptHeader();
        PrintReceiptBody();
        PrintReceiptFooter();

    }

    static void PrintReceiptHeader()
    {
        System.out.println("CASH RECEIPT");
        System.out.println("------------------------------");
    }

    static void PrintReceiptFooter()
    {
        System.out.println("------------------------------");
        System.out.println("\u00a9 SoftUni");
    }

    static void PrintReceiptBody()
    {
        System.out.println("Charged to____________________");
        System.out.println("Received by___________________");
    }
}
