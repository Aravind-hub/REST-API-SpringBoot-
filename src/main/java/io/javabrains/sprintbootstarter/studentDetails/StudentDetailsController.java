package io.javabrains.sprintbootstarter.studentDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDetailsController {

	@Autowired
	private StudentDetailsService studentDetailsService;

	@RequestMapping("/StudentDetails")
	public List<StudentDetails> getStudentDetails() {
		return studentDetailsService.getStudentDetails();
	}

	@RequestMapping("/StudentDetails/{id}")
	public StudentDetails getStudentDetail(@PathVariable int id) {
		return studentDetailsService.getStudentDetail(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/StudentDetails")
	public void addStudentDetails(@RequestBody StudentDetails studentDetail) {
		studentDetailsService.addStudentDetails(studentDetail);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/StudentDetails/{id}")
	public void updateStudentDetails(@RequestBody StudentDetails studentDetail, @PathVariable int id) {
		studentDetailsService.updateStudentDetails(id, studentDetail);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/StudentDetails/{id}")
	public void deleteStudentDetails(@PathVariable int id) {
		studentDetailsService.deleteStudentDetails(id);
	}
}
