<%@ include file="../common/add-all" %>

	<div class="container">
		<br />
		<h3 style="margin:8px; text-align: center;">Welcome ${name}</h3>
		<hr style="width: 50%; bold">
		<br />
		<h5>Your Todos:</h5>
		
		<table class="table-responsive-sm table table-sm  table-hover" >
			<thead class="thead-dark">
				<th scope="col" style="text-align: center;">#</th>
				<th scope="col">Descripton</th>
				<th scope="col"">Category</th>
				<th scope="col" style="text-align: center;">Target date</th>
				<th scope="col" style="text-align: center;">Priority</th>
				<th scope="col" style="text-align: center;">Action</th>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td style="font-weight:bold; text-align: center;"></td>
						<td>${todo.name}</td>
						<td>${todo.category}</td>
						<td style="max-width: 100px;" >${todo.targetTime.date} &nbsp;&nbsp;&nbsp;&nbsp; ${todo.targetTime.time}</td>
						<td style="text-align: center;">${todo.priority.priorityLevel}</td>
						<td style="max-width: 100px" align="center">
							<a class="btn btn-outline-success" href="/done-todo.do?id-todo=${todo.id}">Done</a>
							<a class="btn btn-outline-danger" href="/delete-todo.do?id-todo=${todo.id}">Delete</a>
						</td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<br />
	
	<a class="btn btn-dark" href="/add-todo.do?id-todo=${todo.id}">Add new Todo</a>
			
	
	</div>