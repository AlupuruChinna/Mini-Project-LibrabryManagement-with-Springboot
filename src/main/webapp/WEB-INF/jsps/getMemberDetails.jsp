<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="container" align="center">
    <%@include file="commons/header.jspf"%>
    <%@include file="commons/navigations.jspf"%>

    <div class="container contact">
        <div class="row">

            <div class="col-md-3" align="center">
                <br>
                <p style="font: medium" align="justify">

                    <strong>Complete Member Details</strong>
                </p>

                <div>
                    <table class="table table-hover">
                        <tr>
                            <h5>
                                <td>Member Id</td>
                                <td>${clickmember.member_id}</td>
                            </h5>
                        </tr>

                        <tr>
                            <h5>
                                <td>Name</td>
                                <td>${clickmember.member_name}</td>
                            </h5>
                        </tr>

                        <tr>
                            <h5>
                                <td>Age</td>
                                <td>${clickmember.member_age}</td>
                            </h5>
                        </tr>

                        <tr>
                            <h5>
                                <td>Gender</td>
                                <td>${clickmember.member_gender}</td>
                            </h5>
                        </tr>

                        <tr>
                            <h5>
                                <td>Address</td>
                                <td>${clickmember.member_address}</td>
                            </h5>
                        </tr>

                        <tr>
                            <h5>
                                <td>Date of Joined</td>
                                <td><fmt:formatDate value="${clickmember.member_joined_date}" pattern="dd-MM-YYYY"></fmt:formatDate> </td>
                            </h5>
                        </tr>

                        <tr>
                            <h5>
                                <td>Member Fee Details</td>
                                <td>${clickmember.member_fee}</td>
                            </h5>
                        </tr>

                        <tr>
                            <h5>
                                <td>Member Fee Phone Number</td>
                                <td>${clickmember.member_phone_number}</td>
                            </h5>
                        </tr>

                        <tr>
                            <h5>
                                <td>Member Department</td>
                                <td>${clickmember.member_dept}</td>
                            </h5>
                        </tr>



                    </table>
                </div>
            </div>

            <div class="col-md-9">
                <div class="contact-info">
                    <br>
                    <img src="/images/businessman-icon-16.jpg" alt="image" height="200" width="200" class="img-circle"/>

                    <h2 style="color: #4cae4c">${clickmember.member_name}</h2>
                    <h4>We would love to hear from you !</h4>
                    <h3 style="color: blue">SmartLibrary, India</h3>
                </div>
            </div>

        </div>
    </div>


</div>
<%@include file="commons/footer.jspf"%>
