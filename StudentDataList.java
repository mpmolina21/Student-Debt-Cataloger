/**
 *  Final Project - Student Debt Cataloger
 *  This program asks the user to insert a list of students identified by their Red ID along with their total debt. This program allocates
 *  a Student's Red ID and total debt into a list that is later sorted. It is sorted based on the total debt,
 *  and is adjusted so that it goes from lowest to largest debt. Each debt is associated with the student's Red ID number.
 *
 *  In this abstract class,  we create two separate lists - one for the Red IDs and the other for the total debts.
 *  CS108-4
 *  @Date 5/14/2020
 *  @author  Maria Paula Molina
 */

import java.util.LinkedList;

public abstract class StudentDataList extends StudentData{

    protected LinkedList<Integer> studentDebtList = new LinkedList<Integer>(); //holds debt values only
    protected LinkedList<Integer> studentRedIDList = new LinkedList<Integer>(); // holds Red IDs only

    public void addDataToList(StudentData student) {
        studentRedIDList.add(student.redID);
        studentDebtList.add(student.totalDebt);
    }

    public LinkedList<Integer> getStudentDebtList() {
        return studentDebtList;
    }

    public LinkedList<Integer> getStudentRedIDList() {
        return studentRedIDList;
    }

    public int getDebtListSize() {
        return studentDebtList.size();
    }

    public int getRedIDListSize() {
        return studentRedIDList.size();
    }
}
