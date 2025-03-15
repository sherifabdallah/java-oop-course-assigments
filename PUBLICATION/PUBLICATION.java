public class PUBLICATION
{
    private String title;
    private int year;
    private double price;

    public PUBLICATION() {
        this.title = "";
        this.year = 0;
        this.price = 0;
    }

    public PUBLICATION(String title, int year, double price) {
        this.title = title;
        this.year = year;
        this.price = price;
    }


    public void print() {
        System.out.println("Title: " + this.title);
        System.out.println("Year: " + this.year);
        System.out.println("Price: " + this.price);
    }

    @Override
    public String toString() {
        return "PUBLICATION : " + this.title;
    }

    public static void main(String[] args) {
        BOOK b1 = new BOOK("Java Programming", 1995, 385, 150);
        TAPE t1 = new TAPE("Learn Java Tutorial", 2025, 200, 12);


        System.out.println("Book Details: ");
        b1.print();
        System.out.println("ToString: " + b1.toString());

        System.out.println("Tape Details: ");
        t1.print();
        System.out.println("ToString: " + t1.toString());


    }
}
