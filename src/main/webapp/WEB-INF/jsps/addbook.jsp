<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="container">
    <%@include file="commons/header.jspf"%>
    <%@include file="commons/navigations.jspf"%>
    <h5><a href="/show-listof-all-books"> Click For Back</a></h5>
    <head>
        <link href="AddBook.css" rel="stylesheet">
    </head>

    <div align="center">

        <section class="get-in-touch">
            <h1 class="title">Add New Book Here</h1>
    <form:form method="post" modelAttribute="book" cssClass="contact-form row">
    <div class="form-field col-lg-6">
        <form:label path="book_name" cssClass="lable">Enter Book Name:</form:label>
        <form:input path="book_name" required="required" cssClass="input-text js-input"></form:input>
    </div>

        <div class="form-field col-lg-6">
            <form:label path="book_authors" cssClass="lable">Enter Book Author Names:</form:label>
            <form:input path="book_authors" type="text" required="required" cssClass="input-text js-input"/>
        </div>

        <div class="form-field col-lg-6">

            <form:label path="book_price">Enter Book Price:</form:label>
            <form:input path="book_price" type="text" required="required" cssClass="input-text js-input"/>

        </div class="form-field col-lg-6">

        <div class="form-field col-lg-6">
            <form:label path="is_book_available">Enter BookDepartment:</form:label>
            <form:input path="book_dept" type="text" required="required" cssClass="input-text js-input"/>

        </div>

        <div class="form-field col-lg-6">
<%--            <form:label path="is_book_available">Enter Book is Available:</form:label>--%>
            <form:input path="is_book_available" type="hidden" required="required" cssClass="input-text js-input"/>
        </div>
          <%--<form:label path="book_published" >Enter Book GettingDate :</form:label>
          <form:input path="book_published" type="date" required="required"/>--%>
        <div class="form-field col-lg-12">
            <input class="submit-btn" type="submit" value="Add Book">
        </div>

    </form:form>
        </section>


        <%@include file="commons/footer.jspf"%>
    </div>
</div>
