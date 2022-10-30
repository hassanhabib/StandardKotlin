package brokers.storages

import models.students.Student

interface IStorageBroker {
    fun insertStudent(student: Student) : Student
}