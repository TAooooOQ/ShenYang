
 function test()
 {
 alert("ok");
 }

function input()
{
  
  var id=1;var name="test";var time="2018-7-15-19:10";var type="test";
  document.getElementById('id').value=id;
  document.getElementById('name').value=name;
  document.getElementById('time').value=time;
  document.getElementById('type').value=type;  
}

function isnull(id,warntext) {
    	   var val=document.getElementById(id).value;
          var str = val.replace(/(^\s*)|(\s*$)/g, '');//去除空格;

        if (str == '' || str == undefined || str == null) {
            //return true;
            document.getElementById(warntext).innerHTML="&nbspPlease Fill Out";
            return false;
     
        } else {
            //return false;
            document.getElementById(warntext).innerHTML="";
            return true;
        }
}

function CheckMail(id,warntext) {
        var val=document.getElementById(id).value;
        var str = val.replace(/(^\s*)|(\s*$)/g, '');//去除空格;

        if (str == '' || str == undefined || str == null) {
            //return true;
            document.getElementById(warntext).innerHTML="&nbspPlease Fill Out";
            return false;
          }
          else{
            document.getElementById(warntext).innerHTML="";
            var filter=(/^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/);
            if (filter.test(val)){
            return true; 
            }
 
            else {
            document.getElementById(warntext).innerHTML="The Mailbox Format Is Incorrect";
            return false;
            }
          }
}


function validate(id1,id2,warntext) {
              var pwd1 = document.getElementById(id1).value;
              var pwd2 = document.getElementById(id2).value;
    <!-- 对比两次输入的密码 -->
              if(pwd1 == pwd2) {
                document.getElementById(warntext).innerHTML="";
                return true;
              }
              else {
                  document.getElementById(warntext).innerHTML="Please Enter The Same PassWord";
                  return false;

              }
          }

