public class TestDrive {
    public static void main(String[] args) {
        Restaurant r1=new Restaurant(new BangalyFactory());
        Restaurant r2=new Restaurant(new ChineseFactory());

        System.out.println(r1.getmeal());
        System.out.println(r2.getmeal());
    }
}
