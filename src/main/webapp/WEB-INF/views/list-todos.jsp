<%@ include file="../common/add-all" %>

	<div class="container">
		<br />
		<h3 style="margin:8px; text-align: center;">Welcome ${name}</h3>
		<hr style="width: 50%">
		<br />
		<h5>Your Todos:</h5>
		
		<table class="table table-striped">
			<thead>
				<th>#</th>
				<th>Descripton</th>
				<th>Category</th>
				<th style="text-align: center;">Action</th>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td></td>
						<td>${todo.name}</td>
						<td>${todo.category}</td>
						<td style="" align="right">
							<a class="btn btn-outline-success" href="/done-todo.do?id-todo=${todo.id}">done</a>
							<a class="btn btn-outline-danger" href="/delete-todo.do?id-todo=${todo.id}">Delete</a>
						</td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<br />
	
	<a class="btn btn-success" href="/add-todo.do?id-todo=${todo.id}">Add new Todo</a>
			
	
	</div>