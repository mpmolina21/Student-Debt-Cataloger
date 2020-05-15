/**
 *  Final Project - Student Debt Cataloger
 *  This program asks the user to insert a list of students identified by their Red ID along with their total debt. This program allocates
 *  a Student's Red ID and total debt into a list that is later sorted. It is sorted based on the total debt,
 *  and is adjusted so that it goes from lowest to largest debt. Each debt is associated with the student's Red ID number.
 *
 *  In this class,  the two lists (Red ID list and total debt list) are sorted so that it goes from lowest debt to highest debt.
 *  Then, they are merged into one list, so that all information is contained in one list.
 *  CS108-4
 *  @Date 5/14/2020
 *  @author  Maria Paula Molina
 */

import java.util.LinkedList;

public class StudentSorter extends StudentDataList  {

    public LinkedList<String> completedList = mergeInfo();

    public LinkedList<Integer> stuDebtList = super.studentDebtList;
    public LinkedList<Integer> stuRedIDList = super.studentRedIDList;




    //Selection sort algorithm is utilized to sort list from lowest to highest values.
    public void selectionSort(int debtListSize) {

        int i = 0;
        int j = 0;
        int indexSmallest = 0;
        Integer temp1 = 0;
        Integer temp2 = 0;

        for (i = 0; i < debtListSize - 1; ++i) {
            indexSmallest = i;

            for (j = i + 1; j < debtListSize; ++j) {
                if (super.studentDebtList.get(j).compareTo(super.studentDebtList.get(indexSmallest)) < 0) {
                    indexSmallest = j;
                }
            }

            temp1 = super.studentDebtList.get(i);
            temp2 = super.studentRedIDList.get(i);

            super.studentDebtList.set(i, super.studentDebtList.get(indexSmallest));
            super.studentRedIDList.set(i, super.studentRedIDList.get(indexSmallest));

            super.studentDebtList.set(indexSmallest, temp1);
            super.studentRedIDList.set(indexSmallest, temp2);

        }

    }




    //Once lists have been sorted, they are merged into one list.
    public LinkedList<String> mergeInfo() {

        LinkedList<String> completedList = new LinkedList<String>();

        for (int i = 0; i < super.studentDebtList.size(); ++i ) {
            completedList.add(super.studentRedIDList.get(i) + ": $" + super.studentDebtList.get(i));
        }

        return completedList;



    }

    //prints sorted student data that is contained in one list.
    public void printCompletedList() {
        LinkedList<String> completeStudentData = mergeInfo();

        for (String studentInfo: completeStudentData) {
            System.out.println(studentInfo);
        }

    }


}
