<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Register  Employee Details..!</h1>  
       <form:form method="post"  action="save">    
        <table>  
         <tr>    
          <td>Id :</td>   
          <td><form:input  path="employee_id"  /></td>  
         </tr>
          
         <tr>    
          <td>Contact : </td>   
          <td><form:input path="employee_name"  /></td>  
         </tr>    
         <tr>    
          <td>Designation :</td>    
          <td><form:input path="designation" /></td>  
         </tr>  
         <tr>    
          <td>Email :</td>    
          <td><form:input path="email" /></td>  
         </tr>   
         <tr>    
          <td>Location :</td>    
          <td><form:input path="location" /></td>  
         </tr>   
         <tr>    
          <td>Name :</td>    
          <td><form:input path="contact" /></td>  
         </tr>   
           <tr>    
          <td>Roles :</td>    
          <td><form:input path="roles" /></td>  
         </tr> 
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
    
       </form:form>    
       <a href="all"> Employee Details..!</a>