public class TAPE extends PUBLICATION
{
    private int playtime;

    public TAPE() {
        super();
        this.playtime = 0;
    }

    public TAPE(String title, int year, int price, int playtime) {
        super(title, year, price);
        this.playtime = playtime;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Playtime: " + this.playtime);
    }

    @Override
    public String toString() {
        return "TAPE : " + super.toString();
    }
}
