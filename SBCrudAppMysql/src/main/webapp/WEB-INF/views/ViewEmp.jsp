<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th>
<th>Designation</th><th>Email</th><th>Location</th>
<th>Contact</th><th>Update</th><th>Delete</th></tr>  
   <c:forEach var="emp" items="${list}">   
   <tr>  
   <td><c:out value="${emp.employee_id}"/></td>  
   <td><c:out value="${emp.employee_name}"/></td>  
   <td><c:out value="${emp.designation}"/></td> 
   <td><c:out value="${emp.email}"/></td> 
   <td><c:out value="${emp.location}"/></td> 
   <td><c:out value="${emp.contact}"/></td>  
    
   <td><a href="update/${emp.employee_id}" style="color: green">Edit</a></td>  
   <td><a href="delete/${emp.employee_id}"style="color: red">Delete</a>
   
   </td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="register">Add New Employee</a>  