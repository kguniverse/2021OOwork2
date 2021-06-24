import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class test {
    static HashMap<String, ProductSpecification> ISBNDic = new HashMap<>();
    public static void main(String[] args) {
        init();
        Sale sale = new Sale();
        Scanner cin = null;
        try {
            cin = new Scanner(new File("op.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(true){
            assert cin != null;
            if (!cin.hasNext()) break;
            String isbn = cin.next();
            int copies = cin.nextInt();
            sale.add(ISBNDic.get(isbn), copies);
        }
        System.out.printf("%.2f\n", sale.getTotal());
    }
    public static void init(){
        ISBNDic.put("0001", new ProductSpecification("0001", 18, "UML与模式应用", 1));
        ISBNDic.put("0002", new ProductSpecification("0002", 34, "Java与模式", 3));
        ISBNDic.put("0003", new ProductSpecification("0003", 58, "HeadFirst设计模式", 3));
        ISBNDic.put("0004", new ProductSpecification("0004", 30, "爱丽丝历险记", 2));
        ISBNDic.put("0005", new ProductSpecification("0005", 20, "煲汤大全", 4));

    }
}
