public class Main {
    public static void main(String[] args) {
        One nameOfGroupe = new One("КН-11", "КН-12с", "КН-13с");
        Two numOfStudentsGroupe = new Two(18, 23, 20);
        Three attendingClasses = new Three(11, 9, 8);
        System.out.printf("В групі %s є %d студентів. З них %d відвідують пари.%n", nameOfGroupe.firstGroupe, numOfStudentsGroupe.numOfStudentsFirstGroupe, attendingClasses.numOfStudentsFirstGroupeAttandingClasses);
        System.out.printf("В групі %s є %d студентів. З них %d відвідують пари.%n", nameOfGroupe.secondGroupe, numOfStudentsGroupe.numOfStudentsSecondGroupe, attendingClasses.numOfStudentsSecondGroupeAttandingClasses);
        System.out.printf("В групі %s є %d студентів. З них %d відвідують пари.", nameOfGroupe.thridGroupe, numOfStudentsGroupe.numOfStudentsThirdGroupe, attendingClasses.numOfStudentsThirdGroupeAttandingClasses);
    }
}