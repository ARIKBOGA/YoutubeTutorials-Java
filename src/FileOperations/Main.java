package FileOperations;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student("Burak", "Arıkboğa");
        Student s2 = new Student("Selim", "Arıkboğa");
        Student s3 = new Student("Levent", "Arıkboğa");
        Student s4 = new Student("Halil", "Arıkboğa");
        Student[] students = {s1, s2, s3, s4};

        File file = new File("Students.txt");

        if (!file.exists()) {
            file.createNewFile();
        }
        //String str = "\nFirst writing to this file";
        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Student student : students) {
            bufferedWriter.write(student.id + "\t" + student.name + "\t" + student.lastName + "\t");
            bufferedWriter.newLine();
        }
        bufferedWriter.close();


        FileReader fileReader = new FileReader(file);
        String read;
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while ((read = bufferedReader.readLine()) != null) {
            System.out.println(read);
            //System.out.println("Name: " + read[1] + " Last Name: " + read[2] + " ID: " + Integer.valueOf(read[0]));
        }
        bufferedReader.close();

        if (file.exists()) file.delete();
    }
}
