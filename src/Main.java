public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        System.out.println(lastName + ' ' + firstName + ' ' + middleName);
        String FIO = (lastName + ' ' + firstName + ' ' + middleName).toUpperCase();
        System.out.println(FIO);
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println(fullName);
    }
}