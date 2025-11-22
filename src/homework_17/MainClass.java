package homework_17;

import java.io.*;

public class MainClass {

    public static void main(String[] args) {

//        first();
//        second();
//        third();
//        fourth();
        serializableCar();
        deSerializableCar();

    }

    private static void first(){
        File file1 = new File("src/homework_17/test1.txt");

        try(FileWriter fileWriter = new FileWriter(file1)) {
            fileWriter.write("The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("что то пошло не так");
        }
    }

    private static void second(){
        File file2 = new File("C:\\Users\\acer\\Desktop\\JavaCore\\src\\homework_17\\test2.txt");

        try(FileWriter fileWriter = new FileWriter(file2)) {
            fileWriter.write("The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("что то пошло не так");
        }
    }


    private static void third(){

        try(FileReader fileReader = new FileReader("src/homework_17/test1.txt")){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fourth(){

        try(FileReader fileReader = new FileReader("C:\\Users\\acer\\Desktop\\JavaCore\\src\\homework_17\\test2.txt")){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void serializableCar(){

        Car car1 = new Car ("BMW", 260, "Germany");

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/homework_17/Car"))){
            objectOutputStream.writeObject(car1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void deSerializableCar(){

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/homework_17/Car"))){
            System.out.println(objectInputStream.readObject().toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
