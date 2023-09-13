import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            String fullName = getRandomSecondName() + " " + getRandomName() + " " + getRandomFatherName();
            int age = random.nextInt(14,21);
            String group = getRandomGroup();
            Student student = new Student(fullName, age, group);
            studentList.add(student);
        }

        for (Student student: studentList) {
            System.out.println(student.getFullName() + " | " + student.getAge() + " | " + student.getGroup());
        }

        List<String> youngStudent = studentList.stream()
                .filter(age -> age.getAge() < 16)
                .map(student -> {
                    String[] secondName = student.getFullName().split(" ");
                    return secondName.length > 0 ? secondName[0] : "";
                }).collect(Collectors.toList());
        System.out.println("\n###############################################\n");
        System.out.println("Фамілії студентів, яким меньше 16 років:");
        youngStudent.forEach(System.out::println);


        List<Student> studentList1 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String fullName = getRandomSecondName() + " " + getRandomName() + " " + getRandomFatherName();
            int age = random.nextInt(14,21);
            String group = getRandomGroup();
            int points = random.nextInt(50,100);
            Student student = new Student(fullName, age, group, points);
            studentList1.add(student);
        }

        for (Student student: studentList1) {
            System.out.println(student.getFullName() + " | " + student.getAge() + " | " + student.getGroup() + " | " + student.getPoints());
        }


        OptionalDouble avgPoints = studentList1.stream().mapToInt(avg -> avg.getPoints()).average();

        System.out.println("Середній бал групи: " + avgPoints.getAsDouble());



        List<Employee> employeeList = studentList1.stream().map(student -> {
            String[] parts = student.getFullName().split(" ");
            String surname = parts[0];
            String name = parts[1];
            String patronymic = parts[2];
            int age = student.getAge();
            return new Employee(name, surname, patronymic, age);
        }).collect(Collectors.toList());

        System.out.println("\n#########################################");
        System.out.println("Студенти перекваліфікувалися в работяг\n");
        for (Employee employee: employeeList) {
            System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic() + " | " + employee.getAge());
        }
    }

    public static String getRandomName(){
        String[] names = {"Владислав", "Антон", "Олександр", "Іван", "Анастасія", "Олександра", "Ірина", "Лєна", "Лава"};
        Random random = new Random();
        int i = random.nextInt(names.length);
        return names[i];
    }

    public static String getRandomSecondName(){
        String[] secondNames = {"Зеленський", "Ахмєтов", "Яша", "Головач", "Коломойський", "Джонсонюк", "Патрон"};
        Random random = new Random();
        int i = random.nextInt(secondNames.length);
        return secondNames[i];
    }
    public static String getRandomFatherName(){
        String[] secondNames = {"Олександрович", "Іванович", "Олексійовий", "Миколайович", "Валентинович"};
        Random random = new Random();
        int i = random.nextInt(secondNames.length);
        return secondNames[i];
    }
    public static String getRandomGroup(){
        String[] group = {"ТМ-02", "ТМ-01", "ТР-01", "ТР-02", "ТР-03"};
        Random random = new Random();
        int i = random.nextInt(group.length);
        return group[i];
    }


}
