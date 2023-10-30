package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import modal.Instructor;
import java.io.IOException;
import java.util.ArrayList;
import java.math.BigInteger;

public class InstructorService {
	public List<Instructor> readCSV() throws IOException {
		String line = null;
		String splitBy = ",";
		int count = 0;
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Gega\\Desktop\\instructors.csv"));
		List<Instructor> instructorList = new ArrayList<>();

		while ((line = br.readLine()) != null) {
			if (count != 0) {
				Instructor teacher = new Instructor();
				String[] instructors = line.split(splitBy);

				teacher.setInstructorId(instructors[0].trim());
				teacher.setName(instructors[1].trim());
				teacher.setSubject(instructors[2].trim());
				String subject = instructors[2].trim();
				if (subject.equals("c++")) {
					teacher.setSubject("JavaScript");
				}
				teacher.setPhoneNumber(new BigInteger(instructors[3].trim()));
				teacher.setEmail(instructors[4].trim());
				teacher.setTargetYear(instructors[5].trim());

				instructorList.add(teacher);

			}
			count++;
		}
		br.close();
		return instructorList;
	}
}
