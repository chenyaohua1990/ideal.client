package com.ideal.us.rs.serviceI;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.http.MediaType;

import com.ideal.mdb.bean.Task;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;


@Path("/taskService")
@Produces(value=MediaType.APPLICATION_ATOM_XML_VALUE)
@Api(value="任务服务类")
public interface TaskService {
	@GET
	@Path("list/{startPage}/{pageSize}")
	@ApiOperation(response=List.class,value="任务列表")
	@ApiImplicitParams(value={
		@ApiImplicitParam(name="task",required=false)	
	})
	List<Task> taskList(@QueryParam("")Task task,@PathParam("startPage")int startPage,@PathParam("pageSize")int pageSize);
}
