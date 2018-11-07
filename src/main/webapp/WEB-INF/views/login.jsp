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

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
</head>

<body class="signin">





<section>

    <div class="signinpanel">

        <div class="row">

            <div class="col-md-7">

                <div class="signin-info">
                 

                    <div class="mb20"></div>

                    <h3><strong>Welcome to Project Management</strong></h3>
                    <ul>
                        <li><i class="fa fa-arrow-circle-o-right mr5"></i>YHYSB</li>
                        <li><i class="fa fa-arrow-circle-o-right mr5"></i> Add Your Employees</li>
                        <li><i class="fa fa-arrow-circle-o-right mr5"></i> Retina Ready</li>
                        <li><i class="fa fa-arrow-circle-o-right mr5"></i> Be Ready TO Management Your PRojects</li>
                        <li><i class="fa fa-arrow-circle-o-right mr5"></i> and much more...</li>
                    </ul>
                    <div class="mb20"></div>
                    <strong>Not a member? <a href="/signup">Sign Up</a></strong>
                </div><!-- signin0-info -->

            </div><!-- col-sm-7 -->

            <div class="col-md-5">

                <form id="logincheck">
                    <h4 class="nomargin">Sign In</h4>
                    <p class="mt5 mb20">Login to access your account.</p>

                    <input type="text" class="form-control uname" placeholder="userName" id="userName" name="userName" onblur="isnull('userName','warnusername')"/>
                    <p></p>
                    <p id="warnusername" style="color: #ff0000"></p>
                    <input type="password" class="form-control pword" placeholder="password" id="password" name="password" onblur="isnull('password','warnpassword')"/>
                    <p></p>
                    <p id="warnpassword" style="color: #ff0000"></p>
                    <p id="error" style="color: #ff0000"></p>
                    <a href=""><small>Forgot Your Password?</small></a>
                    <input class="btn btn-success btn-block" type="button" value="Sign In" onclick="logincheck()" />

                </form>
            </div><!-- col-sm-5 -->

        <div class="signup-footer">
            <div class="pull-left">
                &copy; 2018. All Rights Reserved. Mr Wen,Mr Wang,Mr He,Mr Yang.
            </div>
            <div class="pull-right">
                Created By: <a href="" target="_blank">睿道大雪雕</a>
            </div>
        </div>

    </div><!-- signin -->
    </div>
    <input id="userId" type="hidden" value="${user.id}">
</section>


<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/jquery-migrate-1.2.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/modernizr.min.js"></script>
<script src="js/jquery.sparkline.min.js"></script>
<script src="js/jquery.cookies.js"></script>

<script src="js/toggles.min.js"></script>
<script src="js/retina.min.js"></script>

<script src="js/custom.js"></script>
<script type="text/javascript" src="js/checkOutputUser.js"></script>
<script>
    jQuery(document).ready(function(){

        // Please do not use the code below
        // This is for demo purposes only
        var c = jQuery.cookie('change-skin');
        if (c && c == 'greyjoy') {
            jQuery('.btn-success').addClass('btn-orange').removeClass('btn-success');
        } else if(c && c == 'dodgerblue') {
            jQuery('.btn-success').addClass('btn-primary').removeClass('btn-success');
        } else if (c && c == 'katniss') {
            jQuery('.btn-success').addClass('btn-primary').removeClass('btn-success');
        }
    });
</script>
<script>
    function logincheck() {
        $.ajax({
            method:"POST",
            url:"logincheck",
            data:$("#logincheck").serialize(),
            success:function (result) {
                if(result.code===400)
                    window.document.getElementById("error").innerText=result.message;
                else {
                    localStorage.setItem("user",JSON.stringify(result.data));
                    window.location.href="index";
                }
            },
            error:function (){
                window.document.getElementById("error").innerText=("Unknow error,Please check your network");
            }
        });

    }
</script>
</body>
</html>

