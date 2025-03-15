public class BOOK extends PUBLICATION
{
    private int pagecount;

    public BOOK() {
        super();
        pagecount = 0;
    }

    public BOOK(String title, int year, double price, int pagecount) {
        super(title, year, price);
        this.pagecount = pagecount;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Page Count: " + this.pagecount);
    }

    @Override
    public String toString() {
        return "BOOK : " + super.toString();
    }
}
