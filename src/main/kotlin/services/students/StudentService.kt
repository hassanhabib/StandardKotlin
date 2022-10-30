package services.students

import brokers.storages.*
import models.students.Student

class StudentService(val storageBroker: IStorageBroker) : IStudentService {
    override fun addStudent(student: Student): Student {
        return this.storageBroker.insertStudent(student)
    }
}