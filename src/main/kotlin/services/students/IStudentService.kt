package services.students

import models.students.Student

interface IStudentService {
    fun addStudent(student: Student): Student
}