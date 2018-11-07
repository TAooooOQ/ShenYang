<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="">
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
  
    <div class="signuppanel">
        
        <div class="row">
            
            <div class="col-md-6">
                
                <div class="signup-info">
                    <div class="logopanel">
                        <h1><span>[</span> bracket <span>]</span></h1>
                    </div><!-- logopanel -->
                
                    <div class="mb20"></div>
                
                    <h5><strong>Bootstrap 3 Admin Template!</strong></h5>
                    <p>Bracket is a theme that is perfect if you want to create your own content management, monitoring or any other system for your project.</p>
                    <p>Below are some of the benefits you can have when purchasing this template.</p>
                    <div class="mb20"></div>
                    
                    <div class="feat-list">
                        <i class="fa fa-wrench"></i>
                        <h4 class="text-success">Easy to Customize</h4>
                        <p>Bracket is made using Bootstrap 3 so you can easily customize any element of this template following the structure of Bootstrap 3.</p>
                    </div>
                    
                    <div class="feat-list">
                        <i class="fa fa-compress"></i>
                        <h4 class="text-success">Fully Responsive Layout</h4>
                        <p>Bracket is design to fit on all browser widths and all resolutions on all mobile devices. Try to scale your browser and see the results.</p>
                    </div>
                    
                    <div class="feat-list mb20">
                        <i class="fa fa-search-plus"></i>
                        <h4 class="text-success">Retina Ready</h4>
                        <p>When a user load a page, a script checks each image on the page to see if there's a high-res version of that image. If a high-res exists, the script will swap that image in place.</p>
                    </div>
                    
                    <h4 class="mb20">and much more...</h4>
                
                </div><!-- signup-info -->
            
            </div><!-- col-sm-6 -->
            
            <div class="col-md-6">
                
                <form id="info">
                    
                    <h3 class="nomargin">Sign Up</h3>
                    <p class="mt5 mb20">Already a member? <a href="signin.html"><strong>Sign In</strong></a></p>
                
                    <label class="control-label">Name</label>
                    <div class="row mb10">
                        <div class="col-sm-6">
                            <input type="text" class="form-control" placeholder="Firstname" id="Firstname" onblur="isnull('Firstname','WarnFirstUsername')" />
                            <p id="WarnFirstUsername" style="color: #ff0000"></p>
                        </div>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" placeholder="Lastname" id="Lastname" onblur="isnull('Lastname','WarnLastUsername')" />
                            <p id="WarnLastUsername" style="color: #ff0000"></p>
                        </div>
                    </div>

                    <div class="mb10">
                        <label class="control-label">Username</label>
                        <input type="text" class="form-control" id="userName" onblur="isnull('userName','WarnUsername')" oninput="usernamecheck()"/>
                      </div>
                      <p id="WarnUsername" style="color: #ff0000"></p>
                      <p id="WarnUsername2" style="color: #ff0000"></p>
                    <div class="mb10">
                        <label class="control-label">Password</label>
                        <input type="password" class="form-control" id="password" onblur="isnull('password','WarnPassword')" />
                    </div>
                    <p id="WarnPassword" style="color: #ff0000"></p>
                    
                    <div class="mb10">
                        <label class="control-label">Retype Password</label>
                        <input type="password" class="form-control" id="RetypePassword" oninput="validate('password','RetypePassword','WarnRetypePassword')"  />
                    </div>
                    <p id="WarnRetypePassword" style="color: #ff0000"></p>
                    
                
                    <div class="mb10">
                        <label class="control-label">Email Address</label>
                        <input type="text" class="form-control" id="email" onblur="CheckMail('email','warnEmail')" />
                    </div>
                    <p id="warnEmail" style="color: #ff0000"></p>

                    <br/>
                     <input type="button" class="btn btn-success btn-block" value="Sign Up" onclick="check()"/>
                     <p id="error" style="color: #ff0000"></p> 
                     <p id="name" style="color: #ff0000"></p> 
                 </form>
                     
                
            </div><!-- col-sm-6 -->
            
        </div><!-- row -->
        
        <div class="signup-footer">
            <div class="pull-left">
                &copy; 2018. All Rights Reserved. Mr Wen,Mr Wang,Mr He,Mr Yang.
            </div>
            <div class="pull-right">
                Created By: <a href="" target="_blank">睿道大雪雕</a>
            </div>
        </div>
        
    </div><!-- signuppanel -->
    <input id="userId" type="hidden" value="${user.id}">
</section>
<script>
function signup() {
        $.ajax({
            method:"POST",
            url:"signUp",
            data:{
                "userName":$("#userName").val(),
                "password":$("#password").val(),
                "email":$("#email").val()
            },
            success:function (result) {
                if(result.code==400)
                    window.document.getElementById("error").innerText="result.message";
                else  window.location.href="/login"
            },
            error:function (){
                window.document.getElementById("error").innerText="Unknow error,Please check your network";
            }
        });

}
</script>
<script>
function usernamecheck(){
   $.ajax({
            method:"POST",
            url:"userNameCheck",
            data:{
                "userName": $("#userName").val()},
            success:function (result) {
                if(result.code==400){
                    window.document.getElementById("WarnUsername2").innerText=result.message;
                }
                else window.document.getElementById("WarnUsername2").innerText="";
            },
            error:function (){
                window.document.getElementById("error").innerText="Unknow error,Please check your network";
            }
        });
}            
</script>
<script>
	
function check(){
        if (Firstname.value==""||Lastname.value==""||userName.value==""||password.value==""||RetypePassword.value==""||email.value==""||password.value!=RetypePassword.value||WarnUsername2.innerText!=="") {
           alert("Please Input Correct Information");
        }
        else{
            signup();
        }

}

</script>
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/jquery-migrate-1.2.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/modernizr.min.js"></script>
<script src="js/jquery.sparkline.min.js"></script>
<script src="js/jquery.cookies.js"></script>

<script src="js/toggles.min.js"></script>
<script src="js/retina.min.js"></script>

<script src="js/select2.min.js"></script>

<script src="js/custom.js"></script>
<script type="text/javascript" src="js/checkOutputUser.js"></script>
<script>
    jQuery(document).ready(function(){
        
        jQuery(".select2").select2({
            width: '100%',
            minimumResultsForSearch: -1
        });
        
        jQuery(".select2-2").select2({
            width: '100%'
        });
        
        
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

</body>
</html>
