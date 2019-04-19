
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="container" align="center">
    <%@include file="commons/header.jspf"%>
    <%@include file="commons/navigations.jspf"%>
    <div>
  <%--      <h3>List Of All books has been shown here </h3>--%>

<%--        ${listofbooks}--%>

        <section id="tabs" class="project-tab">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <nav>
                            <div  id="nav-tab" role="tablist" align="center">
                               <h4> <a class="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-home" role="tab" aria-controls="nav-home" aria-selected="true">List of Books</a></h4>

                            </div>
                        </nav>
                        <div class="tab-content" id="nav-tabContent">
                            <div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">


                                <table class="table" cellspacing="0">
                                    <thead>
                                    <tr>
                                        <th>Book Number</th>
                                        <th>Book Name</th>
                                        <th>Author</th>
                                        <th>Date of Entered</th>

                                    </tr>

                                    </thead>

                                    <tbody>
                                    <c:forEach items="${listofbooks}" var="book">
                                    <tr>

                                        <td><a href="#">${book.book_id}</a></td>
                                        <td>${book.book_name}</td>
                                        <td>${book.book_authors}</td>
                                        <%--<td><fmt:formatDate value="${book.book_date_of_barrow}" pattern="dd-MM-YYYY"></fmt:formatDate> </td>
                                        <td><fmt:formatDate value="${book.book_date_of_return}" pattern="dd-MM-YYYY"></fmt:formatDate> </td>--%>
                                        <td><fmt:formatDate value="${book.book_published}" pattern="dd-MM-YYYY"></fmt:formatDate> </td>
                                        <td><a href="/edit-book?id=${book.book_id}" class="btn btn-dark">Edit</a></td>
                                        <td><a href="/delete-book?id=${book.book_id}" class="btn btn-danger">Delete</a></td>

                                    </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>

                            </div>

                        </div>
                    </div>
                </div>
            </div>
            <a href="/add-book" class="btn btn-success">Add New Book</a>
    </div>
<%@include file="commons/footer.jspf"%>
</div>