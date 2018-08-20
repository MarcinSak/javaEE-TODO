<%@ include file="../common/add-all" %>

	<div class="container">
		Your New Action Item:
		<form action="/add-todo.do" method="post">
			<fieldset class="form-group">
				<label>Description</label>
				<input type="text" name="new-todo" class="form-control"/> <br />
			
				<div class="dropdown">
  					<button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenu2" 
  							data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    				Category
  					</button>
  					<div class="dropdown-menu" aria-labelledby="dropdownMenu2">
  					
  					<c:forEach items="${categotyList}" var="category">
					    <button class="dropdown-item" type="button">${category.name}</button>
					</c:forEach>    
				  </div>
				</div>
			</fieldset>
			<fieldset class="form-input-buttons-group">
				<input class="btn btn-success" type="submit" name="action" value="Add" />
				<input class="btn btn-warning" type="submit" name="action" value="Cancel" />
			</fieldset>
		</form>
		
	</div>
