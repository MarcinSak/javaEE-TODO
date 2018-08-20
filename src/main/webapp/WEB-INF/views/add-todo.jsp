<%@ include file="../common/add-all" %>

	<div class="container">
		<h5 style="text-align: center; margin:25px;">New Action</h5>
		<form action="/add-todo.do" method="post">
			<fieldset class="form-group">
				<input required pattern="[a-zA-Z0-9]*" placeholder="Please type description here..." type="text" style="color: gray" name="new-todo" id="inpucik" class="elo form-control"/> <br />
			
				<div class="dropdown input-group mb-4">
  					<select name= "new-todo-category" class="btn btn-outline-secondary form-control dropdown-toggle" id="dropdownMenu2" 
  							data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
  					<c:forEach items="${categotyList}" var="category">
					    <option style="background-color: white;" class="dropdown-item">${category.name}</option>
					</c:forEach>
  					</select>
  					<div class="input-group-append">
  						<input type="button" value="Add category" style="width: 130px; margin-left:5px;" class="btn btn-outline-secondary">
  					</div> 
				</div>
			</fieldset>

  
			<fieldset class="form-input-buttons-group">
				<input class="btn btn-success" type="submit" name="action" value="Add" />
				<input class="btn btn-warning" type="submit" name="action" value="Cancel" />
			</fieldset>
			
		</form>
		
	</div>