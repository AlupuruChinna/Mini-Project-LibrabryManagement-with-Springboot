<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="container" align="center">
    <%@include file="commons/header.jspf"%>
    <%@include file="commons/navigations.jspf"%>

    <h4> Select book for getting details more..</h4>
<head>
        <link href="search.css" rel="stylesheet">
    </head>

<div class="container search-table">
    <div class="search-box">
        <div class="row">
            <div class="col-md-3">
                <h5>Search All Fields</h5>
            </div>
            <div class="col-md-9">
                <input type="text" id="myInput" onkeyup="myFunction()" class="form-control" placeholder="Search your book name">
                <script>
                    $(document).ready(function () {
                        $("#myInput").on("keyup", function () {
                            var value = $(this).val().toLowerCase();
                            $("#myTable tr").filter(function () {
                                $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
                            });
                        });
                    });
                </script>
            </div>
        </div>
    </div>
    <div class="search-list">
        <h6>Select Book</h6>
    <table class="table" id="myTable">
            <thead>
            <tr>
                <th>Title</th>
                <th>Date of Entry</th>
                <th>Available?</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach items="${searchbook}" var="book">
            <tr>
                <td><a href="/get-book-details-one?book_name=${book.book_name}"> ${book.book_name}</a></td>
                <td><fmt:formatDate value="${book.book_published}" pattern="dd-MMM-YYYY"></fmt:formatDate> </td>
                <td>${book.is_book_available}</td>
            </tr>
            </c:forEach>
            </tbody>
        </table>

    </div>
</div>
<%@include file="commons/footer.jspf"%>
