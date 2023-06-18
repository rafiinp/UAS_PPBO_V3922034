package UAS;

// Superclass Person
class Person {
    // Atribut
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method getName
    public String getName() {
        return name;
    }

    // Method getAge
    public int getAge() {
        return age;
    }
}

// Subclass Student yang mewarisi dari Person
class Student extends Person {
    // Atribut tambahan pada Student
    private String major;

    // Constructor
    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    // Method baru pada Student
    public void study() {
        System.out.println(getName() + " sedang belajar di jurusan " + major);
    }
}

// Subclass Teacher yang mewarisi dari Person
class Teacher extends Person {
    // Atribut tambahan pada Teacher
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Method baru pada Teacher
    public void teach() {
        System.out.println(getName() + " mengajar mata pelajaran " + subject);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Membuat objek Student
        Student student = new Student("Rafi", 20, "Informatika");
        System.out.println("Nama: " + student.getName());
        System.out.println("Usia: " + student.getAge());
        student.study();

        System.out.println();

        // Membuat objek Teacher
        Teacher teacher = new Teacher("Pratama", 35, "Pemograman Berorientasi Object");
        System.out.println("Nama: " + teacher.getName());
        System.out.println("Usia: " + teacher.getAge());
        teacher.teach();
    }
}
