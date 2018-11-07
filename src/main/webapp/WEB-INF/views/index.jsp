<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE HTML>
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
        <h1 align="center"><span >[Poject] [Management]</span></h1>
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
              <li><a href=""><i class="fa fa-user"></i> <span>Profile</span></a></li>
              <li><a href="/myapplication"><i class="fa fa-cog"></i> <span>My Application</span></a></li>
              <li><a href=""><i class="fa fa-question-circle"></i> <span>Help</span></a></li>
              <li><a href="/logout"><i class="fa fa-sign-out"></i> <span>Log Out</span></a></li>
            </ul>
        </div>

      <h5 class="sidebartitle">Navigation</h5>
      <ul class="nav nav-pills nav-stacked nav-bracket">
        <li class="active"><a href="/index"><i class="fa fa-home"></i> <span>Dashboard</span></a></li>
        
        <li class="nav-parent"><a href=""><i class="fa fa-edit"></i> <span>Project Insert</span></a>
          <ul class="children">
            <li><a href="/insertProject"><i class="fa fa-caret-right"></i> Add Project</a></li>
            <li><a href="/insertEmployee"><i class="fa fa-caret-right"></i> Add Employee</a></li>
          </ul>
        </li>
        <li class="nav-parent"><a href=""><i class="fa fa-search"></i> <span>Management</span></a>
          <ul class="children">
            <li><a href="/projectList"><i class="fa fa-caret-right"></i> Projects</a></li>
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
                <h5 class="title">You Have New Message</h5>
                <ul class="dropdown-list gen-list">  
                  <li class="new"><a href="">Read All Messages</a></li>
                </ul>
              </div>
            </div>
          </li>
          
          <li>
            <div class="btn-group">
              <button type="button" class="btn btn-default dropdown-toggle tp-icon" data-toggle="dropdown">
                <i class="fa fa-user" id="userName"></i>
                <span class="caret"></span>
              </button>
              <ul class="dropdown-menu dropdown-menu-usermenu pull-right">
                <li><a href="#"><i class="glyphicon glyphicon-cog"></i> Profile</a></li>
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
      <h2><i class="fa fa-home"></i> Dashboard</h2>
      <div class="breadcrumb-wrapper">
        <span class="label">You are here:</span>
        <ol class="breadcrumb">
          <li><a href="/index">Dashboard</a></li>
        </ol>
      </div>
    </div>
   
   <div class="contentpanel1">
          <div class="row">

        <div class="col-sm-6 col-md-3">
          <div class="panel panel-success panel-stat">
            <div class="panel-heading">

              <div class="stat">
                <div class="row">
                  <div class="col-xs-4">
                    <img src="images/is-user.png" alt="" />
                  </div>
                  <div class="col-xs-8">
                    <small class="stat-label">Visits</small>
                    <h1>56</h1>
                  </div>
                </div><!-- row -->

                <div class="mb15"></div>

                <div class="row">
                  <div class="col-xs-6">
                    <small class="stat-label">Pages / Visit</small>
                    <h4>10.90</h4>
                  </div>

                  <div class="col-xs-6">
                    <small class="stat-label">% New Visits</small>
                    <h4>55.55%</h4>
                  </div>
                </div><!-- row -->
              </div><!-- stat -->

            </div><!-- panel-heading -->
          </div><!-- panel -->
        </div><!-- col-sm-6 -->

        <div class="col-sm-6 col-md-3">
          <div class="panel panel-danger panel-stat">
            <div class="panel-heading">

              <div class="stat">
                <div class="row">
                  <div class="col-xs-4">
                    <img src="images/is-document.png" alt="" />
                  </div>
                  <div class="col-xs-8">
                    <small class="stat-label">% Unique Visitors</small>
                    <h1>54.40%</h1>
                  </div>
                </div><!-- row -->

                <div class="mb15"></div>

                <small class="stat-label">Avg. Visit Duration</small>
                <h4>01:80:22</h4>

              </div><!-- stat -->

            </div><!-- panel-heading -->
          </div><!-- panel -->
        </div><!-- col-sm-6 -->

        <div class="col-sm-6 col-md-3">
          <div class="panel panel-primary panel-stat">
            <div class="panel-heading">

              <div class="stat">
                <div class="row">
                  <div class="col-xs-4">
                    <img src="images/is-document.png" alt="" />
                  </div>
                  <div class="col-xs-8">
                    <small class="stat-label">Page Views</small>
                    <h1>256</h1>
                  </div>
                </div><!-- row -->

                <div class="mb15"></div>

                <small class="stat-label">% Bounce Rate</small>
                <h4>34.23%</h4>

              </div><!-- stat -->

            </div><!-- panel-heading -->
          </div><!-- panel -->
        </div><!-- col-sm-6 -->

        <div class="col-sm-6 col-md-3">
          <div class="panel panel-dark panel-stat">
            <div class="panel-heading">

              <div class="stat">
                <div class="row">
                  <div class="col-xs-4">
                    <img src="images/is-money.png" alt="" />
                  </div>
                  <div class="col-xs-8">
                    <small class="stat-label">Today's Earnings</small>
                    <h1>$557</h1>
                  </div>
                </div><!-- row -->

                <div class="mb15"></div>

                <div class="row">
                  <div class="col-xs-6">
                    <small class="stat-label">Last Week</small>
                    <h4>$468</h4>
                  </div>

                  <div class="col-xs-6">
                    <small class="stat-label">Last Month</small>
                    <h4>$13250</h4>
                  </div>
                </div><!-- row -->

              </div><!-- stat -->

            </div><!-- panel-heading -->
          </div><!-- panel -->
        </div><!-- col-sm-6 -->
      </div><!-- row -->
   </div><!--contentpanel1-->

         <div class="row">
        <div class="col-sm-8 col-md-9">
          <div class="panel panel-default">
            <div class="panel-body">
              <div class="row">
                <div class="col-sm-8">
                  <h5 class="subtitle mb5">Network Performance</h5>
                  <div id="basicflot" style="width: 100%; height: 300px; margin-bottom: 20px"></div>
                </div><!-- col-sm-8 -->
                <div class="col-sm-4">
                  <h5 class="subtitle mb5">Server Status</h5>
                  <p class="mb15">Summary of the status of your server.</p>

                  <span class="sublabel">New Visitors (55.5%)</span>
                  <div class="progress progress-sm">
                    <div style="width: 40%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="40" role="progressbar" class="progress-bar progress-bar-primary"></div>
                  </div><!-- progress -->

                  <span class="sublabel">New Projects (32.2%)</span>
                  <div class="progress progress-sm">
                    <div style="width: 32%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="40" role="progressbar" class="progress-bar progress-bar-success"></div>
                  </div><!-- progress -->

                  <span class="sublabel">New Employees (82.2%)</span>
                  <div class="progress progress-sm">
                    <div style="width: 82%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="40" role="progressbar" class="progress-bar progress-bar-danger"></div>
                  </div><!-- progress -->

                  <span class="sublabel">Unhandle Applications (3/5)</span>
                  <div class="progress progress-sm">
                    <div style="width: 63%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="40" role="progressbar" class="progress-bar progress-bar-warning"></div>
                  </div><!-- progress -->

                  <span class="sublabel">Online Vistors (2/10)</span>
                  <div class="progress progress-sm">
                    <div style="width: 20%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="40" role="progressbar" class="progress-bar progress-bar-success"></div>
                  </div><!-- progress -->

                  <span class="sublabel">Email Account (13/50)</span>
                  <div class="progress progress-sm">
                    <div style="width: 26%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="40" role="progressbar" class="progress-bar progress-bar-success"></div>
                  </div><!-- progress -->


                </div><!-- col-sm-4 -->
              </div><!-- row -->
            </div><!-- panel-body -->
          </div><!-- panel -->
        </div><!-- col-sm-9 -->

        <div class="col-sm-4 col-md-3">

          <div class="panel panel-default">
            <div class="panel-body">
            <h5 class="subtitle mb5">Most Browser Used</h5>
            <div id="donut-chart2" class="ex-donut-chart"></div>
            </div><!-- panel-body -->
          </div><!-- panel -->

        </div><!-- col-sm-3 -->

      </div><!-- row -->
  </div>
  <input id="userId" type="hidden" value="${user.id}">
</section>
<script>
    $(document).ready(function () {
        var user=eval ("(" +localStorage.getItem("user")+ ")");
        //document.getElementById("userName").innerText=user.userName;
        $("#userName").text(user.userName);
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
<script src="js/jquery.gritter.min.js"></script>

<script src="js/checkOutputUser.js"></script>
</body>
</html>
