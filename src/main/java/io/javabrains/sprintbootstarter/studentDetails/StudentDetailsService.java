package io.javabrains.sprintbootstarter.studentDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentDetailsService {

	private List<StudentDetails> studentDetails = new ArrayList<>(Arrays.asList(
			new StudentDetails(1,"Aravind", 95),
			new StudentDetails(2, "Ara", 100),
			new StudentDetails(3, "Arvi", 90)
			));	
	
	public List<StudentDetails> getStudentDetails(){
		return studentDetails;
	}
	
	public StudentDetails getStudentDetail(int id) {
		return studentDetails.stream().filter(s -> s.getId() == id).findFirst().get();
		
	}
	
	public void addStudentDetails(StudentDetails studentDetail) {
		studentDetails.add(studentDetail);
	}
	
	public void deleteStudentDetails(int id) {
		/*
		 * StudentDetails studDetail = studentDetails.stream().filter(s -> s.getId() ==
		 * id).findFirst().get(); studentDetails.remove(studDetail);
		 */	
		studentDetails.removeIf(s -> s.getId() == id);
	}

	public void updateStudentDetails(int id, StudentDetails studentDetail) {
		for(int i=0; i<studentDetails.size(); i++)
		{
			if(studentDetail.getId() == id)
			{
				studentDetails.set(i, studentDetail);
			}
		}
		
	}
	
}
