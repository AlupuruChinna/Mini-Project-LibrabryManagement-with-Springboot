
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
                                <h4> <a class="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-home" role="tab" aria-controls="nav-home" aria-selected="true">Rigistered Users</a></h4>

                            </div>
                        </nav>
                        <div class="tab-content" id="nav-tabContent">
                            <div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">


                                <table class="table" cellspacing="0">
                                    <thead>
                                    <tr>
                                        <th>Member Number</th>
                                        <th>Member Name</th>
                                        <th>Member Address</th>
                                        <th>Date of Joined</th>

                                    </tr>

                                    </thead>

                                    <tbody>
                                    <c:forEach items="${listofmembers}" var="user">
                                        <tr>

                                            <td><a href="#">${user.member_id}</a></td>
                                            <td>${user.member_name}</td>
                                            <td>${user.member_address}</td>
                                                <%--<td><fmt:formatDate value="${book.book_date_of_barrow}" pattern="dd-MM-YYYY"></fmt:formatDate> </td>
                                                <td><fmt:formatDate value="${book.book_date_of_return}" pattern="dd-MM-YYYY"></fmt:formatDate> </td>--%>
                                            <td><fmt:formatDate value="${user.member_joined_date}" pattern="dd-MM-YYYY"></fmt:formatDate> </td>
                                            <td><a href="/edit-member?id=${user.member_id}" class="btn btn-dark">Edit</a></td>
                                            <td><a href="/delete-member?id=${user.member_id}" class="btn btn-danger">Delete</a></td>

                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>

                            </div>

                        </div>
                    </div>
                </div>
            </div>
            <a href="/add-member" class="btn btn-success">Add New Member</a>
    </div>
    <%@include file="commons/footer.jspf"%>
</div>