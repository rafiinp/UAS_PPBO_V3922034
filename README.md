Ujian Akhir Semester 2 
Muhammad Rafi Naufal Pratama
V3922034
TIE

Berikut merupakan penjelasan untuk soal nomor 3 disetiap bagian kodenya :

```java
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
```

Di bagian ini, kita mendefinisikan kelas `Person` sebagai superclass (kelas utama) dalam hierarki pewarisan. Kelas ini memiliki dua atribut pribadi, yaitu `name` (nama) dan `age` (usia). Terdapat constructor `Person` yang digunakan untuk menginisialisasi objek `Person` dengan nama dan usia tertentu. Selain itu, terdapat metode `getName` untuk mengembalikan nama dan metode `getAge` untuk mengembalikan usia.

```java
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
```

Di bagian ini, kita mendefinisikan subclass (kelas turunan) `Student` yang mewarisi dari kelas `Person`. Kelas `Student` memiliki atribut tambahan yaitu `major` (jurusan). Terdapat constructor `Student` yang menggunakan kata kunci `super` untuk memanggil constructor dari kelas `Person` dan menginisialisasi objek `Student` dengan nama, usia, dan jurusan tertentu. Selain itu, terdapat metode `study` yang mencetak pesan bahwa seorang siswa sedang belajar di jurusan tertentu.

```java
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
```

Di bagian ini, kita mendefinisikan subclass (kelas turunan) `Teacher` yang juga mewarisi dari kelas `Person`. Kelas `Teacher` memiliki atribut tambahan yaitu `subject` (mata pelajaran). Terdapat constructor `Teacher` yang menggunakan kata kunci `super` untuk memanggil constructor dari kelas `Person` dan menginisialisasi objek `Teacher` dengan nama, usia, dan mata pelajaran tertentu. Selain itu, terdapat metode `teach` yang mencetak pesan bahwa seorang guru mengajar mata pelajaran tertentu.

```java
// Main class
public class Main {
    public static void main(String[] args) {
        // Membuat objek Student
        Student student = new Student("Rafi", 20, "Informatika");
        System.out.println("Nama: " + student.getName());
        System.out

.println("Usia: " + student.getAge());
        student.study();

        System.out.println();

        // Membuat objek Teacher
        Teacher teacher = new Teacher("Pratama", 35, "Pemrograman Berorientasi Objek");
        System.out.println("Nama: " + teacher.getName());
        System.out.println("Usia: " + teacher.getAge());
        teacher.teach();
    }
}
```

Di bagian ini, terdapat kelas `Main` yang merupakan kelas utama yang memiliki metode `main` sebagai titik masuk program. Di dalam metode `main`, kita membuat objek `Student` dengan menggunakan constructor `Student` yang ada di kelas `Student`. Kemudian, kita mencetak nama, usia, dan memanggil metode `study` untuk objek `Student`.

Kemudian, kita juga membuat objek `Teacher` dengan menggunakan constructor `Teacher` yang ada di kelas `Teacher`. Setelah itu, kita mencetak nama, usia, dan memanggil metode `teach` untuk objek `Teacher`.

Hasil output dari program ini akan mencetak informasi tentang siswa dan guru, termasuk nama, usia, dan kegiatan yang dilakukannya.
