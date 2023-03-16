package day10_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 2;
        String location = "";
        int groupNumber = 0;
        String nameOfTeacher = "";

        if(grade >=1 && grade <= 3){
            if(grade==1){
                location = "Apple ochard";
                groupNumber = 3;
                nameOfTeacher = "Mr.Smith";
            } else if (grade==2) {
                location = "zoo";
                groupNumber = 7;
                nameOfTeacher = "Mr.Lee";
            } else if (grade==3) {
                location = "Aquaruim";
                groupNumber = 5;
                nameOfTeacher = "Mr Assl";

            }

        }else {
            System.out.println("Invalid");

        }
       System.out.println("locatin - "+ location + "\nnumber of groups - "+ groupNumber +
               "\nteacher in charge - " + nameOfTeacher);

    }
}
