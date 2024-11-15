import java.util.ArrayList;
import java.util.Scanner;

public class quanlisach {
    private static ArrayList<sach> sachs;

    public quanlisach() {
        sachs = new ArrayList<>();
    }
    public void hienthi() {
        if (sachs.isEmpty()) {
            System.out.println("Danh sách sách hiện tại rỗng.");
        } else {
            for (sach s : sachs) {
                System.out.println(s);
            }
        }
    }

    public void addBook(sach sach) {
        sachs.add(sach);
    }

    public void editBookById(String newId, String newtensach, String newtentacgia, String BookId) {
        Scanner scanner = new Scanner(System.in);
        for (sach s : sachs) {
            if (s.getId().equals(BookId)) {
            }
        }
    }
}


