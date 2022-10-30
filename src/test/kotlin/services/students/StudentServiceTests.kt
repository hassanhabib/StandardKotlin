package services.students

import brokers.storages.IStorageBroker
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import models.students.Student
import kotlin.test.Test
import kotlin.test.assertEquals

class StudentServiceTests {
    @Test
    fun `Should Add Student`()
    {
        // given
        val randomStudent: Student = mockk()
        val inputStudent: Student = randomStudent
        val insertedStudent: Student = inputStudent
        val expectedStudent: Student = insertedStudent
        val storageBrokerMock: IStorageBroker = mockk()

        val studentService: IStudentService =
            StudentService(storageBrokerMock)

        every { storageBrokerMock.insertStudent(inputStudent) }
            .returns(insertedStudent)

        // when
        val actualStudent: Student =
            studentService.addStudent(inputStudent)

        // then
        assertEquals(actualStudent, expectedStudent)

        verify (exactly = 1) {
            storageBrokerMock.insertStudent(inputStudent)
        }
    }
}