<%@include file="ustils/header.jsp" %>
<div class="row" style="margin-top: 100px; margin-left: 20%;">
<form action="addUser" method="post">
    <div class="form-group">
        <label for="username">User Name</label>
        <input type="text" placeholder="UserName" name="username" id="username"  class="form-control username-field"  aria-describedby="userNameHelp" >
        <small id="userNameHelp" class="form-text text-muted">We'll never share your username with anyone else.</small>
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input type="password" placeholder="Password" name="password" id="password" class="" class="form-control password-fieldld" aria-describedby="passwordHelp" >
        <small id="passwordHelp" class="form-text text-muted">We'll never share your password with anyone else.</small>

    </div>
    <div class="form-group">
        <label for="conf-password">Password</label>
        <input type="password" placeholder="Confirm Password" name="conf-password" id="conf-password" class="" class="form-control conf-password-field" aria-describedby="conf-passwordHelp" >
        <small id="conf-passwordHelp" class="form-text text-muted">We'll never share your password with anyone else.</small>

    </div>
    <div class="form-check">
        <input type="checkbox" class="form-check-input show-password" id="show-password" onclick="showPassword()">
        <label class="form-check-label" for="show-password">Show Password</label>
    </div>
    <button type="submit" class="btn btn-primary" id="btnAddUser" disabled>Submit</button>
</form>
</div>
<script>

    
    function showPassword() {
        var conpass = document.getElementById("conf-password");
        var pass = document.getElementById("password")
        if (pass.type === "password") {
            pass.type = "text";
            conpass.type = "text";
        } else {
            pass.type = "password";
            conpass.type = "password";
        }
        }
    $("#password").on("change paste keyup", function() {
        document.getElementById("conf-password").value = '';
        $("#conf-password").css("border", "1px solid white");
        $("#password").css("border", "1px solid white");
    });
    $("#conf-password").on("change paste keyup", function() {
        if ($("#conf-password").val()===$("#password").val()){
                $("#conf-password").css("border", "5px solid green");
                $("#password").css("border", "5px solid green");
                $("#btnAddUser").removeAttr('disabled');

        }else {
                $("#conf-password").css("border", "5px solid red");
                $("#password").css("border", "5px solid red");
        }

    });
    function showPassword() {
        var conpass = document.getElementById("conf-password");
        var pass = document.getElementById("password")
        if (pass.type === "password") {
            pass.type = "text";
            conpass.type = "text";
        } else {
            pass.type = "password";
            conpass.type = "password";
        }
    }

/*$( document ).ready(function() {
        function showPassword() {
            var x = document.getElementById("show-password");
            if (x.type === "password") {
                x.type = "text";
            } else {
                x.type = "password";
            }
        }
    });*/
</script>

</form>

</body>
</html>
