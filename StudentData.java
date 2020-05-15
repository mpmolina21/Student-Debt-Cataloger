/**
 *  Final Project - Student Debt Cataloger
 *  This program asks the user to insert a list of students identified by their Red ID along with their total debt. This program allocates
 *  a Student's Red ID and total debt into a list that is later sorted. It is sorted based on the total debt,
 *  and is adjusted so that it goes from lowest to largest debt. Each debt is associated with the student's Red ID number.
 *
 *  In this class, the student's Red ID and total debt is identified.
 *  CS108-4
 *  @Date 5/14/2020
 *  @author  Maria Paula Molina
 */

public class StudentData {
    protected Integer redID; //holds SDSU student number
    protected Integer totalDebt; //determines how much student owes to the university


    public StudentData() {}

    public StudentData(Integer redID, Integer totalDebt) {

        this.redID = redID;
        this.totalDebt = totalDebt;
    }

    @Override
    public String toString() {

        return  redID + ": $" + totalDebt;
    }
}
