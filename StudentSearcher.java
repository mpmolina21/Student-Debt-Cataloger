/**
 *  Final Project - Student Debt Cataloger
 *  This program asks the user to insert a list of students identified by their Red ID along with their total debt. This program allocates
 *  a Student's Red ID and total debt into a list that is later sorted. It is sorted based on the total debt,
 *  and is adjusted so that it goes from lowest to largest debt. Each debt is associated with the student's Red ID number.
 *
 *  In this class,  the user can search for a specific student using their Red ID number.
 *
 *  CS108-4
 *  @Date 5/14/2020
 *  @author  Maria Paula Molina
 */

import java.util.LinkedList;

public class StudentSearcher extends StudentSorter implements BinarySearch<Integer> {

    //This method handles a recursive binary search, and will yield the position where ID was found.
    //If not found, it will simply yield -1.
    public int findStudentPos (LinkedList<String> searchList, String studentMatch, int lowVal, int highVal) {

        int midVal; // midpoint of high and low values
        int studPos; // position where student is found
        int rangeSize; // remaining range of values left for searching match


        rangeSize = (highVal - lowVal) + 1;
        midVal = (highVal + lowVal) / 2;


        if ((searchList.get(midVal)).contains(studentMatch)) {
            studPos = midVal;

        }

        else if (rangeSize == 1) {
            studPos = -1; // student not found

        }

        else {
            if (studentMatch.compareTo(searchList.get(midVal)) < 0) {
                studPos = findStudentPos(searchList, studentMatch, lowVal, midVal);
            }

            else {
                studPos = findStudentPos(searchList, studentMatch, midVal + 1, highVal);
            }

        }

        return studPos;
    }



}
