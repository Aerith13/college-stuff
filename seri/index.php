<html>
    <head>
    <style>
   p {
    font-size: 24pt;
  
     }
    body {

    background-color: lightblue; 
     }
     h1{
        background: white;
     }
     fieldset {
     width: 300px;
    
     }
     input{
        padding:4px;
        margin-left: 15px;
        margin-bottom: 5px;
       background:lightblue;
</style>
        
    </head>
<body>
    <center>
<fieldset>
    <legend></legend>

    <br>
    <br>
    <table>
    <h1>REGISTRATION</h1>


<form action="dashboard.php"method="post">
    <p>
    <tr>
First Name:<input type="text"name="fname"><br>
    </tr>
    <tr>
MI:<input type="text"name="middle"><br>
    </tr>
    <tr>
Last Name:<input type="text"name="lname"><br>
    </tr>
    <tr>
Address:<input type="text"name="address"><br>
    </tr>
    <tr>
Age:<input type="text"name="age"><br>
    </tr>
    <tr>
Gender:<input type="text"name="gender"><br>
    </tr>
    <tr>

<textarea name="about" id="" cols="20" rows="10"></textarea><br><br>
<input type="submit">
    </p>
   
    </table>
    
    </fieldset>
</form>
</body>
<center>
