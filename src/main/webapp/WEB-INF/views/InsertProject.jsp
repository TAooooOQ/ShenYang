<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="">
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <link rel="shortcut icon" href="images/favicon.png" type="image/png">

  <title>睿道大雪雕</title>

  <link href="css/style.default.css" rel="stylesheet">
  <link href="css/jquery.gritter.css" rel="stylesheet">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
    <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js"></script>

  <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!--[if lt IE 9]>
  <script src="js/html5shiv.js"></script>
  <script src="js/respond.min.js"></script>
  <![endif]-->
</head>

<body>



<!-- Preloader -->
<div id="preloader">
    <div id="status"><i class="fa fa-spinner fa-spin"></i></div>
</div>

<section>

  <div class="leftpanel">

    <div class="logopanel">
        <h1 align="center"><span>Poject Management</span></h1>
    </div><!-- logopanel -->

    <div class="leftpanelinner">

        <!-- This is only visible to small devices -->
        <div class="visible-xs hidden-sm hidden-md hidden-lg">
            <div class="media userlogged">
                <img alt="" src="" class="media-object">
                <div class="media-body">
                    <h4>${user.userName}</h4>
                    <span>"Life is so..."</span>
                </div>
            </div>

            <h5 class="sidebartitle actitle">Account</h5>
            <ul class="nav nav-pills nav-stacked nav-bracket mb30">
                <li><a href=""><i class="fa fa-cog"></i> <span>Profile</span></a></li>
                <li><a href="/myapplication"><i class="fa fa-user"></i> <span>My Application</span></a></li>
                <li><a href=""><i class="fa fa-question-circle"></i> <span>Help</span></a></li>
                <li><a href="/logout"><i class="fa fa-sign-out"></i> <span>Log Out</span></a></li>
            </ul>
        </div>

      <h5 class="sidebartitle">Navigation</h5>
      <ul class="nav nav-pills nav-stacked nav-bracket">
        <li class=""><a href="/index"><i class="fa fa-home"></i> <span>Dashboard</span></a></li>
        
        <li class="nav-parent nav-active active"><a href=""><i class="fa fa-edit"></i> <span>Project Insert</span></a>
          <ul class="children" style="display: block">
            <li><a href="/insertProject"><i class="fa fa-caret-right"></i> Add Project</a></li>
            <li><a href="/insertEmployee"><i class="fa fa-caret-right"></i> Add Employee</a></li>
          </ul>
        </li>
        </li>
        <li class="nav-parent"><a href=""><i class="fa fa-search"></i> <span>Management</span></a>
          <ul class="children">
            <li><a href="/projectListl"><i class="fa fa-caret-right"></i> Projects</a></li>
            <li><a href="/staffList"><i class="fa fa-caret-right"></i> Employees</a></li>
          </ul>
        </li>
        <li class="nav-parent"><a href=""><i class="fa fa-laptop"></i> <span>Manager Controls</span></a>
            <ul class="children">
                <li><a href="#"><i class="fa fa-caret-right"></i> Users</a></li>
                <li><a href="/applicationList"><i class="fa fa-caret-right"></i> Application Processing</a></li>
            </ul>
        </li>
        <li class="nav-parent"><a href=""><i class="fa fa-user"></i> <span>Users Controls</span></a>
            <ul class="children">
                <li><a href="/application"><i class="fa fa-caret-right"></i> Application</a></li>
                <li><a href="/myapplication"><i class="fa fa-caret-right"></i> View Result</a></li>
            </ul>
        </li>
      </ul>



    </div><!-- leftpanelinner -->
  </div><!-- leftpanel -->

  <div class="mainpanel">

    <div class="headerbar">

      <a class="menutoggle"><i class="fa fa-bars"></i></a>

      <form class="searchform" action="#" method="post">
        <input type="text" class="form-control" name="keyword" placeholder="Search here..." />
      </form>

      <div class="header-right">
        <ul class="headermenu">
          <li>
            <div class="btn-group">
              <button class="btn btn-default dropdown-toggle tp-icon" data-toggle="dropdown">
                <i class="glyphicon glyphicon-envelope"></i>
                <span class="badge"></span>  <!--jiao biao-->
              </button>
              <div class="dropdown-menu dropdown-menu-head pull-right">
                <h5 class="title">You Have 1 New Message</h5>
                <ul class="dropdown-list gen-list">  
                  <li class="new"><a href="">Read All Messages</a></li>
                </ul>
              </div>
            </div>
          </li>
          
          <li>
            <div class="btn-group">
              <button type="button" class="btn btn-default dropdown-toggle tp-icon" data-toggle="dropdown">
                  <i class="fa fa-user" id="userName">${user.userName}</i>
                <span class="caret"></span>
              </button>
              <ul class="dropdown-menu dropdown-menu-usermenu pull-right">
                  <li><a href="#"><i class="glyphicon glyphicon-cog"></i>Profile</a></li>
                  <li><a href="/myapplication"><i class="glyphicon glyphicon-user"></i> My Application</a></li>
                  <li><a href="#"><i class="glyphicon glyphicon-question-sign"></i> Help</a></li>
                  <li><a href="/logout"><i class="glyphicon glyphicon-log-out"></i> Log Out</a></li>
              </ul>
            </div>
          </li>
        </ul>
      </div><!-- header-right -->

    </div><!-- headerbar -->

    <div class="pageheader">
      <h2><i class="fa fa-edit"></i> Add Project</h2>
      <div class="breadcrumb-wrapper">
        <span class="label">You are here:</span>
        <ol class="breadcrumb">
          <li><a href="/insertProject">Add Project</a></li>
          <li class="active">Project Insert</li>
          <li><a href="/index">Dashboard</a></li>
        </ol>
      </div>
    </div>
    <div class="panel-body panel-body-nopadding">
        <form class="form-horizontal form-bordered" id="project-inf">
  <!--Project_Name-->
                <div class="panel-body">
                <div class="form-group">
                  <label class="col-sm-3 control-label">Project_Name <span class="asterisk">*</span></label>
                  <div class="col-sm-9">
                    <input type="text" name="projectName" class="form-control" id="projectName" onblur="isnull('projectName','warnprojectName')">
                    <p></p>
                    <p id="warnprojectName" style="color: #ff0000"></p>
                  </div>
                </div>
 <!--Project_Describtion--> 
                  <div class="form-group">
                  <label class="col-sm-3 control-label">Project_Describtion<span class="asterisk">*</span></label>
                  <div class="col-sm-9">
                  	<textarea rows="3" class="form-control" name="projectDescribe" id="projectDescribe" placeholder="Please enter the project content"></textarea>
                  </div>
                </div>
<!--Build_Time--> 
				<div class="form-group">
				<label class="col-sm-3 control-label" for="readonlyinput"><span class="asterisk">*</span>Build_Time</label>
				<div class="col-sm-9">
				<input type="text" value="" id="buildTime" class="form-control" readonly="readonly">
				</div>
				</div>            
<!--Project_Type-->
  <div class="form-group">

                  <label class="col-sm-3 control-label">Project_Type
                  <span class="asterisk">*</span></label>
                  <div class="col-sm-9">
                    <input type="text" name="projectType" class="form-control" id="projectType" onblur="isnull('projectType','warnprojectType')">
                    <p></p>
                    <p id="warnprojectType" style="color: #ff0000"></p>
                  </div>
                </div>
              </div>
          </form>
  <!--Submit-->
  <div class="panel-body">
                <div class="row">
                  <div class="col-sm-9 col-sm-offset-3">
                    <input type="button" class="btn btn-primary" value="Insert Project" onclick="ajax()"/>
                    <button type="reset" class="btn btn-default">Re-enter</button>
                  </div>
                </div>
              </div>           
           
</div>
  </div>
    <input id="userId" type="hidden" value="${user.id}">
</section>
</body>
<script>
 $(document).ready(function () {
        setInterval("ajaxupdate()",5000);

    })
</script>
<script>
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
        error:function() {

        }
    });
}

 function ajax(){
   $.ajax({
            url:"/project/insert",
            type:"POST",
            data:$("#project-inf").serialize(),
            success:function (result) {
                if(result.code===400)
                    window.document.getElementById("error").innerText=result.message;
                else alert("success");
            },
            error:function (){
              alert("error");
            }
        });
}            

function checkProject(){
  if(projectName.value===""||projectType.value===""){
    alert("Please input the correct Information");
  }else{
    ajax();

  }
}
</script>

<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/jquery-migrate-1.2.1.min.js"></script>
<script src="js/jquery-ui-1.10.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/modernizr.min.js"></script>
<script src="js/jquery.sparkline.min.js"></script>
<script src="js/toggles.min.js"></script>
<script src="js/retina.min.js"></script>
<script src="js/jquery.cookies.js"></script>
<script src="js/flot/jquery.flot.min.js"></script>
<script src="js/flot/jquery.flot.resize.min.js"></script>
<script src="js/flot/jquery.flot.spline.min.js"></script>
<script src="js/morris.min.js"></script>
<script src="js/raphael-2.1.0.min.js"></script>
<script src="js/custom.js"></script>
<script src="js/dashboard.js"></script>
<script src="js/checkOutputUser.js"></script>
<script src="js/jquery.gritter.min.js"></script>
</body>
</html>
