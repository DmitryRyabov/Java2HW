package HW5;



import java.io.*;
import java.util.ArrayList;


public class Main implements Serializable{

    public static void main(String[] args) throws IOException {

        String[] header = new String[]{"Value 1", "Value 2", "Value 3"};
        int[][] data = new int[][]{{100, 200, 123},{300, 400, 500}};

        File file = new File("src/HW5/Data.csv");

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(new FileOutputStream(file))){
            for (String e: header){
                objectOutputStream.writeObject(e);
                for (int[] j:data){
                    objectOutputStream1.writeObject(j);
                }
            }
        }
//        ArrayList<header>
//
//
//        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
//            ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream(file))){
//            readheader.add((header) objectInputStream.readObject());
//            readheader.add((data) objectInputStream1.readObject());
//            } catch (ClassNotFoundException e) {
//            e.printStackTrace();
        }

    }

















