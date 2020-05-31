package org.start;
import org.student.Student;
import org.studentoperations.StudentOperations;
import org.teacher.Teacher;
import org.teacheroperations.TeacherOperations;


import org.book.Book;
import org.bookoperations.BookOperations;

import java.util.Scanner;

public class Start{
    public static void main(String[] args){
        
        StudentOperations stos=new StudentOperations();
        Student student=new Student();

        TeacherOperations tos=new TeacherOperations();
        Teacher teacher=new Teacher();

        BookOperations bos=new BookOperations();
        Book book=new Book();

        Scanner in=new Scanner(System.in);

        int i=1;
        while(i!=-1){

            System.out.println("\nMAIN MENU\n\n1. Student Management\n2. Teacher Management\n3. Book Management\n4. Exit\n");
            System.out.println("\nEnter your choice :");
            int choice=in.nextInt();
           
            if(choice==1){
                while(i!=-2){
                    System.out.println("\nStudent Management\n1. Insert New Student\n2. Search by student Id\n3. Show All Student\n4. Main Manu\n");
                    System.out.println("Enter your choice:");
                    int schoice =in.nextInt();
                    if(schoice==1){
                        stos.insertStudent(student);
                        continue;
                   }
                    else if(schoice==2){
                        System.out.println("Enter student's ID:");
                        int id=in.nextInt();
                        stos.getStudent(id);
                        continue;
                    }
                    else if(schoice==3){
                        stos.showAllStudents();
                        continue;
                    }
                    else{
                        break;
                    }

                }
            }

            else if(choice==2){
                while(i!=-2){
                    System.out.println("\nTeacher Management\n\n1. Insert New Teacher\n2. Search by teacherId\n3. Show All Teacher\n4. Main Manu\n");
                    System.out.println("Enter your choice:");
                    int tchoice =in.nextInt();
                    if(tchoice==1){
                        tos.insertTeacher(teacher);
                        continue;
                    }
                
                    else if(tchoice==2){
                        System.out.println("Enter teacher's ID:");
                        int id=in.nextInt();
                        tos.getTeacher(id);
                        continue;
                    }
                    else if(tchoice==3){
                        tos.showAllTeachers();
                        continue;
                    }
                    else{
                        break;
                    }
                
               }
                
           }
            else {
                
                break;
            }
            
        }
        
    }
}