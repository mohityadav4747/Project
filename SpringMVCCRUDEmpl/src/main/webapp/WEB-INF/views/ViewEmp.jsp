<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Designation</th><th>Email</th><th>Location</th>
<th>Contact</th><th>JoiningDate</th><th>Edit</th><th>Delete</th></tr> 
   <c:forEach var="emp" items="${list}">   
   <tr>  
   <td>${emp.employee_id}</td>  
   <td>${emp.employee_name}</td>  
   <td>${emp.designation}</td> 
   <td>${emp.email}</td> 
       <td>${emp.location}</td> 
      <td>${emp.contact}</td>  
         <td>${emp.joinig_date}</td>  
   <td><a href="editemp/${emp.employee_id}">Edit</a></td>  
   <td><a href="deleteemp/${emp.employee_id}">Delete</a>
   
   </td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="Register">Add New Employee</a>  