/**
 *  Final Project - Student Debt Cataloger
 *  This program asks the user to insert a list of students identified by their Red ID along with their total debt. This program allocates
 *  a Student's Red ID and total debt into a list that is later sorted. It is sorted based on the total debt,
 *  and is adjusted so that it goes from lowest to largest debt. Each debt is associated with the student's Red ID number.
 *
 *  In this class, we ask the user to input the amount of student data that will be applied. Then it asks for each of the student's Red ID and total debt.
 *  Once all information is inputted, it will yield a sorted list based on the debt values (from lowest to highest). Then, it will ask to search for
 *  a student within the list.
 *
 *  CS108-4
 *  @Date 5/14/2020
 *  @author  Maria Paula Molina
 */

import java.util.Scanner;
import java.util.LinkedList;

public class Main {


    public static void main (String [] args) {

        Integer userRedID; //initialized by user
        Integer userTotalDebt; //initialized by user

        int totalStudentsData; //determines how many students will be stored in list, so that is later sorted

        Scanner scnr = new Scanner(System.in);

        System.out.println("How many students will be inputted: ");
        totalStudentsData = scnr.nextInt();

        StudentData newStudent;
        StudentSorter sortStudent = new StudentSorter();


        //loop will allow to enter student data depending on totalStudentData
        for (int i = 0; i < totalStudentsData; i++) {

            System.out.println("Enter 9-digit Red ID: ");
            userRedID = scnr.nextInt();

            System.out.println("Enter " + userRedID + "'s Debt: ");
            userTotalDebt = scnr.nextInt();

            newStudent = new StudentData(userRedID, userTotalDebt);
            sortStudent.addDataToList(newStudent);

        }

        //sorting student data, and then merged into one list
        sortStudent.selectionSort(sortStudent.getDebtListSize());
        LinkedList<String> completeList = sortStudent.mergeInfo();
        sortStudent.printCompletedList();



        String studentSearch; //initialized by user

        System.out.println("Please enter the Red ID of the Student you are searching for: ");
        studentSearch = scnr.next();

        StudentSearcher search = new StudentSearcher();


        //performs search on input provided by user through studentSearch
        int matchPos = search.findStudentPos(completeList, studentSearch, 0, completeList.size() - 1);

        if (matchPos >= 0) {
            System.out.println("Student found at position: " + matchPos);
            System.out.println(completeList.get(matchPos));
        }

        else {
            System.out.println("Student not found.");
        }


    }


}
