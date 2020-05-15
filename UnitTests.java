/**
 *  Final Project - Student Debt Cataloger
 *  This program asks the user to insert a list of students identified by their Red ID along with their total debt. This program allocates
 *  a Student's Red ID and total debt into a list that is later sorted. It is sorted based on the total debt,
 *  and is adjusted so that it goes from lowest to largest debt. Each debt is associated with the student's Red ID number.
 *
 *  In this class,  we are performing unit tests on the program's methods in order to verify that is runs successfully, and accordingly.
 *
 *  CS108-4
 *  @Date 5/14/2020
 *  @author  Maria Paula Molina
 */

import java.util.LinkedList;

public class UnitTests {
    public static void main (String [] args) {
        studentDataToStringTest();
        selectionSortTest();
        mergeInfoTest();
        findStudentPostTest();

    }

    public static void studentDataToStringTest() {
        StudentData testData = new StudentData(820510763, 123);

        if (testData.toString().equals("820510763: $123")) {
            System.out.println("Successfully stored results!");
        }

        else {
            System.out.println("FAILED to store results.");
        }
    }

    public static void selectionSortTest() {



        StudentData testData1 = new StudentData(820510763, 123);
        StudentData testData2 = new StudentData(820673409, 45);
        StudentData testData3 = new StudentData(821675220, 78);

        StudentSorter test = new StudentSorter();

        test.addDataToList(testData1);
        test.addDataToList(testData2);
        test.addDataToList(testData3);



        test.selectionSort(test.getDebtListSize());

        if(test.stuDebtList.get(0).equals(45) && test.stuDebtList.get(1).equals(78) && test.stuDebtList.get(2).equals(123)) {
            System.out.println("Successfully sorted Student Debt List!");
        }

        else {
            System.out.println("FAILED to sort Student Debt List correctly.");
        }

        if(test.stuRedIDList.get(0).equals(820673409) && test.stuRedIDList.get(1).equals(821675220) && test.stuRedIDList.get(2).equals(820510763)) {
            System.out.println("Successfully sorted Red ID List!");
        }

        else {
            System.out.println("FAILED to sort Red ID List correctly.");
        }

    }

    public static void mergeInfoTest () {


        StudentData testData1 = new StudentData(820510763, 123);
        StudentData testData2 = new StudentData(820673409, 45);
        StudentData testData3 = new StudentData(821675220, 78);

        StudentSorter test = new StudentSorter();

        test.addDataToList(testData1);
        test.addDataToList(testData2);
        test.addDataToList(testData3);

        test.selectionSort(test.getDebtListSize());


        if (test.completedList.get(0).equals("820673409: $45")) {
            System.out.println("Successfully merged Red ID List with Debt List.");
        }

        else {
            System.out.println("FAILED to merge two lists.");
        }

    }


    public static void findStudentPostTest() {

        String redIDTest1 = "820510763";
        String redIDTest2 = "816520412";
        StudentSearcher testRedIDSearch = new StudentSearcher();

        LinkedList<String> testRedIDList = new LinkedList<String>();
        testRedIDList.add("820510763: $45");
        testRedIDList.add("820673409: $78");
        testRedIDList.add("821675220: $123");



        int foundPos1 = testRedIDSearch.findStudentPos(testRedIDList, redIDTest1, 0, testRedIDList.size());
        int foundPos2 = testRedIDSearch.findStudentPos(testRedIDList, redIDTest2, 0, testRedIDList.size());

        if (foundPos1 == 0) {
            System.out.println("Successfully found redID at position: " + foundPos1);
        }

        else {
            System.out.println("FAILED to find redID when it was present in list." + foundPos1);
        }

        if (foundPos2 == -1) {
            System.out.println("Success! Red ID was not found in list since it wasn't present.");
        }

        else {
            System.out.println("FAILED, redID is actually not present in list");
        }



    }


}
