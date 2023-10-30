package launcher;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import modal.Admin;
import modal.Course;
import service.StudentService;
import modal.Enrollment;
import modal.Students;

public class Launcher {
	public static void main(String[] args) throws ParseException, IOException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Admin admin = new Admin();
		admin.setAdminId("admin1");
		admin.setPassword("admin");

		Course course = new Course();
		course.setCourseId("J2023");
		course.setCourseDuration(30);
		course.setCourseName("Java Application Development");

		Enrollment enroll = new Enrollment();
		enroll.setEnrollId(202301);
		enroll.setDate(sdf.parse("01/01/2022"));
		enroll.setDetails("Fall 2022 enrollment!");

		Students student = new Students();
		student.setStudId("F123");
		student.setName("Grigoli");
		student.setAge("22");
		student.setDepartment("Bachelor's of Computer Science");
		student.setYear("2022");

		List<String> courses = new ArrayList<String>();
		courses.add("Java");
		courses.add("python");
		courses.add("C++");
		student.setCourse(courses); // courses.forEach(c -> System.out.println(c));

		StudentService payService = new StudentService();
		payService.read();

	}
}
