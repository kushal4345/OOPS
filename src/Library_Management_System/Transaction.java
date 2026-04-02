package Library_Management_System;

import java.util.Date;

public class Transaction {
    Student student;
    Date issueDate;
    Date returnDate;
    Book book;

    Transaction(Student student,Date issueDate,Date returnDate,Book book){
        this.book = book;
        this.student = student;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }

}
