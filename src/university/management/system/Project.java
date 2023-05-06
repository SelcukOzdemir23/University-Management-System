
package university.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{
    
    Project(){
        setSize(1540,850);
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = il.getImage().getScaledInstance(1500,750,Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        
        //new information bar
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);
        
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        
        //details bar
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.RED);
        mb.add(details);
        
        JMenuItem facultyDetails = new JMenuItem("View Faculty Details");
        facultyDetails.setBackground(Color.WHITE);
        facultyDetails.addActionListener(this);
        details.add(facultyDetails);
        
        JMenuItem studentDetails = new JMenuItem("View Student Details");
        studentDetails.setBackground(Color.WHITE);
        studentDetails.addActionListener(this);
        details.add(studentDetails);
        
        
        //Leave bar
        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.BLUE);
        mb.add(leave);
        
        JMenuItem facultyLeave = new JMenuItem("Faculty Leave");
        facultyLeave.setBackground(Color.WHITE);
        facultyLeave.addActionListener(this);
        leave.add(facultyLeave);
        
        JMenuItem studentLeave = new JMenuItem("Student Leave");
        studentLeave.setBackground(Color.WHITE);
        studentLeave.addActionListener(this);
        leave.add(studentLeave);
        
        
         //Leave Details bar
        JMenu leaveDetails = new JMenu("Leave Details");
        leaveDetails.setForeground(Color.RED);
        mb.add(leaveDetails);
        
        JMenuItem facultyLeaveDetails = new JMenuItem("Faculty Leave Details");
        facultyLeaveDetails.setBackground(Color.WHITE);
        facultyLeaveDetails.addActionListener(this);
        leaveDetails.add(facultyLeaveDetails);
        
        JMenuItem studentLeaveDetails = new JMenuItem("Student Leave Details");
        studentLeaveDetails.setBackground(Color.WHITE);
        studentLeaveDetails.addActionListener(this);
        leaveDetails.add(studentLeaveDetails);
        
        
        //Exams
        JMenu exam = new JMenu("Exam");
        exam.setForeground(Color.blue);
        mb.add(exam);
        
        JMenuItem examinationDetails = new JMenuItem("Examination Results");
        examinationDetails.setBackground(Color.WHITE);
        examinationDetails.addActionListener(this);
        exam.add(examinationDetails);
        
        JMenuItem enterMarks = new JMenuItem("Enter Marks");
        enterMarks.setBackground(Color.WHITE);
        enterMarks.addActionListener(this);
        exam.add(enterMarks);
        
        
        //Update Info Bar
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.RED);
        mb.add(updateInfo);
        
        JMenuItem updateFacultyInfo = new JMenuItem("Update Faculty Details");
        updateFacultyInfo.setBackground(Color.WHITE);
        updateFacultyInfo.addActionListener(this);
        updateInfo.add(updateFacultyInfo);
        
        JMenuItem updateStudentInfo = new JMenuItem("Update Student Details");
        updateStudentInfo.setBackground(Color.WHITE);
        updateStudentInfo.addActionListener(this);
        updateInfo.add(updateStudentInfo);
        
        
        //Fee
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.blue);
        mb.add(fee);
        
        JMenuItem feeStructure = new JMenuItem("Fee Structure");
        feeStructure.setBackground(Color.WHITE);
        feeStructure.addActionListener(this);
        fee.add(feeStructure);
        
        JMenuItem feeForm = new JMenuItem("Student Fee Form");
        feeForm.setBackground(Color.WHITE);
        feeForm.addActionListener(this);
        fee.add(feeForm);
        
        
        //Utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.red);
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);
        
        //about
        JMenu about = new JMenu("About");
        about.setForeground(Color.blue);
        mb.add(about);
        
        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.blue);
        ab.addActionListener(this);
        about.add(ab);
        
         //Exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.red);
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        
        
        
        setJMenuBar(mb);
        
        setVisible(true);
    
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
       String msg = e.getActionCommand();
       
         if (msg.equals("Exit")) {
             setVisible(false);
         }else if (msg.equals("Calculator")) {
             try {
                 Runtime.getRuntime().exec("calc.exe");
             } catch (Exception ex) {
                 
             }
         }else if (msg.equals("Notepad")) {
             try {
                 Runtime.getRuntime().exec("notepad.exe");
             } catch (Exception ex) {
                 
             }
         } else if (msg.equals("New Faculty Information")) {
             new AddTeacher();
         } else if (msg.equals("New Student Information")) {
             new AddStudent();
         }else if (msg.equals("View Faculty Details")) {
             new TeacherDetails();
         }else if (msg.equals("View Student Details")) {
             new StudentDetails();
         }else if (msg.equals("Faculty Leave")) {
             new TeacherLeave();
         }else if (msg.equals("Student Leave")) {
             new StudentLeave();
         }else if (msg.equals("Faculty Leave Details")) {
             new TeacherLeaveDetails();
         }else if (msg.equals("Student Leave Details")) {
             new StudentLeaveDetails();
         }else if (msg.equals("Update Faculty Details")) {
             new UpdateTeacher();
         }else if (msg.equals("Update Student Details")) {
             new UpdateStudent();
         }else if (msg.equals("Enter Marks")) {
             new EnterMarks();
         }else if (msg.equals("Examination Results")) {
             new ExaminationDetails();
         }else if (msg.equals("Fee Structure")) {
             new FeeStructure();
         }else if (msg.equals("About")) {
             new About();
         }else if (msg.equals("Student Fee Form")) {
             new StudentFeeForm();
         }
         
         
         
    }
    
    public static void main(String[] args) {
        new Project();
    }

   
    
    
}
