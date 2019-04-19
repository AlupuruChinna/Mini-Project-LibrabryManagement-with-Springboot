<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="container" align="center">
    <%@include file="commons/header.jspf"%>
    <%@include file="commons/navigations.jspf"%>

    <h4> Select Member for getting details more..</h4>
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
            <h6>Select Member</h6>
            <table class="table" id="myTable">
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Date of Joined</th>
                    <th>Address</th>
                    <th>Department</th>
                </tr>
                </thead>
                <tbody>

                <c:forEach items="${searchmember}" var="member">
                    <tr>
                        <td><a href="/get-member-details-one?member_name=${member.member_name}"> ${member.member_name}</a></td>
                        <td><fmt:formatDate value="${member.member_joined_date}" pattern="dd-MMM-YYYY"></fmt:formatDate> </td>
                        <td>${member.member_address}</td>
                        <td>${member.member_dept}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>
    </div>
    <%@include file="commons/footer.jspf"%>
