//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Group group1 = new Group(1);
        Group group2 = new Group(2);
        Group group3 = new Group(3);


        Student student1 = new Student("Сергей","Кузницов", 15);
        Student student2 = new Student("Кирил", "Кокомберг", 11);
        Student student3 = new Student("Алиса", "ДабДаб", 8);
        Student student4 = new Student("Бомг", "Крыыыыы", 15);
        Student student5 = new Student("Лиза", "Лоп", 11);
        Student student6 = new Student("Рокс", "Хокс", 15);
        Student student7 = new Student("Имп", "Ког", 8);
        Student student8 = new Student("Оиоп", "Камыс", 11);
        Student student9 = new Student("Гири", "Григ", 11);
        Student student10 = new Student("Паша", "Первый", 15);

        group1.add_Studenats(student1);
        group1.add_Studenats(student4);
        group1.add_Studenats(student6);
        group1.add_Studenats(student10);
        group2.add_Studenats(student2);
        group2.add_Studenats(student5);
        group2.add_Studenats(student8);
        group2.add_Studenats(student9);
        group3.add_Studenats(student3);
        group3.add_Studenats(student7);

        group1.Students_conclusioin();
        group2.Students_conclusioin();
        group3.Students_conclusioin();





    }
}