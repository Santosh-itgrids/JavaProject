package com.test.publisher;

import javax.xml.ws.Endpoint;

import com.test.service.impl.EmployeeService;
import com.test.service.impl.ProductService;

public class Publish {

	public static void main(String[] args) {
		//This is publisher class,which will expose or publish soap web service to web or internet
		Endpoint.publish("http://localhost:8071/product", new ProductService());
		Endpoint.publish("http://localhost:8072/employee", new EmployeeService());
		System.out.println("Done");

	}

}
