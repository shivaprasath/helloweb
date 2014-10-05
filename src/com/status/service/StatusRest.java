/**
 * 
 */
package com.status.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Thiru Ganesh Kumar
 * 
 */

@Path("/status")
public class StatusRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Student greStatus() {

		Student student = new Student();

		student.setAge(20);
		student.setName("Rajesh");

		return student;
	}

}
