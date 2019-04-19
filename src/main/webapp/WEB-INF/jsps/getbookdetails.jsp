<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="container" align="center">
    <%@include file="commons/header.jspf"%>
    <%@include file="commons/navigations.jspf"%>

    <div class="container contact">
        <div class="row">

            <div class="col-md-3" align="center">
                <br>
                <p style="font: medium" align="justify">

                    <strong>Complete Book Deatils</strong>
                </p>

                <div>
                    <table class="table table-hover">
                        <tr>
                            <h5>
                                <td>Book Id</td>
                                <td>${clickbook.book_id}</td>
                            </h5>
                        </tr>

                        <tr>
                            <h5>
                                <td>Name</td>
                                <td>${clickbook.book_name}</td>
                            </h5>
                        </tr>

                        <tr>
                            <h5>
                                <td>Authors</td>
                                <td>${clickbook.book_authors}</td>
                            </h5>
                        </tr>

                        <tr>
                            <h5>
                                <td>Published</td>
                                <td><fmt:formatDate value="${clickbook.book_published}" pattern="dd-MM-YYYY"></fmt:formatDate> </td>
                            </h5>
                        </tr>

                        <tr>
                            <h5>
                                <td>Book Availale</td>
                                <td>${clickbook.is_book_available}</td>
                            </h5>
                        </tr>




                    </table>
                </div>
            </div>

            <div class="col-md-9">
                <div class="contact-info">
                    <br>
                    <img src="/images/istock_78312587_medium.jpg" alt="image" height="200" width="300"/>

                    <h2 style="color: #4cae4c">${clickbook.book_name} - Book</h2>
                    <h4>We would love to hear from you !</h4>
                    <h3 style="color: blue">SmartLibrary, India</h3>
                </div>
            </div>

        </div>
    </div>


</div>
<%@include file="commons/footer.jspf"%>
