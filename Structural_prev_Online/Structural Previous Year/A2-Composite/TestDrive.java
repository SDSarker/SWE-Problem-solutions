import java.util.List;

public class TestDrive {
    public static void main(String[] args) {
        SingleItem item1 = new SingleItem("Rice", 1000, 2);
        SingleItem item2 = new SingleItem("Wheat", 1500, 3);
        SingleItem item3 = new SingleItem("Sugar", 2000, 1);

        Package FamilyPackage = new Package("Food Package", List.of(item1, item2, item3));
        
        Package customPackage = new Package("Super Food Package", List.of(FamilyPackage, item1, item2));

        customPackage.showDetails();
        System.out.println("Total price : "+customPackage.calculatePrice());
        System.out.println("Total weight : "+customPackage.calculateWeight());
    }
}
