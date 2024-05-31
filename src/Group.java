import java.util.ArrayList;
import java.util.List;

public class Group {

    private int number;
    private List<Student> students;

    private static final int maximum_students= 20;

    public Group(int number){
        this.number = number;
        this.students = new ArrayList<>();
    }

    public void  Students_conclusioin(){
        System.out.println("Группа: " + getNumber());
        for (Student student : students){
            System.out.println("Имя: " + student.getName() + ",  Фамилия: " + student.getSurname() + ", Возраст: " + student.getAge());
        }

    }

    public boolean add_Studenats(Student student){
        if(students.size() < maximum_students){
            students.add(student);
            return true;
        }
        else {

        }
        return false;
    }


    public int getNumber(){
        return number;
    }

}
