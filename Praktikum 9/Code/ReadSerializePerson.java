import java.io.*;

public class ReadSerializePerson {
    public static void main(String[] args) {
        Person person = null;
        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("serialize person name = "+person.getName());
        } catch(Exception ioe){
            ioe.printStackTrace();
        }
    }
}
