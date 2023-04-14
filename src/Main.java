public class Main {
    public static void main(String[] args) {
        FirstGroup firstGroup = new FirstGroup("КН-11",  18, 11);
        SecondGroup secondGroup = new SecondGroup("КН-12с", 23, 9);
        ThirdGroup thirdGroup = new ThirdGroup("КН-13с", 20, 8);
        System.out.printf("В групі %s є %d студентів. %d з них відвідують пари.%n", firstGroup.name, firstGroup.numOfStudents, firstGroup.attendingClasses);
        System.out.printf("В групі %s є %d студентів. %d з них відвідують пари.%n", secondGroup.name, secondGroup.numOfStudents, secondGroup.attendingClasses);
        System.out.printf("В групі %s є %d студентів. %d з них відвідують пари.", thirdGroup.name, thirdGroup.numOfStudents, thirdGroup.attendingClasses);
    }
}