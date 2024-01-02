import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Data {
    private String name;
    private int english;
    private int math;

    public Data(String str, int e, int m) {
        name = str;
        english = e;
        math = m;
    }

    public void writeData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt", true))) {
            writer.write(name + " " + english + " " + math + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void show() {
        System.out.println("姓名: " + name);
        System.out.println("英文成績: " + english);
        System.out.println("數學成績: " + math);
        System.out.println("平均: " + calculateAverage());
        System.out.println();
    }

    private double calculateAverage() {
        return (english + math) / 2.0;
    }
}

public class class10 {
    public static void readData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("student.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(" ");
                Data student = new Data(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                student.show();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Data stu1 = new Data("Ariel", 92, 85);
        Data stu2 = new Data("Fiona", 67, 89);

        stu1.writeData();
        stu2.writeData();

        readData();
    }
}
