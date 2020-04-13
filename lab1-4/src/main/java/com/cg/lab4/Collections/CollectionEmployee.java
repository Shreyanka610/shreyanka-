package com.cg.lab4.Collections;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cg.lab4.dto.EmployeeEx;
	@Configuration
	public class CollectionEmployee 
	{
		private List<EmployeeEx> emplist=new ArrayList<EmployeeEx>();
		
		@Bean
		public List<EmployeeEx> getEmpList()
		{
			emplist.add(new EmployeeEx(100,"gunjika",80000.0));
			emplist.add(new EmployeeEx(101,"raksha",85000.0));
			emplist.add(new EmployeeEx(102,"shweta",90000.0));
			emplist.add(new EmployeeEx(103,"vaishali",95000.0));

			return emplist;
		}

}
