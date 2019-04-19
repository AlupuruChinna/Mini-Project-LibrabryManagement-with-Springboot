<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="container">
    <%@include file="commons/header.jspf"%>
    <%@include file="commons/navigations.jspf"%>
    <h5><a href="/show-listof-all-members"> Click For Back</a></h5>
    <head>
        <link href="AddBook.css" rel="stylesheet">
    </head>

    <div align="center">

        <section class="get-in-touch">
            <h1 class="title">Add New Member Here</h1>
            <%--@elvariable id="member" type="com.verinon.lbm.pojos.MemberPojo"--%>
            <form:form method="post" modelAttribute="member" cssClass="contact-form row">
                <div class="form-field col-lg-6">
                    <form:label path="member_name" cssClass="lable">Enter Member Name:</form:label>
                    <form:input path="member_name"  required="required" cssClass="input-text js-input"></form:input>
                </div>

                <div class="form-field col-lg-6">
                    <form:label path="member_address" cssClass="lable">Enter Member Address:</form:label>
                    <form:input path="member_address" type="text" required="required" cssClass="input-text js-input"/>
                </div>

                <div class="form-field col-lg-6">

                    <form:label path="member_phone_number">Enter Member Phone:</form:label>
                    <form:input path="member_phone_number" type="tel" required="required" cssClass="input-text js-input"/>

                </div class="form-field col-lg-6">

                <div class="form-field col-lg-6">
                    <form:label path="member_dept">Enter MemberDepartment:</form:label>
                    <form:input path="member_dept" type="text" required="required" cssClass="input-text js-input"/>

                </div>

                <div class="form-field col-lg-6">

                    <form:label path="member_gender">Gender:</form:label>
                    <form:input path="member_gender" type="text" required="required" cssClass="input-text js-input"/>

                </div class="form-field col-lg-6">

                <div class="form-field col-lg-6">
                    <form:label path="member_age">Age:</form:label>
                    <form:input path="member_age" type="number" required="required" cssClass="input-text js-input"/>

                </div>

                <div class="form-field col-lg-6" deselcted>
                    <%--<form:label path="member_dept">Enter MemberDepartment:</form:label>--%>
                    <form:input path="member_id" type="hidden" required="required" cssClass="input-text js-input" />

                </div>

                <div class="form-field col-lg-6" deselcted>
                    <%--<form:label path="member_dept">Enter MemberDepartment:</form:label>--%>
                    <form:input path="member_fee" type="hidden" required="required" cssClass="input-text js-input"/>

                </div>
               <div class="form-field col-lg-12">
                    <input class="submit-btn" type="submit" value="Add Member">
                </div>

            </form:form>
        </section>


        <%@include file="commons/footer.jspf"%>
    </div>
</div>
