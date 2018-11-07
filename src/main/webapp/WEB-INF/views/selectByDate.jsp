<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/6
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Title</title>
    <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js"></script>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="images/favicon.png" type="image/png">

    <title>Bracket Responsive Bootstrap3 Admin</title>

    <link rel="stylesheet" href="css/style.default.css" />

    <link rel="stylesheet" href="css/bootstrap-timepicker.min.css" />
    <link rel="stylesheet" href="css/jquery.tagsinput.css" />
    <link rel="stylesheet" href="css/colorpicker.css" />
    <link rel="stylesheet" href="css/dropzone.css" />
</head>
<body>
    <form id="select" action="project/selectByDate" class="input-group">
        <input name="beginTime" id="beginTime" type="date" class="dataTable">
        <input name="endTime" id="endTime" type="date">
        <button type="submit">qwewfrgew</button>
    </form>
    <input type="button" onclick="submit()" value="submit">
    <table>
        <tr>
            <th>Project ID</th>
            <th>Project Name</th>
            <th>Describe</th>
            <th>Build Time</th>
            <th>Type</th>
        </tr>
        <tbody id="project_inf">
        </tbody>
    </table>
    <input id="userId" type="hidden" value="${user.id}">
<script>

    $(document).ready(function () {
        setInterval("ajaxupdate()",5000);

    });

    function ajaxupdate(){
        $.ajax({
            url:"/message/checkMessage",
            type:"POST",
            success:function(result){
                var data=result.data;
                var length=data.length;
                for (var i=0;i<length;i++){

                    $.gritter.add({
                        title: 'New Message',
                        text: data[i].messageBody,
                        class_name: 'growl-primary',
                        image: 'images/screen.png',
                        sticky: true,
                        time: ''
                    });
                }
            },
            error:function(){
                alert("failed");
            }
        });
    }

    function submit() {
        $.ajax({
            url:"/project/selectByDate",
            type:"post",
            dataType:"json",
            data:$("#select").serialize(),
            success:function (result) {
                var tbody = window.document.getElementById("project_inf");
                var len = result.length;
                var tablestr="";
                for ( var i = 0; i < len; i++) {
                    tablestr = tablestr + "<tr>"
                        +"<td><input class='check' id='checkOne' name='checkOne' type='checkbox' value='"+result[i].key+"' /></td>"
                        +"<td>"+ result[i].id + "</td>"
                        +"<td>"+ result[i].projectName + "</td>"
                        +"<td>"+ result[i].projectDescribe + "</td>"
                        +"<td>"+ Date(result[i].buildTime)+"</td>"
                        +"<td>"+ result[i].projectType+"</td>"
                        +"</tr>";
                }
                tbody.innerHTML = tablestr;
            },
            error:function () {
                alert("ERROR");
            }
        });
    }
</script>
</body>
</html>
