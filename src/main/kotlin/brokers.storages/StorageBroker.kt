package brokers.storages

import models.students.Student

class StorageBroker : IStorageBroker {
    override fun insertStudent(student: Student) : Student {
        return student
    }
}