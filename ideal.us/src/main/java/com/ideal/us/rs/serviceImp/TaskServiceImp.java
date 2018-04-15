package com.ideal.us.rs.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;
import org.springframework.stereotype.Component;

import com.ideal.mdb.bean.Task;
import com.ideal.us.rs.serviceI.TaskService;

@Component
public class TaskServiceImp implements TaskService {

	@Override
	public List<Task> taskList(Task task, int startPage, int pageSize) {
		List<Task> lis=new ArrayList<>();
		Task e=new Task();
		e.setCreateDate(LocalDate.now().toDate());
		e.setUpdateDate(LocalDate.now().toDate());
		lis.add(e);
		return lis;
	}

	
}
