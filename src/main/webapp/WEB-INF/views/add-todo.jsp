<%@ include file="../common/add-all" %>
<%@ include file="../common/newCategoryModal.jspf" %>
	<div class="container">
		<br />
		<h3 style="margin:8px; text-align: center;">New Action</h3>
		<hr style="width: 50%">
		<br />
		<form action="/add-todo.do" method="post">
			<fieldset class="form-group">
				
				<div class="input-group mb-4">
				
					<input required placeholder="Please type description here..." type="text" style="color: gray" name="new-todo" id="inpucik" class="elo form-control"/> <br />
					
					<div class="input-group-append">
						<select style="height:38px; width:60px; margin-left:5px;" title="Priority" name= "new-todo-priority" class="btn btn-outline-secondary dropdown-toggle" id="dropdownMenu3" 
		  							data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							<c:forEach items="${priorityList}" var="priority">
								<option style="background-color: white;" class="dropdown-item">${priority.priorityLevel}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				
				<div class="dropdown input-group mb-4">
  					<select name= "new-todo-category" class="btn btn-outline-secondary form-control dropdown-toggle" id="dropdownMenu2" 
  							data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		  				<c:forEach items="${categotyList}" var="category">
						    <option style="background-color: white;" class="dropdown-item">${category.name}</option>
						</c:forEach>
  					</select>
  					<div class="input-group-append">
  						<button style="width:130px; margin-left:5px;" class="btn btn-outline-secondary" data-toggle="modal" data-target="#myModal">Add category</button>
  					</div> 
				</div>
			</fieldset>
							
			<fieldset class="form-input-buttons-group">

			</fieldset>
      <c:set var = "salary" scope = "session">asdsad</c:set>
			<fieldset class="form-input-buttons-group">
				<input class="btn btn-success" type="submit" name="action" value="Add" />
				<input class="btn btn-warning" type="submit" name="action" value="Cancel" />
			</fieldset>
			
		</form>
	
		<div class="errorMessageClass">${AddTodoErrorMessage}</div>
		
	</div>