public class Main {
    public static void main(String[] args) {


        System.out.println("Задание 1");
        // Создаю имя - Ivan
        String firstName = "Ivan";
        // Создаю отчество - Ivanovich
        String middleName = "Ivanovich";
        // Создаю фамилию - Ivanov
        String lastName = "Ivanov";
        // Склеиваю Ф.И.О. с пробелами
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        // Вывожу результат в консоль
        System.out.println("Ф. И. О. сотрудника — " + fullName);


        System.out.println("\nЗадание 2");
        // Вывожу результат в консоль с верхним регистром из fullName первой задачи
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());


        System.out.println("\nЗадание 3");
        // Переименовываю значение fullName из первой задачи
        fullName = "Иванов Семён Семёнович";
        // Заменяю букву 'ё' на 'е'
        String correctFullName = fullName.replace("ё", "е");
        // Вывожу получившийся результат в консоль
        System.out.println("Данные Ф. И. О. сотрудника — " + correctFullName);
    }
}