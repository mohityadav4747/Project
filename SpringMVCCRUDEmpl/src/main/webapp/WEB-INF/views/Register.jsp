<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Register  Employee</h1>  
       <form:form method="post" action ="save">    
        <table>  
         <tr>    
          <td>id :</td>   
          <td><form:input  path="employee_id"  /></td>  
         </tr>
          
         <tr>    
          <td>Name : </td>   
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
          <td>Contact :</td>    
          <td><form:input path="contact" /></td>  
         </tr>   
         <tr>    
          <td>JoiningDate :</td>    
          <td><form:input path="joining_date" /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>    