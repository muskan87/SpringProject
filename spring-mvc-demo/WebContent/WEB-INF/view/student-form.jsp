<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE  html>
<html>
<head>

  <title>Student Registration Form</title>

</head>
 <body>
 
   <form:form action="processform" modelAttribute="student">
   
    firstName : <form:input path="firstName"/>
   <br><br>
   
    lastName : <form:input path="lastName"/>
    
   <br><br>
   
   Country:
   <form:select path="country">
   
   <form:options items="${student.countryOptions}"/>
  
    </form:select>
   
   <br><br>
     Favorite Language:
     Java<form:radiobutton path="favoriteLanguage" value="Java"/>
     C##<form:radiobutton path="favoriteLanguage" value="C##"/>
     PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
     Ruby<form:radiobutton path="favoriteLanguage" value="Ruby"/>
   
   
   <br><br>
   Operating systems:
   Linux<form:checkbox path="operatingSystems" value="Linux" />
   Mac Os<form:checkbox path="operatingSystems" value="Mac Os" />
   Ms Window<form:checkbox path="operatingSystems" value="Ms Window" />
   
   
   
   <br><br>

    <input type="submit" value="submit"/>  
   </form:form>
 
 </body>




</html>
