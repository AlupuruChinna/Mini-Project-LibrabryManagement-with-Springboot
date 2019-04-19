<head>
    <link href="sml.css" type="text/css" rel="stylesheet">
<%--    <link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">--%>
    <link href="webjars/jquery/2.1.4/jquery.min.js" rel="script">


</head>

<div class="container">
    <%@include file="commons/header.jspf"%>
    <%@include file="commons/navigations.jspf"%>


   <%-- <div class="container">--%>
        <div class="card card-login mx-auto text-center bg-dark">
            <div class="card-header mx-auto bg-dark">
                <%--<span> <img src="/images/Smart.jpg" class="w-75" alt="Logo" width="800" height="40"/></span><br/>--%>

                <span class="logo_title mt-5"> Smart Library Management </span>

            </div>
            <div class="card-body">
              <form method="post">
                    <%--<div class="input-group form-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text"><i class="fas fa-user"></i></span>
                        </div>
                        <input type="text" name="membername" class="form-control" placeholder="Enter member name">

                    </div>

                    <div class="input-group form-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text"><i class="fas fa-key"></i></span>
                        </div>
                        <input type="text" name="book1" class="form-control" placeholder="Enter book name">
                    </div>
--%>
                    <div class="input-group form-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text"><i class="fas fa-user"></i></span>
                        </div>

                        <select class="form-control" id="filtering" name="memberName">
                            <option selected hidden> Choose Member </option>
                            <c:forEach items="${memberlist}" var="member">
                            <option>${member.member_name}</option>

                            </c:forEach>
                        </select>



                    </div>

                    <div class="input-group form-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text"><i class="fas fa-user"></i></span>
                        </div>


                        <select class="form-control " aria-live="polite" name="bookName">
                            <option selected hidden> Select Book One </option>
                            <c:forEach items="${bookslist}" var="book">
                                <option data-tokens="some">${book.book_name}</option>
                            </c:forEach>
                        </select>



                    </div>
                        <div>
                            <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-user"></i></span>
                                </div>

                                <select class="form-control " aria-live="polite" name="bookName2">
                                <option selected hidden> Select Book Two </option>
                                <c:forEach items="${bookslist}" var="book">
                                    <option data-tokens="some">${book.book_name}</option>
                                </c:forEach>
                            </select>


                        </div>

                        <div>

                            <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-user"></i></span>
                                </div>

                                <select class="form-control" aria-live="polite" name="bookName3">
                                <option hidden> Select Book Three </option>

                                <c:forEach items="${bookslist}" var="book">
                                    <option data-tokens="some">${book.book_name}</option>
                                </c:forEach>
                            </select>
                        </div>

                        <div class="form-group">
                        <input type="submit" name="btn" value="Enter" class="btn btn-outline-primary float-right login_btn">
                    </div>



                </form>
            </div>
        </div>
    </div>


        <%@include file="commons/footer.jspf"%>
    </div>
</div>
