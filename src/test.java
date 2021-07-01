import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class test {
    static HashMap<String, ProductSpecification> TITLE_Dic = new HashMap<>();
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
            String title = cin.next();
            int copies = cin.nextInt();
            if(!TITLE_Dic.containsKey(title)){
                System.out.println("不存在书籍:" + title);
            }
            else sale.add(TITLE_Dic.get(title), copies);
        }
        System.out.printf("总开销为%.2f\n", sale.getTotal());
    }
    public static void init(){
        try {
            Scanner sc = new Scanner(new File("dic.txt"));
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] infos = line.split(" ");
                String ISBN = infos[0];
                int price = Integer.parseInt(infos[1]);
                String title = infos[2];
                int type = Integer.parseInt(infos[3]);
                TITLE_Dic.put(title, new ProductSpecification(ISBN, price, title, type));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
