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
    <link href="css/jquery.datatables.css" rel="stylesheet">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
    <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js"></script>
</head>

<body>



<!-- Preloader -->
<div id="preloader">
    <div id="status"><i class="fa fa-spinner fa-spin"></i></div>
</div>

<section>

    <div class="leftpanel">

        <div class="logopanel">
            <h1 align="center"><span>[Poject] [Management]</span></h1>
        </div><!-- logopanel -->

        <div class="leftpanelinner">

            <!-- This is only visible to small devices -->
            <div class="visible-xs hidden-sm hidden-md hidden-lg">
                <div class="media userlogged">
                    <img alt="" src="" class="media-object">
                    <div class="media-body">
                        <h4>YHY</h4>
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
                <li class=""><a href="/index"><i class="fa fa-home"></i> <span>Dashboard</span></a></li>

                <li class="nav-parent"><a href=""><i class="fa fa-edit"></i> <span>Project Insert</span></a>
                    <ul class="children">
                        <li><a href="/insertProject"><i class="fa fa-caret-right"></i> Add Project</a></li>
                        <li><a href="/insertEmployee"><i class="fa fa-caret-right"></i> Add Employee</a></li>
                        <li><a href="#"><i class="fa fa-caret-right"></i> Add Employee For Project</a></li>
                    </ul>
                </li>
                <li class="nav-parent nav-active active"><a href=""><i class="fa fa-search"></i> <span>Management</span></a>
                    <ul class="children" style="display: block">
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

            <div class="infosummary">
                <h5 class="sidebartitle">Information Summary</h5>

            </div><!-- infosummary -->

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
                                <span class="badge"></span>
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
                                <i class="fa fa-user"></i>
                                YHY
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
            <h2><i class="fa fa-search"></i> Employees</h2>
            <div class="breadcrumb-wrapper">
                <span class="label">You are here:</span>
                <ol class="breadcrumb">
                    <li><a href="/staffList">Employees</a></li>
                    <li class="active">Management</li>
                    <li><a href="/index">Dashboard</a></li>
                </ol>
            </div>
        </div>
        <div class="contentpanel">


            <div class="clearfix mb30"></div>
            <h5 class="subtitle mb5">Staff</h5>
            <div class="table-responsive">
                <table class="table table-striped" id="table2">
                    <thead>
                    <tr>
                        <th>id  </th>
                        <th>staffName</th>
                        <th>staffSex</th>
                        <th>staffAge</th>
                        <th>staffPhone</th>
                        <th>operate</th>
                    </tr>
                    </thead>
                </table>

            </div><!-- table-responsive -->

        </div><!-- panel-body -->
    </div><!-- panel -->

    </div><!-- contentpanel -->

    <div class="rightpanel">
        <!-- Nav tabs -->
        <ul class="nav nav-tabs nav-justified">
            <li class="active"><a href="#rp-alluser" data-toggle="tab"><i class="fa fa-users"></i></a></li>
            <li><a href="#rp-favorites" data-toggle="tab"><i class="fa fa-heart"></i></a></li>
            <li><a href="#rp-history" data-toggle="tab"><i class="fa fa-clock-o"></i></a></li>
            <li><a href="#rp-settings" data-toggle="tab"><i class="fa fa-gear"></i></a></li>
        </ul>



    </div><!-- tab-content -->
    </div><!-- rightpanel -->
    <!--updata-->
    <!-- Modal -->
    <form id="updata">
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title" id="myModalLabel">Update information</h4>
                    </div>
                    <div class="panel-body">
                        <div class="form-group">
                            <div class="form-group">
                                <label class="col-sm-3 control-label"><span class="asterisk">*</span>ID</label>
                                <div class="col-sm-9">
                                    <input type="text" id="id"  value="" class="form-control"  readonly="readonly" placeholder="">
                                </div>
                            </div>
                            <label class="col-sm-3 control-label">Project_Name<span class="asterisk">*</span></label>
                            <div class="col-sm-9">
                                <input type="text" name="projectName" id="staffName"  class="form-control"  placeholder="Please enter the staff name" onblur="isnull('staffName','warnname')">
                                <p id="warnname" style="color: #ff0000"></p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label" ><span class="asterisk">*</span>Staff_Sex</label>
                            <select type="text" name="application" id="staffSex" onblur="isnull('staffSex','warnsex')">
                                <option value=""> </option>
                                <option value="1">MALE</option>
                                <option value="0">FEMALE</option>

                            </select>
                                <p id="warnsex" style="color: #ff0000"></p>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">Build_Time
                                <span class="asterisk">*</span></label>
                            <div class="col-sm-9">
                                <input type="text" value="" name="staffAge" id="staffAge" class="form-control" placeholder="Please enter the staff age"  onblur="isnull('staffAge','warnage')">
                                <p id="warnage" style="color: #ff0000"></p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">Project_Type
                                <span class="asterisk">*</span></label>
                            <div class="col-sm-9">
                                <input type="text" value="" name="staffPhone" id="staffPhone" class="form-control" placeholder="Please enter the staff phone" onblur="isnull('staffPhone','warnphone')">
                                <p id="warnphone" style="color: #ff0000"></p>
                            </div>
                        </div>
                    </div>
                    <!--Submit-->
                    <div class="panel-body">
                        <div class="row">
                            <div class="col-sm-9 col-sm-offset-3">
                                <input type="button" class="btn btn-primary" value="Update Project" onclick="check(form)"/>
                                <button type="reset" class="btn btn-default" >Re-enter</button>
                                <button type="button" id="close" class="btn btn-default" data-dismiss="modal">Close</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div><!-- modal-content -->
        </div><!-- modal-dialog -->
        </div><!-- modal -->
    </form>
</section>
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

    function check(){
        if (staffName.value===""||staffSex.value===""||staffAge.value===""||staffPhone.value==="") {
            alert("Please Input Correct Information");
        }
        else{
            $.ajax({
                url:"staff/update",
                type:"POST",
                data:{
                    "id": $("#id").val(),
                    "staffName": $("#staffName").val(),
                    "sex": $("#staffSex").val(),
                    "staffAge": $("#staffAge").val(),
                    "staffPhone": $("#staffPhone").val()
                },
                success:function (result) {
                    if(result.code===400)
                        alert(result.message);
                    else {
                        //alert("success");
                        table.ajax.reload();
                        document.getElementById("close").click();
                    }
                }
            });
        }

    }
</script>
<script>

    var table;
    $(document).ready(function() {
        table=  $('#table2').DataTable({
            "processing": true,
            "searching": true,
            "bPaginate": true, //翻页功能
            "bLengthChange": true, //改变每页显示数据数量
            "bSort": true, //排序功能
            "bAutoWidth": false ,//自动宽度s
            "ajax": {
                "url": "staff/listAll",
                "dataSrc" : '',
                "type" : "POST"
            },
            "columns": [
                {"data": "id"},
                {"data": "staffName"},
                {"data": "staffSex"},
                {"data": "staffAge"},
                {"data": "staffPhone"}
            ],
            "columnDefs":[
                {"targets": 5,//编辑
                    "data": null,
                    "defaultContent": "<input type='button' id='delete1' class='fa fa-trash-o delete-row'  onclick='deleterow(this)'value='delete'/>" +
                    "<input type='button' class='fa fa-trash-o updateInformation' id='updateInformation' data-toggle='modal' data-target='#myModal'  value='update'onclick='updaterow(this)'/>\n"}
            ]
        });
    });
    function deleterow(id){
        var c = confirm("Continue delete?");
        if(c){
            jQuery(id).closest('tr').fadeOut(function(){
                $.ajax({
                    url:"staff/delete",
                    type:"POST",
                    data:{
                        "id":$(id).parent().parent().children()[0].innerHTML
                    },
                    success:function (result) {
                        if(result.code===400)
                            alert(result.message);
                        else {
                            alert("success");
                            table.jQuery(this).remove();
                        }
                    }
                });
            });
        }
        return false;
    }

    function updaterow(id) {

        "use strict";
        var $info; //临时接收 click 的对象

        $info = $(id).parent().parent().children();
        $('#id').val($info[0].innerHTML);
        $('#staffName').val($info[1].innerHTML);
        $('#staffSex').val($info[2].innerHTML=="MALE"?1:0);
        $('#staffAge').val($info[3].innerHTML);
        $('#staffPhone').val($info[4].innerHTML);


        return false;
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
<script src="js/jquery.datatables.min.js"></script>
<script src="js/select2.min.js"></script>
<script src="js/checkOutputUser.js"></script>

</body>
</html>
