/**
 *  Final Project - Student Debt Cataloger
 *  This program asks the user to insert a list of students identified by their Red ID along with their total debt. This program allocates
 *  a Student's Red ID and total debt into a list that is later sorted. It is sorted based on the total debt,
 *  and is adjusted so that it goes from lowest to largest debt. Each debt is associated with the student's Red ID number.
 *
 *  This interface is the backbone for a recursive binary search.
 *  CS108-4
 *  @Date 5/14/2020
 *  @author  Maria Paula Molina
 */

import java.util.LinkedList;

public interface BinarySearch<Integer> {

    int findStudentPos (LinkedList<String> searchList, String studentMatch, int lowVal, int highVal);
}
