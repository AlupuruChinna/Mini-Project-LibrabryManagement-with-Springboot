<div class="container">
<%@include file="commons/header.jspf"%>
<%@include file="commons/navigations.jspf"%>

    <div>
        <div id="formContent">
            <br/>
            <h3><font color="red"> ${errorMessage}</font></h3>
        <div id="login">
            <h2 class="text-center text-white pt-5">Login form</h2>
            <div class="container">
                <div id="login-row" class="row justify-content-center align-items-center">
                    <div id="login-column" class="col-md-6">
                        <div id="login-box" class="col-md-12">
                            <form id="login-form" class="form" action="" method="post">
                                <h3 class="text-center text-info">Login Here</h3>
                                <div class="form-group">
                                    <label for="username" class="text-info">Username:</label><br>
                                    <input type="text" name="username" id="username" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label for="password" class="text-info">Password:</label><br>
                                    <input type="password" name="password" id="password" class="form-control" required>
                                </div>
                                <div class="form-group">
                                 <%--   <label for="remember-me" class="text-info"><span>Remember me</span> <span><input id="remember-me" name="remember-me" type="checkbox"></span></label><br>--%>
                                    <input type="submit" name="submit" class="btn btn-info btn-md" value="submit">
                                </div>
                                <div id="register-link" class="text-right">
                                    <a href="#" class="text-info">Forget Password?</a>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>
<%@include file="commons/footer.jspf"%>
</div>
</div>
